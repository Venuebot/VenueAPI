package venuebot.api;

import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import venuebot.model.*;
import venuebot.model.enums.OrderStatus;
import venuebot.service.OrderServ;

@RestController
@Api(value="/order",description="General Queries Service",produces ="application/json")
@RequestMapping(value="/order")
public class OrderService {

    @Autowired
    OrderServ service;

    @RequestMapping(value="/order",method= RequestMethod.POST)
    public ResponseEntity<OrderResponse> order(@RequestBody OrderRequest request)  {
        OrderResponse response=service.order(request);
        return new ResponseEntity<OrderResponse>(response, HttpStatus.OK);
    }

    @RequestMapping(value="/OrderStatus/{orderId}",method= RequestMethod.GET)
    public ResponseEntity<OrderStatusResponse> getOrderStatus(@PathVariable("orderId") String orderId)  {
        OrderStatusResponse response=service.orderStatus(orderId);
        return new ResponseEntity<OrderStatusResponse>(response, HttpStatus.OK);
    }

}
