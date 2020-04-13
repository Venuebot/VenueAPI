package venuebot.api;

import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import venuebot.model.*;
import venuebot.model.product.Product;
import venuebot.service.GeneralServ;
import venuebot.util.DemoBuffer;

import java.util.ArrayList;
import java.util.List;

@RestController
@Api(value="/general",description="General Queries Service",produces ="application/json")
@RequestMapping(value="/general")
public class GeneralQueriesService {

    @Autowired
    GeneralServ service;

    @RequestMapping(value="/getVenues",method= RequestMethod.PUT)
    public ResponseEntity<GetVenueListResponse> loginInitiated(@RequestBody GetVenueListRequest request)  {
        GetVenueListResponse response=service.getVenueListResponse(request);
        return new ResponseEntity<GetVenueListResponse>(response, HttpStatus.OK);
    }

    @RequestMapping(value="/getMenu/{venueId}",method= RequestMethod.GET)
    public ResponseEntity<GetMenuResponse> getMenu(@PathVariable("venueId") int venueId)  {
        GetMenuResponse response=service.getMenuResponse(venueId);
        return new ResponseEntity<GetMenuResponse>(response, HttpStatus.OK);
    }
    @RequestMapping(value="/confirmItemStock/{venueId}/{sku}",method= RequestMethod.GET)
    public ResponseEntity<Boolean> confirmItemStock(@PathVariable("venueId") String venueId,@PathVariable("sku") String sku)  {
        Boolean response=true;
        if(sku.equals("2")) {response=false;}
        return new ResponseEntity<Boolean>(response, HttpStatus.OK);
    }


}
