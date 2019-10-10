package puto.airbnb.service;

import puto.airbnb.model.AirbnbFlat;

import java.math.BigDecimal;

public class AirbnbFlatParser {
    public AirbnbFlat parse(String line) {

        String[] columns = line.split(",");
        AirbnbFlat airbnbFlat = new AirbnbFlat();
        airbnbFlat.setId(Integer.parseInt(columns[0]));
        airbnbFlat.setFlatName(columns[1]);
        airbnbFlat.setHostId(Integer.parseInt(columns[2]));
        airbnbFlat.setHostName(columns[3]);
        airbnbFlat.setNeighbourhoodGroup(columns[4]);
        airbnbFlat.setGetNeighbourhood(columns[5]);
        airbnbFlat.setRoomType(columns[8]);
        airbnbFlat.setPrice(new BigDecimal(columns[9]));
        airbnbFlat.setMinimumNights(Integer.parseInt(columns[10]));
        airbnbFlat.setNumberOfReviews(Integer.parseInt(columns[11]));
        airbnbFlat.setAvailability(Integer.parseInt(columns[15]));

        return airbnbFlat;
    }

}

