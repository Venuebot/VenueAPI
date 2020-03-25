package venuebot.api;

import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import venuebot.model.GetVenueListRequest;
import venuebot.model.GetVenueListResponse;
import venuebot.model.LoginRequest;
import venuebot.model.LoginResponse;
import venuebot.service.GeneralServ;

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
}
