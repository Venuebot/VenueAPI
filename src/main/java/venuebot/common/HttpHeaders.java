package venuebot.common;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class HttpHeaders {
    private String Authorization;
    private String audience;
    private String client_Id;
    private String content_Type;
    private String ip_Address;


}