package venuebot.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonRootName;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import venuebot.model.product.Deal;
import venuebot.model.product.Product;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@JsonRootName("GetMenuResponse")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class GetMenuResponse {
    private Venue venue;
    private List<Product> foodsList;
    private List<Product> drinksList;
    private List<Product> dessertsList;
    private List<Deal> dealsList;
}
