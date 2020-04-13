package venuebot.service;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Service;
import venuebot.model.*;
import venuebot.model.enums.OrderStatus;
import venuebot.util.DemoBuffer;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class OrderServ {


       public OrderResponse order(OrderRequest req){

           OrderResponse response=OrderResponse.builder().msgFromVenue("").build();
           String orderId=UUID.randomUUID().toString();
           response.setOrderId(orderId);
           DemoBuffer.ht_orderStatus.put(orderId, OrderStatus.RECEIVED);
           return response;
       }

    public OrderStatusResponse orderStatus(String req){

        OrderStatusResponse response= OrderStatusResponse.builder().msgFromVenue("").orderId(req).build();

        if(DemoBuffer.ht_orderStatus.containsKey(req)){
           OrderStatus status= DemoBuffer.ht_orderStatus.get(req);
           switch (status)
           {
               case RECEIVED:DemoBuffer.ht_orderStatus.put(req,OrderStatus.INPROCESS);break;
               case INPROCESS:
                   break;
               case DELIVERED:
                   break;
               case READY:
                   break;
               case SERVED:
                   break;
               case DELAY:
                   break;
               case CANCEL:
                   break;

           }

            response.setOrderStatus(status);
        }
        else{
              response.setOrderStatus(OrderStatus.NOTFOUND);
        }

        return response;
    }



    }
