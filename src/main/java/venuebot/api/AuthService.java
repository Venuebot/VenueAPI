package venuebot.api;


import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import venuebot.common.HttpHeaders;
import venuebot.model.AuthRequest;
import venuebot.model.AuthResponse;
import venuebot.model.LoginRequest;
import venuebot.model.LoginResponse;
import venuebot.service.AuthServ;

import java.util.List;
import java.util.UUID;

@RestController
@Api(value="/Auth",description="Authorisation Service",produces ="application/json")
@RequestMapping(value="/Auth")
public class AuthService {
 
	@Autowired
	AuthServ service;


	@RequestMapping(value="/getAuthStatus",method=RequestMethod.PUT)
	//public ResponseEntity<AuthResponse> getAuthStatus(@ModelAttribute HttpHeaders headers, @PathVariable("accessToken") String accessToken)  {
	public ResponseEntity<AuthResponse> getAccountDetail(@ModelAttribute HttpHeaders headers,@RequestBody AuthRequest request)  {
		AuthResponse response=service.validateAccessToken(request,headers.getAuthorization());
		return new ResponseEntity<AuthResponse>(response,HttpStatus.OK);
	}

	  //Header'i tekrar tekrar her metoda eklememek icin
	  @ModelAttribute
	  public HttpHeaders getHeaders(@RequestHeader(value="Authorization", required = true) String jwt,
									@RequestHeader(value="audience", required = true) String audiance,
									@RequestHeader(value="mac_Id", required = false) String clientId,
									@RequestHeader(value="content_Type", required = false) String contentType,
									@RequestHeader(value="ip_Address", required = false) String psuIp

	  )
	  {

		  return HttpHeaders.builder().audience(audiance).Authorization(jwt).mac_Id(clientId).content_Type(contentType)
				  .ip_Address(psuIp).build();
	  }

}

