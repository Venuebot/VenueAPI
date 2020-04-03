package venuebot.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonRootName;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import venuebot.model.product.Deal;
import venuebot.model.product.Product;
import venuebot.model.product.ProductList;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@JsonRootName("GetMenuResponse")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class GetMenuResponse {
    private Venue venue;
    private List<ProductList> foodsList;
    private List<ProductList> drinksList;
    private List<ProductList> dessertsList;
    private List<Deal> dealsList;
}
