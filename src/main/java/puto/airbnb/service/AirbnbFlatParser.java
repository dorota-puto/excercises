package puto.airbnb.service;

import puto.airbnb.dto.AirbnbFlatDto;
import puto.airbnb.model.Flat;
import puto.airbnb.model.Host;
import puto.airbnb.model.Neighbourhood;
import puto.airbnb.model.RoomType;

import java.math.BigDecimal;

import static puto.airbnb.model.Column.*;

public class AirbnbFlatParser {
    public String removeUnwantedSeparators(String line) {

        StringBuilder copy = new StringBuilder();

        boolean inQuotes = false;

        for (int i = 0; i < line.length(); ++i) {
            if (line.charAt(i) == '"')
                inQuotes = !inQuotes;
            if (line.charAt(i) == ';' && inQuotes)
                copy.append(',');
            else
                copy.append(line.charAt(i));
        }
        return copy.toString();
    }

    public Flat parse(String line) {
        String preprocessedLine = null;
        try {
            preprocessedLine = removeUnwantedSeparators(line);
            String[] columns = preprocessedLine.split(";");
            Flat airbnbFlat = new Flat();

            airbnbFlat.setId(Integer.parseInt(columns[ID.getId()]));
            airbnbFlat.setFlatName(columns[FLAT_NAME.getId()]);

            Host host = new Host(Integer.parseInt(columns[HOST_ID.getId()]), columns[HOST_NAME.getId()]);
            airbnbFlat.setHost(host);

            Neighbourhood neighbourhood = new Neighbourhood(columns[NEIGHBOURHOOD_GROUP.getId()], columns[GET_NEIGHBOURHOOD.getId()]);
            airbnbFlat.setNeighbourhood(neighbourhood);

            RoomType roomType = RoomType.createFromName(columns[ROOM_TYPE.getId()]);
            airbnbFlat.setRoomType(roomType);

            airbnbFlat.setPrice(new BigDecimal(columns[PRICE.getId()]));
            airbnbFlat.setMinimumNights(Integer.parseInt(columns[MINIMUM_NIGHTS.getId()]));
            airbnbFlat.setNumberOfReviews(Integer.parseInt(columns[NUMBER_OF_REVIEWS.getId()]));
            airbnbFlat.setAvailability(Integer.parseInt(columns[AVAILABILITY.getId()]));

            return airbnbFlat;
        } catch (Exception e) {
            // System.err.println("unable to parse: " + preprocessedLine);
            return null;
        }


    }
}

