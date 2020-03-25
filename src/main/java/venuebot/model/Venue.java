package venuebot.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonRootName;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@JsonRootName("Venue")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Venue {
    private int venueId;
    private String name;
    private String address;
    private double distance;
    private String distanceUnit;
    private String imgUri;
}
