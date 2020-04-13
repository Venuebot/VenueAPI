package venuebot.model.order;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import venuebot.model.product.AddOnItem;
import venuebot.model.product.ProductSizeOptions;
import venuebot.model.product.ProductSuggestion;
import venuebot.model.product.Promotion;

import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class PromoInfo {
    private String name; // Happy hour
    private double price;

}
