package venuebot.temp;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import venuebot.model.GetVenueListRequest;
import venuebot.model.enums.ProductGroups;
import venuebot.model.product.*;

import java.util.ArrayList;
import java.util.List;

public class tempGeneral {
    public static void main(String[] args) throws JsonProcessingException {
        printGetVenuesRequest();
    }
    private static void printGetVenuesRequest() throws JsonProcessingException {
        GetVenueListRequest request=GetVenueListRequest.builder().x(12).y(14).z(25).build();

        ObjectMapper mapper = new ObjectMapper();
        String str=mapper.writerWithDefaultPrettyPrinter().writeValueAsString(request);
        System.out.println(str);
    }

    public static List<Product> getMenuList1(){
        List<Product> list=new ArrayList<>();
        list.add(product1());
        return list;
    }
    public static Product product1(){
        List<ProductPreferenceChoice> preferences=new ArrayList<>();

            List<AddOnItem> addOnItems=new ArrayList<>();
            addOnItems.add(AddOnItem.builder().name("Chips").price(1).build());
            addOnItems.add(AddOnItem.builder().name("Ketchup").price(0).build());
            addOnItems.add(AddOnItem.builder().name("Mayo").price(0).build());
        ProductAddOnChoice addOns=ProductAddOnChoice.builder().query("any sides ?").choiceOptions(addOnItems).build();
        List<ProductSizeOptions> sizeOptions=new ArrayList<>();
            sizeOptions.add(ProductSizeOptions.builder().inStock(true).unit("1 Portion").price(20.00).build());
            sizeOptions.add(ProductSizeOptions.builder().inStock(true).unit("1.5 Portion").price(24.00).build());
        //List<ProductSuggestion> suggestions=new ArrayList<>();
        ProductSuggestion suggestions= ProductSuggestion.builder().question("Go large size").priceDifference(2).statement("comes with large chips and coke").build();
        //List<Promotion> promotions=new ArrayList<>();

        Promotion promotions= Promotion.builder().name("Lunch Time Deal").price(18).build();
        return
                Product.builder()
                        .name("Iskender Kebap")
                        .allergens("Meat")
                        .calories("400kcal")
                        .descriptionShort("Special cut doner on pitta with sauces")
                        .descriptionLong("Special cut doner on pitta with sauces. Served with Chips and meze")
                        .imgUri("https://merkezlokantasi.com/wp-content/uploads/2018/05/merkez-kebabi.jpg")
                        .ingredients("Lamb, Yoghurt, etc")
                        .sku("1")
                        .vatPercentage(20)
                        .expectedServingTime("10 mins")
                        .expectedServingTimeInMins(20)
                        .group(ProductGroups.FOOD)
                        .subgroup("Meat Foods")
                        .preference(preferences)
                        .addOns(addOns)
                        .promotions(promotions)
                        .sizeOptions(sizeOptions)
                        .suggestions(suggestions)
                        .build();
    }
    private static Product product2(){
        return
                Product.builder().build();
    }
    private static Product product3(){
        return
                Product.builder().build();
    }
    private static Product product4(){
        return
                Product.builder().build();
    }
    private static Product product5(){
        return
                Product.builder().build();
    }
}
