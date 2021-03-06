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
@JsonRootName("AuthRequest")
@JsonInclude(JsonInclude.Include.NON_NULL)
//@JsonPropertyOrder({ "name", "id" })
//@JsonPropertyOrder(alphabetic=true)
public class AuthRequest {

	private String otp;
	private String mac;
	private String ip;
	private LoginTypes loginType;
	private LoginDevice loginDevice;

}
