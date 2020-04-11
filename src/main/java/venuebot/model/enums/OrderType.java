package venuebot.model.enums;

/**
 * Created by Bora U on 02/08/2019.
 */
public enum OrderType {
    TABLE("TABLE"),
    TAKEAWAY("TAKEAWAY"),
    DELIVERY("DELIVERY"),
    PREORDER("PREORDER");

    private String orderType;
    OrderType(String orderSt){this.orderType =orderSt;}
    public String getVal(){return this.orderType;}

}

