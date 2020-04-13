package venuebot.temp;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import venuebot.model.OrderRequest;
import venuebot.model.enums.OrderType;
import venuebot.model.order.ProductItem;
import venuebot.model.order.ProductPreference;
import venuebot.model.order.PromoInfo;
import venuebot.model.product.AddOnItem;
import venuebot.model.product.ProductSizeOptions;
import venuebot.model.product.ProductSuggestion;

import java.util.ArrayList;
import java.util.List;

public class tempOrder {
    static List<ProductItem> list;
    public static void main(String[] args) throws JsonProcessingException {
        list=new ArrayList<>();
        list.add(productItem1());

        ObjectMapper mapper = new ObjectMapper();
        String str=mapper.writerWithDefaultPrettyPrinter().writeValueAsString(order1());
        System.out.println(str);
    }
    public static OrderRequest order1(){

       return OrderRequest.builder().customerId(1)
                .tableNo("122")
                .orderType(OrderType.TABLE)
                .products(list)
                .venueId(1)
                .build();
    }
    public static OrderRequest order2(){
        return OrderRequest.builder().customerId(1)
                .orderType(OrderType.PREORDER)
                .products(list)
                .venueId(1)
                .build();
    }
    public static OrderRequest order3(){
        return OrderRequest.builder().customerId(1)
                .orderType(OrderType.TAKEAWAY)
                .products(list)
                .venueId(1)
                .build();
    }
    public static OrderRequest order4(){
        return OrderRequest.builder().customerId(1)
                .address("28 Kenilworth Court")
                .orderType(OrderType.DELIVERY)
                .products(list)
                .venueId(1)
                .build();
    }

    public static ProductItem productItem1(){
        List<AddOnItem> addOnsList=new ArrayList<>();
        addOnsList.add(AddOnItem.builder().name("Chips").price(1.0).build());
        addOnsList.add(AddOnItem.builder().name("Ketchup").price(0.0).build());
        return ProductItem.builder().numberOfOrder(2)
                .sku("1")
                .size(ProductSizeOptions.builder().unit("1 Portion").price(24).build())
                .preference(ProductPreference.builder().question("How cooked?").choice("medium").build())
                .suggestion(ProductSuggestion.builder().question("").statement("").priceDifference(2).build())
                .addOns(addOnsList)
                .promotion(PromoInfo.builder().name("Lunch Time Deal").price(18).build())
                .build();
    }

}
