package venuebot.model.product;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import venuebot.model.enums.ProductGroups;

import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Product {
    // Mandatory
    private String sku;
    private ProductGroups group; // Food, Drink
    private String subgroup; // **Exception-mandatory degil- FoodsSubGroups or DrinkSubGroups: Soft Drinks, Beers
    private String name;
    private double vatPercentage;
    // Supporting
    private String imgUri; //

    private String descriptionShort;
    private String descriptionLong;
    private String ingredients;
    private String calories;
    private String allergens;
    private String expectedServingTime; // To display user
    private int expectedServingTimeInMins; // To alert venue

    // Scaling: ProductOptions has two fields, unit & price
    // There must be at least 1, but can be multiple as well. Ex: Beer , unit: half pint price : 1 GBP, unit: pint price:1.80
    private List<ProductSizeOptions> sizeOptions; // unit,price kombinasyonlari : 33cl 2.00, 50cl 3

    // Preference: Do you ask any question for  customers to choose ?
    // example : How cooked would you prefer your Steak ?
    //private List<ProductPreferenceChoice> preference; // medium, rare, well done
    ProductPreferenceChoice preference;
    // Add ons: Ketchup, Mayo, sauce
    // example : How cooked would you prefer your Steak ?
    //private List<ProductAddOnChoice> addOns; // medium, rare, well done
    private ProductAddOnChoice addOns; // medium, rare, well done

    // Suggestions : to ask customer at the moment of order if they want to get something else ? such as go large, or side, etc
    // Plan this for later versions.. first to start with 1 suggestion only
    //private List<ProductSuggestion> suggestions;
    ProductSuggestion suggestions;
    // Promotions Different pricing depending on day/time (Happy hour)
    // Promotion class -> name="Happy Hour", List of availability gun, baslangic saati, bitis saati
    // Plan for later versions.. first to start with 1 promotion only
    //private List<Promotion> promotions;
    Promotion promotions;


}