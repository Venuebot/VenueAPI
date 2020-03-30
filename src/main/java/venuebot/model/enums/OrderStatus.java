package venuebot.model.enums;

/**
 * Created by Bora U on 02/08/2019.
 */
public enum OrderStatus {
    RECIEVED("RECIEVED"),
    INPROCESS("IN PROCESS"),
    DELIVERED("DELIVERED"),
    READY("READY"),
    SERVED("SERVED"),
    DELAY("DELAY"),
    CANCEL("CANCEL");

    private String orderSt;
    OrderStatus(String orderSt){this.orderSt=orderSt;}
    public String getVal(){return this.orderSt;}

}

