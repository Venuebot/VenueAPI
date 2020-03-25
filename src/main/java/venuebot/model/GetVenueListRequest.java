package venuebot.model;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonRootName;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@JsonRootName("VenueListRequest")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class GetVenueListRequest {
    private int venueId;
    private int x;
    private int y;
    private int z;
}
