package venuebot.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonRootName;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import venuebot.model.enums.Gender;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@JsonRootName("CustomerUser")
@JsonInclude(JsonInclude.Include.NON_NULL)
//@JsonPropertyOrder({ "name", "id" })
//@JsonPropertyOrder(alphabetic=true)
public class CustomerUser {
    private String name;
    private String lastName;
    private String knownAs;
    private String email;
    private String phone;
    private Gender gender;
    private int dobYear;
    private int dobMonth;
    private int dobDay;
}
