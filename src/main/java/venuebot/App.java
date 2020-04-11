package venuebot;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import springfox.documentation.swagger2.annotations.EnableSwagger2;
import venuebot.model.Venue;
import venuebot.model.product.Product;
import venuebot.model.product.ProductList;
import venuebot.temp.tempGeneral;
import venuebot.util.DemoBuffer;

/// This is the main Spring Boot application - converted into web servlet to make it web app deployable
@SpringBootApplication
@EnableSwagger2
@ComponentScan("venuebot")
public class App  {
    static Logger logger = LoggerFactory.getLogger(App.class);
    public static void main(String[] args) throws InterruptedException  {
        ApplicationContext context = SpringApplication.run(App.class, args);
        logger.info("Venuebot Services started "+LocalDateTime.now());
        initVenueLists();
        initVenueMenu();
        Thread.sleep(50000);
    }

    private static void initVenueLists(){
       // initialize the venues
        DemoBuffer.ht_venues.put(1,new Venue(1,"A Bar","120 Moorgate, London EC2M 1A",0.1,"miles","https://merkezlokantasi.com/wp-content/uploads/2018/05/merkez-logo-2.png","headerImgUri"));
        DemoBuffer.ht_venues.put(2,new Venue(2,"B Restaurant","122 Moorgate, London EC2M 1A",0.1,"miles","https://merkezlokantasi.com/wp-content/uploads/2018/05/merkez-logo-2.png","headerImgUri"));
        DemoBuffer.ht_venues.put(3,new Venue(3,"C Hotel","140 Moorgate, London EC2M 1A",0.2,"miles","","headerImgUri"));
        DemoBuffer.ht_venues.put(4,new Venue(4,"Z PUB","162 Moorgate, London EC2M 1A",0.3,"miles","https://merkezlokantasi.com/wp-content/uploads/2018/05/merkez-logo-2.png","headerImgUri"));
        DemoBuffer.ht_venues.put(5,new Venue(5,"Generator Bar - Moorgate","184 Moorgate, London EC2M 1A",0.4,"miles","","headerImgUri"));
        DemoBuffer.ht_venues.put(6,new Venue(6,"Wonders of the World Cafes - Liecester","183 Moorgate, London EC2M 1A",0.4,"miles","https://merkezlokantasi.com/wp-content/uploads/2018/05/merkez-logo-2.png","headerImgUri"));
        DemoBuffer.ht_venues.put(7,new Venue(7,"A Bar(Bank)","120 Moorgate, London EC2M 1A",0.1,"miles","","headerImgUri"));
        DemoBuffer.ht_venues.put(8,new Venue(8,"B Restaurant(Oxford)","122 Moorgate, London EC2M 1A",0.1,"miles","","headerImgUri"));
        DemoBuffer.ht_venues.put(9,new Venue(9,"C Hotel(Cambridge)","140 Moorgate, London EC2M 1A",0.2,"miles","","headerImgUri"));
        DemoBuffer.ht_venues.put(10,new Venue(10,"ZzZ PUB","162 Moorgate, London EC2M 1A",0.3,"miles","","headerImgUri"));
        DemoBuffer.ht_venues.put(11,new Venue(11,"Waffle Cafe","184 Moorgate, London EC2M 1A",0.4,"miles","","headerImgUri"));
        DemoBuffer.ht_venues.put(12,new Venue(12,"yeni ay balik","183 Moorgate, London EC2M 1A",0.4,"miles","","headerImgUri"));

    }
    private static void initVenueMenu(){
        // Foods
        List<Product> list=new ArrayList<>();
        list.add(tempGeneral.product1());
        list.add(tempGeneral.product2());
        List<Product> list2=new ArrayList<>();
        list2.add(tempGeneral.product3());
        list2.add(tempGeneral.product4());
        List<ProductList> lists_subGroup1=new ArrayList<>();
        lists_subGroup1.add(new ProductList("Meat Foods",list));
        lists_subGroup1.add(new ProductList("Sea Foods",list2));
        DemoBuffer.ht_products_foods.put(1,lists_subGroup1);

        // Drinks
        List<Product> list_b=new ArrayList<>();
        list_b.add(tempGeneral.product5());

        List<Product> list2_b=new ArrayList<>();
        list2_b.add(tempGeneral.product6());
        list2_b.add(tempGeneral.product7());

        List<ProductList> lists_subGroup1_b=new ArrayList<>();
        lists_subGroup1_b.add(new ProductList("Wines",list_b));
        lists_subGroup1_b.add(new ProductList("Cocktails",list2_b));
        DemoBuffer.ht_products_drinks.put(1,lists_subGroup1_b);

        // Desserts
        List<Product> list_c=new ArrayList<>();
        list_c.add(tempGeneral.product8());
        list_c.add(tempGeneral.product9());
        List<Product> list2_c=new ArrayList<>();
        list2_c.add(tempGeneral.product10());

        List<ProductList> lists_subGroup1_c=new ArrayList<>();
        lists_subGroup1_c.add(new ProductList("Cakes",list_c));
        lists_subGroup1_c.add(new ProductList("Ice Creams",list2_c));
        DemoBuffer.ht_products_desserts.put(1,lists_subGroup1_c);

    }

}
