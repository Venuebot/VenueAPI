package venuebot.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonRootName;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import venuebot.model.enums.OrderType;
import venuebot.model.order.DealItem;
import venuebot.model.order.ProductItem;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@JsonRootName("OrderRequest")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class OrderResponse {
    String orderId;
    String msgFromVenue;

}
