package puto.airbnb.service;

import puto.airbnb.model.AirbnbFlat;
import puto.airbnb.model.Column;

import java.math.BigDecimal;

import static puto.airbnb.model.Column.*;

public class AirbnbFlatParser {
    public AirbnbFlat parse(String line) {

        String[] columns = line.split(",");
        AirbnbFlat airbnbFlat = new AirbnbFlat();

        airbnbFlat.setId(Integer.parseInt(columns[ID.getId()]));
        airbnbFlat.setFlatName(columns[FLAT_NAME.getId()]);
        airbnbFlat.setHostId(Integer.parseInt(columns[HOST_ID.getId()]));
        airbnbFlat.setHostName(columns[HOST_NAME.getId()]);
        airbnbFlat.setNeighbourhoodGroup(columns[NEIGHBOURHOOD_GROUP.getId()]);
        airbnbFlat.setGetNeighbourhood(columns[GET_NEIGHBOURHOOD.getId()]);
        airbnbFlat.setRoomType(columns[ROOM_TYPE.getId()]);
        airbnbFlat.setPrice(new BigDecimal(columns[PRICE.getId()]));
        airbnbFlat.setMinimumNights(Integer.parseInt(columns[MINIMUM_NIGHTS.getId()]));
        airbnbFlat.setNumberOfReviews(Integer.parseInt(columns[NUMBER_OF_REVIEWS.getId()]));
        airbnbFlat.setAvailability(Integer.parseInt(columns[AVAILABILITY.getId()]));

        return airbnbFlat;
    }

}

