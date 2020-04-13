package venuebot.model.order;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import venuebot.model.product.*;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ProductItem {

    private String sku;
    private ProductSizeOptions size;
    private ProductPreference preference;
    private ProductSuggestion suggestion;
    private List<AddOnItem> addOns;
    private PromoInfo promotion;
    private int numberOfOrder;



}
