package venuebot.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonRootName;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import venuebot.model.enums.LoginDevice;
import venuebot.model.enums.LoginTypes;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@JsonRootName("LoginRequest")
@JsonInclude(JsonInclude.Include.NON_NULL)
//@JsonPropertyOrder({ "name", "id" })
//@JsonPropertyOrder(alphabetic=true)
public class LoginResponse {
    ///
    /// 2-
    /**
     * 100 - An error happened, see responseString
     * 200 - Login Request is received. ( User will be notified by text or email)
     * 201 - Success , see responseString for the accessToken, and full customer data is returned
     */
    private int responseCode;
    private String responseString;
    private CustomerUser user;

}
