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
@JsonRootName("GetMenueRequest")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class GetMenueRequest {
    int venueId;
}
