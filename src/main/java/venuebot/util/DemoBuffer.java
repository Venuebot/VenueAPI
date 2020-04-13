package venuebot.util;

import io.swagger.models.auth.In;
import venuebot.model.CustomerUser;
import venuebot.model.Venue;
import venuebot.model.enums.OrderStatus;
import venuebot.model.product.Deal;
import venuebot.model.product.Product;
import venuebot.model.product.ProductList;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;

public class DemoBuffer {

    public static List<CustomerUser> registeredUsers=new ArrayList<>();
    public static Hashtable<String,CustomerUser> ht_usersByAccessToken=new Hashtable<>();
    public static Hashtable<String,String> ht_accessTokenMAC=new Hashtable<>();

    public static List<Venue> venuesNearBy=new ArrayList<>();
    public static List<Venue> venuesFav=new ArrayList<>();
    public static List<Venue> venuesRecent=new ArrayList<>();
    public static List<Venue> venuesSearch=new ArrayList<>();

    public static Hashtable<Integer,Venue> ht_venues=new Hashtable<>();

    public static Hashtable<Integer,List<ProductList>> ht_products_foods =new Hashtable<>();
    public static Hashtable<Integer,List<ProductList>> ht_products_drinks =new Hashtable<>();
    public static Hashtable<Integer,List<ProductList>> ht_products_desserts =new Hashtable<>();
    public static Hashtable<Integer,List<Deal>> ht_products_deals =new Hashtable<>();

    public static Hashtable<String, OrderStatus> ht_orderStatus=new Hashtable<>();
}
