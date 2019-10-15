package puto.airbnb.service;

import puto.airbnb.dto.AirbnbFlatDto;

import java.util.List;
import java.util.Map;

public class AirbnbnFlatServicePlayground {
    public static void main(String[] args) {
        AirbnbFlatDataReader reader = new AirbnbFlatDataReader();
        List<AirbnbFlatDto> result = reader.read("C:\\workspace\\excercises\\src\\main\\resources\\airbnb\\AB_NYC_2019.csv");

        AirbnbFlatService flatService = new AirbnbFlatService();
        //   Map<Integer, Integer> numberOfFlatsByOwners = flatService.getNumberOfFlatsByOwners(result);

        //   for (Integer ownerId : numberOfFlatsByOwners.keySet()) {
        //      System.out.println("owner id = " + ownerId + " has " + numberOfFlatsByOwners.get(ownerId)+" flats");
        //   }

        Map<Integer, List<AirbnbFlatDto>> listOfFlatsByOwners = flatService.getTopFlatOwner(result,1);

        for (Integer ownerId : listOfFlatsByOwners.keySet()) {
            String name = listOfFlatsByOwners.get(ownerId).get(0).getHostName();
            Integer numberOfFlats = listOfFlatsByOwners.get(ownerId).size();
            System.out.println("owner id = " + ownerId + " name = " + name + " has " + numberOfFlats + " flats: ");
            for (AirbnbFlatDto flat : listOfFlatsByOwners.get(ownerId)) {
                System.out.println("    " + flat.getId() + " name = " + flat.getFlatName());
            }

        }
    }
}
