package venuebot.model.product;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ProductSuggestion {

    private String question; // Do you want to go large ? , or Do you want to add salad ?
    private String statement; // comes with large chips and coke
    private double priceDifference; // 2.20GBP
    private String sku; // Suggestion id

}
