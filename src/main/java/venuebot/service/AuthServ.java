package venuebot.service;


import org.springframework.stereotype.Service;
import venuebot.model.*;
import venuebot.model.enums.RespondCodes;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

import static venuebot.util.DemoBuffer.*;

@Service
public class AuthServ {

    public LoginResponse initiateLogin(LoginRequest request){
        String accessToken=UUID.randomUUID().toString();
        CustomerUser user=searchUser(request.getEmail(),request.getPhone());
        if(null!=user) { // user exists in DB
            ht_usersByAccessToken.put(accessToken,user);
            return LoginResponse.builder().responseCode(RespondCodes.SUCCESS.getCode()).accessToken(accessToken).build();
        }
        else{ // user doesn't exist
            return LoginResponse.builder().responseCode(RespondCodes.ERROR.getCode()).responseText("User does not exist").build();
        }
    }
    public LoginResponse register(RegisterRequest request){
        String accessToken=UUID.randomUUID().toString();
        CustomerUser user=searchUser(request.getUser().getEmail(),request.getUser().getPhone());
        if(null!=user) {
            return LoginResponse.builder().responseCode(RespondCodes.ERROR.getCode()).responseText("User already registered").build();
        }
        else{ // user doesn't exist
            if(validUserData(request.getUser())){
                registeredUsers.add(request.getUser());
                ht_usersByAccessToken.put(accessToken,request.getUser());
                //ht_accessTokenMAC.put(accessToken,request.getMac());
                return LoginResponse.builder().responseCode(RespondCodes.SUCCESS.getCode()).accessToken(accessToken).build();
            }
            else{ // Mandatory fields are missing
                return LoginResponse.builder().responseCode(RespondCodes.ERROR.getCode()).responseText("Mandatory fields Phone, Email, Name").build();
            }

        }
    }
    public AuthResponse validateAccessToken(AuthRequest req,String accessToken) {


            if (ht_usersByAccessToken.containsKey(accessToken)) {

                    CustomerUser user = ht_usersByAccessToken.get(accessToken);
                    switch(req.getOtp()){
                        // auto
                        case "*11***":
                            if (ht_accessTokenMAC.get(accessToken).equals(req.getMac())) {
                                return AuthResponse.builder().responseCode(RespondCodes.SUCCESS.getCode()).user(user).build();
                            }else{
                                return AuthResponse.builder().responseCode(RespondCodes.ERROR.getCode()).responseText("mac vs access token mismatch").build();
                            }

                        // by OTP
                        case "112233":
                            ht_accessTokenMAC.put(accessToken,req.getMac());
                            return AuthResponse.builder().responseCode(RespondCodes.SUCCESS.getCode()).user(user).build();

                        default:
                            return AuthResponse.builder().responseCode(RespondCodes.ERROR.getCode()).responseText("wrong OTP").build();
                    }

                }

            else { // access token is not valid
                return AuthResponse.builder().responseCode(RespondCodes.ERROR.getCode()).responseText("Access Token is not valid").build();
            }

    }

    // Private methods
    private CustomerUser searchUser(String email,String phone){

        if(null!=email){
            Optional<CustomerUser> user=registeredUsers.stream().filter(u->u.getEmail().equals(email)).findAny();
            if(!user.isPresent()) return null;
            return user.get();
        }
        else{
            Optional<CustomerUser> user=registeredUsers.stream().filter(u->u.getPhone().equals(phone)).findAny();
            if(!user.isPresent()) return null;
            return user.get();
        }
    }

    private boolean validUserData(CustomerUser user){
        if(null!=user.getEmail() && !user.getEmail().contains("@")) return false;
        if(null!=user.getPhone() && user.getPhone().length()<3) return false;
        if(null!=user.getName() && user.getName().length()<2) return false;
        return true;
    }




}
