package venuebot.model.order;

import venuebot.model.product.Deal;
import venuebot.model.product.Product;

public class OrderItem {
    // It will be a deal, or a product
    // for example 2 x Big Mac Meal, or 3 x Diet Coke
    // remember Deal itself is combination of products
    Deal deal;
    Product product;

    double price;

    int numberOfOrder;
}
