package venuebot.model.product;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Promotion {
    private String name; // Happy hour
    private String desription; // "every day between 18.00 - 20.00"
    private List<Availability> availabilities;
    private double price;

}


