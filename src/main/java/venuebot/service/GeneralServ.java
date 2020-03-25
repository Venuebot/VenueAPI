package venuebot.service;

import org.springframework.stereotype.Service;
import venuebot.model.GetVenueListRequest;
import venuebot.model.GetVenueListResponse;
import venuebot.model.Venue;
import venuebot.util.DemoBuffer;

import java.util.ArrayList;
import java.util.List;

@Service
public class GeneralServ {

    public GetVenueListResponse getVenueListResponse(GetVenueListRequest request) {
        if (request.getX() == 0 && request.getY() == 0 && request.getZ() == 0) {
            if(request.getVenueId()==2){
                return
                        GetVenueListResponse.builder().build();
            }
            else {
                List<Venue> searchList = new ArrayList<>();
                searchList.add(DemoBuffer.ht_venues.get(1));
                return
                        GetVenueListResponse.builder().venuesSearch(searchList).build();
            }
            } else {
            List<Venue> listFav = new ArrayList<>();
            listFav.add(DemoBuffer.ht_venues.get(5));
            listFav.add(DemoBuffer.ht_venues.get(6));
            List<Venue> listRecent = new ArrayList<>();
            listRecent.add(DemoBuffer.ht_venues.get(1));
            listRecent.add(DemoBuffer.ht_venues.get(5));
            listRecent.add(DemoBuffer.ht_venues.get(6));
            List<Venue> listNearBy = new ArrayList<>();
            listNearBy.add(DemoBuffer.ht_venues.get(1));
            listNearBy.add(DemoBuffer.ht_venues.get(2));
            listNearBy.add(DemoBuffer.ht_venues.get(3));
            return
                    GetVenueListResponse.builder().venuesFav(listFav).venuesRecents(listRecent).venuesNearBy(listNearBy).build();

        }
    }



    }
