package venuebot.util;

import venuebot.model.CustomerUser;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;

public class DemoBuffer {

    public static List<CustomerUser> registeredUsers=new ArrayList<>();
    public static Hashtable<String,CustomerUser> ht_usersByAccessToken=new Hashtable<>();
    public static Hashtable<String,String> ht_accessTokenMAC=new Hashtable<>();

}
