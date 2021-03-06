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
        //List<ProductPreferenceChoice> preferences=new ArrayList<>();
        List<String> choicePrefs=new ArrayList<>();
        choicePrefs.add("With ice");
        choicePrefs.add("Without ice");
        ProductPreferenceChoice preferences= ProductPreferenceChoice.builder().choiceOptions(choicePrefs).query("Do you prefer ice?").build();

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
                       // .preference(preferences)
                        .addOns(addOns)
                        .promotions(promotions)
                        .sizeOptions(sizeOptions)
                        .suggestions(suggestions)
                        .build();
    }
    public static Product product2(){
        //List<ProductPreferenceChoice> preferences=new ArrayList<>();
        List<String> choicePrefs=new ArrayList<>();
        choicePrefs.add("With Onion");
        choicePrefs.add("Without Onion");
        ProductPreferenceChoice preferences= ProductPreferenceChoice.builder().choiceOptions(choicePrefs).query("Do you prefer ice?").build();

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
                        .name("Doner Kebap")
                        .allergens("Meat")
                        .calories("400kcal")
                        .descriptionShort("Special cut doner on pitta with sauces")
                        .descriptionLong("Special cut doner on pitta with sauces. Served with Chips and meze")
                        .imgUri("https://merkezlokantasi.com/wp-content/uploads/2018/05/merkez-kebabi.jpg")
                        .ingredients("Lamb, Yoghurt, etc")
                        .sku("2")
                        .vatPercentage(20)
                        .expectedServingTime("10 mins")
                        .expectedServingTimeInMins(20)
                        .group(ProductGroups.FOOD)
                        .subgroup("Meat Foods")
                        //.preference(preferences)
                        .addOns(addOns)
                        .promotions(promotions)
                        .sizeOptions(sizeOptions)
                        .suggestions(suggestions)
                        .build();
    }
    public static Product product3(){
        //List<ProductPreferenceChoice> preferences=new ArrayList<>();
        List<String> choicePrefs=new ArrayList<>();
        choicePrefs.add("Boiled");
        choicePrefs.add("Boiled and fried");
        choicePrefs.add("Raw");
        ProductPreferenceChoice preferences= ProductPreferenceChoice.builder().choiceOptions(choicePrefs).query("How Do you prefer ?").build();

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
                        .name("Lobster")
                        .allergens("sea food")
                        .calories("400kcal")
                        .descriptionShort("Special cut doner on pitta with sauces")
                        .descriptionLong("Special cut doner on pitta with sauces. Served with Chips and meze")
                        .imgUri("https://merkezlokantasi.com/wp-content/uploads/2018/05/merkez-kebabi.jpg")
                        .ingredients("Lamb, Yoghurt, etc")
                        .sku("3")
                        .vatPercentage(20)
                        .expectedServingTime("10 mins")
                        .expectedServingTimeInMins(20)
                        .group(ProductGroups.FOOD)
                        .subgroup("Sea Foods")
                        .preference(preferences)
                        .addOns(addOns)
                        .promotions(promotions)
                        .sizeOptions(sizeOptions)
                        .suggestions(suggestions)
                        .build();
    }
    public static Product product4(){
        //List<ProductPreferenceChoice> preferences=new ArrayList<>();
        List<String> choicePrefs=new ArrayList<>();
        choicePrefs.add("With ice");
        choicePrefs.add("Without ice");
        ProductPreferenceChoice preferences= ProductPreferenceChoice.builder().choiceOptions(choicePrefs).query("Do you prefer ice?").build();

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
                        .name("Grilled Sea Bream")
                        .allergens("Meat")
                        .calories("400kcal")
                        .descriptionShort("Special cut doner on pitta with sauces")
                        .descriptionLong("Special cut doner on pitta with sauces. Served with Chips and meze")
                        .imgUri("https://merkezlokantasi.com/wp-content/uploads/2018/05/merkez-kebabi.jpg")
                        .ingredients("Lamb, Yoghurt, etc")
                        .sku("4")
                        .vatPercentage(20)
                        .expectedServingTime("10 mins")
                        .expectedServingTimeInMins(20)
                        .group(ProductGroups.FOOD)
                        .subgroup("Sea Foods")
                        .preference(preferences)
                        .addOns(addOns)
                        .promotions(promotions)
                        .sizeOptions(sizeOptions)
                        .suggestions(suggestions)
                        .build();
    }

    // Drinks
    public static Product product5(){
        //List<ProductPreferenceChoice> preferences=new ArrayList<>();
        List<String> choicePrefs=new ArrayList<>();
        choicePrefs.add("With ice");
        choicePrefs.add("Without ice");
        ProductPreferenceChoice preferences= ProductPreferenceChoice.builder().choiceOptions(choicePrefs).query("Do you prefer ice?").build();

        List<AddOnItem> addOnItems=new ArrayList<>();
        addOnItems.add(AddOnItem.builder().name("Chips").price(1).build());
        addOnItems.add(AddOnItem.builder().name("Ketchup").price(0).build());
        addOnItems.add(AddOnItem.builder().name("Mayo").price(0).build());
        ProductAddOnChoice addOns=ProductAddOnChoice.builder().query("any sides ?").choiceOptions(addOnItems).build();
        List<ProductSizeOptions> sizeOptions=new ArrayList<>();
        sizeOptions.add(ProductSizeOptions.builder().inStock(true).unit("Medium Glass 200ml").price(10.00).build());
        sizeOptions.add(ProductSizeOptions.builder().inStock(true).unit("Large Glass 400ml").price(16.00).build());
        sizeOptions.add(ProductSizeOptions.builder().inStock(true).unit("Bottle").price(35.00).build());
        //List<ProductSuggestion> suggestions=new ArrayList<>();
        ProductSuggestion suggestions= ProductSuggestion.builder().question("Go large size").priceDifference(2).statement("comes with large chips and coke").build();
        //List<Promotion> promotions=new ArrayList<>();

        Promotion promotions= Promotion.builder().name("Lunch Time Deal").price(18).build();
        return
                Product.builder()
                        .name("Chianti - Red Wine")
                        .descriptionShort("Italian Toscana region")
                        .descriptionLong("Italian Toscana region")
                        .imgUri("https://merkezlokantasi.com/wp-content/uploads/2018/05/merkez-kebabi.jpg")
                        .ingredients("Lamb, Yoghurt, etc")
                        .sku("5")
                        .vatPercentage(20)
                        .expectedServingTime("5 mins")
                        .expectedServingTimeInMins(5)
                        .group(ProductGroups.DRINK)
                        .subgroup("Wines")
                        //.preference(preferences)
                        //.addOns(addOns)
                        //.promotions(promotions)
                        .sizeOptions(sizeOptions)
                        //.suggestions(suggestions)
                        .build();
    }
    public static Product product6(){
        //List<ProductPreferenceChoice> preferences=new ArrayList<>();
        List<String> choicePrefs=new ArrayList<>();
        choicePrefs.add("With ice");
        choicePrefs.add("Without ice");
        ProductPreferenceChoice preferences= ProductPreferenceChoice.builder().choiceOptions(choicePrefs).query("Do you prefer ice?").build();

        List<AddOnItem> addOnItems=new ArrayList<>();
        addOnItems.add(AddOnItem.builder().name("Chips").price(1).build());
        addOnItems.add(AddOnItem.builder().name("Ketchup").price(0).build());
        addOnItems.add(AddOnItem.builder().name("Mayo").price(0).build());
        ProductAddOnChoice addOns=ProductAddOnChoice.builder().query("any sides ?").choiceOptions(addOnItems).build();
        List<ProductSizeOptions> sizeOptions=new ArrayList<>();
        sizeOptions.add(ProductSizeOptions.builder().inStock(true).unit("1 glass").price(10.00).build());
        //List<ProductSuggestion> suggestions=new ArrayList<>();
        ProductSuggestion suggestions= ProductSuggestion.builder().question("buy 1 get 2nd half price").priceDifference(5).statement("").build();
        //List<Promotion> promotions=new ArrayList<>();

        Promotion promotions= Promotion.builder().name("Lunch Time Deal").price(18).build();
        return
                Product.builder()
                        .name("Porn Star Martini")
                        .descriptionShort("Porn star martini with Pomegranate")
                        .descriptionLong("Porn star martini with Pomegranate")
                        .imgUri("https://merkezlokantasi.com/wp-content/uploads/2018/05/merkez-kebabi.jpg")
                        .ingredients("Pomegranate, Martini, Gin")
                        .sku("6")
                        .vatPercentage(20)
                        .expectedServingTime("10 mins")
                        .expectedServingTimeInMins(10)
                        .group(ProductGroups.DRINK)
                        .subgroup("Cocktails")
                        .preference(preferences)
                        //.addOns(addOns)
                        //.promotions(promotions)
                        .sizeOptions(sizeOptions)
                        .suggestions(suggestions)
                        .build();
    }
    public static Product product7(){
        //List<ProductPreferenceChoice> preferences=new ArrayList<>();
        List<String> choicePrefs=new ArrayList<>();
        choicePrefs.add("With ice");
        choicePrefs.add("Without ice");
        ProductPreferenceChoice preferences= ProductPreferenceChoice.builder().choiceOptions(choicePrefs).query("Do you prefer ice?").build();

        List<AddOnItem> addOnItems=new ArrayList<>();
        addOnItems.add(AddOnItem.builder().name("Chips").price(1).build());
        addOnItems.add(AddOnItem.builder().name("Ketchup").price(0).build());
        addOnItems.add(AddOnItem.builder().name("Mayo").price(0).build());
        ProductAddOnChoice addOns=ProductAddOnChoice.builder().query("any sides ?").choiceOptions(addOnItems).build();
        List<ProductSizeOptions> sizeOptions=new ArrayList<>();
        sizeOptions.add(ProductSizeOptions.builder().inStock(true).unit("1 glass").price(10.00).build());
        //List<ProductSuggestion> suggestions=new ArrayList<>();
        ProductSuggestion suggestions= ProductSuggestion.builder().question("buy 1 get 2nd half price").priceDifference(5).statement("").build();
        //List<Promotion> promotions=new ArrayList<>();

        Promotion promotions= Promotion.builder().name("Lunch Time Deal").price(18).build();
        return
                Product.builder()
                        .name("Mojito")
                        .descriptionShort("Mojito")
                        .descriptionLong("Mojito")
                        .imgUri("https://merkezlokantasi.com/wp-content/uploads/2018/05/merkez-kebabi.jpg")
                        .sku("7")
                        .vatPercentage(20)
                        .expectedServingTime("10 mins")
                        .expectedServingTimeInMins(10)
                        .group(ProductGroups.DRINK)
                        .subgroup("Cocktails")
                        //.preference(preferences)
                        //.addOns(addOns)
                        //.promotions(promotions)
                        .sizeOptions(sizeOptions)
                        //.suggestions(suggestions)
                        .build();
    }

    // Desserts
    public static Product product8(){
        //List<ProductPreferenceChoice> preferences=new ArrayList<>();
        List<String> choicePrefs=new ArrayList<>();
        choicePrefs.add("With ice");
        choicePrefs.add("Without ice");
        ProductPreferenceChoice preferences= ProductPreferenceChoice.builder().choiceOptions(choicePrefs).query("Do you prefer ice?").build();

        List<AddOnItem> addOnItems=new ArrayList<>();
        addOnItems.add(AddOnItem.builder().name("Chips").price(1).build());
        addOnItems.add(AddOnItem.builder().name("Ketchup").price(0).build());
        addOnItems.add(AddOnItem.builder().name("Mayo").price(0).build());
        ProductAddOnChoice addOns=ProductAddOnChoice.builder().query("any sides ?").choiceOptions(addOnItems).build();
        List<ProductSizeOptions> sizeOptions=new ArrayList<>();
        sizeOptions.add(ProductSizeOptions.builder().inStock(true).unit("slice").price(2.00).build());
        //List<ProductSuggestion> suggestions=new ArrayList<>();
        ProductSuggestion suggestions= ProductSuggestion.builder().question("Go large size").priceDifference(2).statement("comes with large chips and coke").build();
        //List<Promotion> promotions=new ArrayList<>();

        Promotion promotions= Promotion.builder().name("Lunch Time Deal").price(18).build();
        return
                Product.builder()
                        .name("Victorian Cake")
                        //.descriptionShort("Italian Toscana region")
                        //.descriptionLong("Italian Toscana region")
                        .imgUri("https://merkezlokantasi.com/wp-content/uploads/2018/05/merkez-kebabi.jpg")
                        //.ingredients("Lamb, Yoghurt, etc")
                        .sku("8")
                        .vatPercentage(20)
                        .expectedServingTime("5 mins")
                        .expectedServingTimeInMins(5)
                        .group(ProductGroups.DESSERT)
                        .subgroup("Cakes")
                        //.preference(preferences)
                        //.addOns(addOns)
                        //.promotions(promotions)
                        .sizeOptions(sizeOptions)
                        //.suggestions(suggestions)
                        .build();
    }
    public static Product product9(){
        List<ProductPreferenceChoice> preferences=new ArrayList<>();

        List<AddOnItem> addOnItems=new ArrayList<>();
        addOnItems.add(AddOnItem.builder().name("Chips").price(1).build());
        addOnItems.add(AddOnItem.builder().name("Ketchup").price(0).build());
        addOnItems.add(AddOnItem.builder().name("Mayo").price(0).build());
        ProductAddOnChoice addOns=ProductAddOnChoice.builder().query("any sides ?").choiceOptions(addOnItems).build();
        List<ProductSizeOptions> sizeOptions=new ArrayList<>();
        sizeOptions.add(ProductSizeOptions.builder().inStock(true).unit("Normal slice").price(3.00).build());
        sizeOptions.add(ProductSizeOptions.builder().inStock(true).unit("Big slice").price(5.00).build());
        //List<ProductSuggestion> suggestions=new ArrayList<>();
        ProductSuggestion suggestions= ProductSuggestion.builder().question("Go large size").priceDifference(2).statement("comes with large chips and coke").build();
        //List<Promotion> promotions=new ArrayList<>();

        Promotion promotions= Promotion.builder().name("Lunch Time Deal").price(18).build();
        return
                Product.builder()
                        .name("Carrot Cake")
                        //.descriptionShort("Italian Toscana region")
                        //.descriptionLong("Italian Toscana region")
                        .imgUri("https://merkezlokantasi.com/wp-content/uploads/2018/05/merkez-kebabi.jpg")
                        //.ingredients("Lamb, Yoghurt, etc")
                        .allergens("nuts")
                        .sku("9")
                        .vatPercentage(20)
                        .expectedServingTime("5 mins")
                        .expectedServingTimeInMins(5)
                        .group(ProductGroups.DESSERT)
                        .subgroup("Cakes")
                        //.preference(preferences)
                        //.addOns(addOns)
                        //.promotions(promotions)
                        .sizeOptions(sizeOptions)
                        //.suggestions(suggestions)
                        .build();
    }
    public static Product product10(){
        List<ProductPreferenceChoice> preferences=new ArrayList<>();

        List<AddOnItem> addOnItems=new ArrayList<>();
        addOnItems.add(AddOnItem.builder().name("hazelnut pieces").price(1).build());
        addOnItems.add(AddOnItem.builder().name("extra chocoloate").price(1).build());

        ProductAddOnChoice addOns=ProductAddOnChoice.builder().query("any sides ?").choiceOptions(addOnItems).build();
        List<ProductSizeOptions> sizeOptions=new ArrayList<>();
        sizeOptions.add(ProductSizeOptions.builder().inStock(true).unit("").price(3.00).build());

        //List<ProductSuggestion> suggestions=new ArrayList<>();
        ProductSuggestion suggestions= ProductSuggestion.builder().question("Go large size").priceDifference(2).statement("comes with large chips and coke").build();
        //List<Promotion> promotions=new ArrayList<>();

        Promotion promotions= Promotion.builder().name("Lunch Time Deal").price(18).build();
        return
                Product.builder()
                        .name("Cornetto")
                        //.descriptionShort("Italian Toscana region")
                        //.descriptionLong("Italian Toscana region")
                        .imgUri("https://merkezlokantasi.com/wp-content/uploads/2018/05/merkez-kebabi.jpg")
                        //.ingredients("Lamb, Yoghurt, etc")
                        .sku("10")
                        .vatPercentage(20)
                        .expectedServingTime("5 mins")
                        .expectedServingTimeInMins(5)
                        .group(ProductGroups.DESSERT)
                        .subgroup("Ice Creams")
                        //.preference(preferences)
                        .addOns(addOns)
                        //.promotions(promotions)
                        .sizeOptions(sizeOptions)
                        //.suggestions(suggestions)
                        .build();
    }
}
