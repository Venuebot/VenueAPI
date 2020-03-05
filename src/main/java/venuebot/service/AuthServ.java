package venuebot.service;


import org.springframework.stereotype.Service;
import venuebot.model.LoginRequest;
import venuebot.model.LoginResponse;
import venuebot.model.RegisterRequest;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class AuthServ {

    public LoginResponse initiateLogin(LoginRequest request){

        return LoginResponse.builder().responseCode(100).responseString("a101xy").build();
    }
    public LoginResponse register(RegisterRequest request){

        return LoginResponse.builder().responseCode(100).responseString("a101xy").build();
    }
    public LoginResponse validateAccessToken(String accessToken){

        return LoginResponse.builder().responseCode(200).responseString("a101xy").build();
    }




}
