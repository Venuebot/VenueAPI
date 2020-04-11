package venuebot.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import venuebot.model.product.Deal;
import venuebot.model.product.Product;


@JsonInclude(JsonInclude.Include.NON_NULL)
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class OrderItem {
    // It will be a deal, or a product
    // for example 2 x Big Mac Meal, or 3 x Diet Coke
    // remember Deal itself is combination of products
    Deal deal;
    Product product;
    int numberOfOrder;

}