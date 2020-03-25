package venuebot.util;

import venuebot.model.CustomerUser;
import venuebot.model.Venue;

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

}
