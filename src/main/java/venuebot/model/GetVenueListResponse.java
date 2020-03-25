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
@JsonRootName("VenueListResponse")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class GetVenueListResponse {

private List<Venue> venuesNearBy;
private List<Venue> venuesFav;
private List<Venue> venuesRecents;
private List<Venue> venuesSearch;

}
