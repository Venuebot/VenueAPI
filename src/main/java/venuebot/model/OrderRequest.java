package venuebot.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonRootName;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import venuebot.model.enums.OrderType;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@JsonRootName("OrderRequest")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class OrderRequest {
    int venueId;
    int customerId;
    OrderType orderType;
    String tableNo;
    String address;
    //List<OrderItem>

}
