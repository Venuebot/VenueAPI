package venuebot.temp;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import venuebot.model.GetVenueListRequest;

public class tempGeneral {
    public static void main(String[] args) throws JsonProcessingException {
        printGetVenuesRequest();
    }
    private static void printGetVenuesRequest() throws JsonProcessingException {
        GetVenueListRequest request=GetVenueListRequest.builder().x(12).y(14).z(25).build();

        ObjectMapper mapper = new ObjectMapper();
        String str=mapper.writerWithDefaultPrettyPrinter().writeValueAsString(request);
        System.out.println(str);
    }
}
