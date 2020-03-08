package venuebot.temp;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import venuebot.model.AuthRequest;
import venuebot.model.CustomerUser;
import venuebot.model.LoginRequest;
import venuebot.model.RegisterRequest;
import venuebot.model.enums.Gender;
import venuebot.model.enums.LoginDevice;
import venuebot.model.enums.LoginTypes;

public class tempAuth {

    public static void main(String[] args) throws JsonProcessingException {
        loginRequest_byEmail();
        loginRequest_byPhone();
        registerUser();
        authRequest();
    }

    private static void registerUser() throws JsonProcessingException {

        RegisterRequest request=RegisterRequest.builder()
                .user(CustomerUser.builder().name("Bora").lastName("Uzun").email("bora@borauzun.net").phone("+447856874102").gender(Gender.MALE).dobDay(6).dobMonth(3).dobYear(1979).knownAs("Bora").build())
                .mac("a28:89")
                .loginDevice(LoginDevice.MOBILE)
                .loginType(LoginTypes.CUSTOMER).build();

        ObjectMapper mapper = new ObjectMapper();
        String str=mapper.writerWithDefaultPrettyPrinter().writeValueAsString(request);
        System.out.println(str);
    }
    private static void loginRequest_byEmail() throws JsonProcessingException {
        LoginRequest request= LoginRequest.builder().email("bora@borauzun.net")
                .mac("a28:89")
                .loginDevice(LoginDevice.MOBILE)
                .loginType(LoginTypes.CUSTOMER)
                .build();

        ObjectMapper mapper = new ObjectMapper();
        String str=mapper.writerWithDefaultPrettyPrinter().writeValueAsString(request);
        System.out.println(str);

    }
    private static void loginRequest_byPhone() throws JsonProcessingException {
        LoginRequest request= LoginRequest.builder().phone("+447856874102")
                .mac("a28:89")
                .loginDevice(LoginDevice.MOBILE)
                .loginType(LoginTypes.CUSTOMER)
                .build();

        ObjectMapper mapper = new ObjectMapper();
        String str=mapper.writerWithDefaultPrettyPrinter().writeValueAsString(request);
        System.out.println(str);
    }

    private static void authRequest() throws JsonProcessingException {
        AuthRequest request= AuthRequest.builder()
                .mac("a28:89")
                .otp("112233")
                .loginDevice(LoginDevice.MOBILE)
                .loginType(LoginTypes.CUSTOMER)
                .build();

        ObjectMapper mapper = new ObjectMapper();
        String str=mapper.writerWithDefaultPrettyPrinter().writeValueAsString(request);
        System.out.println(str);
    }
}
