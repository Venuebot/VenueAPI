package venuebot.model.product;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ProductPreferenceChoice {
    // *******
    private String query; // how cooked do you prefer your steak ?
    private List<String> choiceOptions; // Rare , Medium

}
