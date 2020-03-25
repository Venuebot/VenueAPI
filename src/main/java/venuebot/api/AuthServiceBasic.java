package venuebot.api;


import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import venuebot.common.HttpHeaders;
import venuebot.model.LoginRequest;
import venuebot.model.LoginResponse;
import venuebot.model.RegisterRequest;
import venuebot.service.AuthServ;

@RestController
@Api(value="/Auth",description="Authorisation Service",produces ="application/json")
@RequestMapping(value="/Auth")
public class AuthServiceBasic {
 
	@Autowired
	AuthServ service;

	/**
	 *
	 * @return
	 */
	@RequestMapping(value="/health",method=RequestMethod.GET)
	public ResponseEntity<String> health()  {

		return new ResponseEntity<String>("OK",HttpStatus.OK);
	}

	/**
	 *
	 * @param request: Login Request
	 * @return Access Token in Response Str
	 */
	@RequestMapping(value="/initiateLogin",method=RequestMethod.POST)
	public ResponseEntity<LoginResponse> loginInitiated(@RequestBody LoginRequest request)  {
		LoginResponse response=service.initiateLogin(request);
		return new ResponseEntity<LoginResponse>(response,HttpStatus.OK);
	}

	/**
	 *
	 * @param request: Register Request
	 * @return Access Token in Response Str
	 */
	@RequestMapping(value="/registerCustomer",method=RequestMethod.POST)
	public ResponseEntity<LoginResponse> registerCustomer(@RequestBody RegisterRequest request)  {
		LoginResponse response=service.register(request);
		return new ResponseEntity<LoginResponse>(response,HttpStatus.OK);
	}

	/**
	 *
	 * @param request: Register Business
	 * @return Access Token in Response Str
	 */
	@RequestMapping(value="/registerBusiness",method=RequestMethod.POST)
	public ResponseEntity<LoginResponse> registerBusiness(@RequestBody RegisterRequest request)  {
		LoginResponse response=service.registerBusiness(request);
		return new ResponseEntity<LoginResponse>(response,HttpStatus.OK);
	}


}

