package puto.airbnb.service;

import org.apache.commons.lang3.builder.CompareToBuilder;
import puto.airbnb.model.AirbnbFlat;
import puto.collection.model.Animal;

import java.util.*;

public class AirbnbFlatService {
    public Map<Integer, Integer> getNumberOfFlatsByOwners(List<AirbnbFlat> flats) {
        Map<Integer, Integer> numberOfFlatsByOwners = new HashMap<>();
        for (AirbnbFlat flat : flats) {
            if (!numberOfFlatsByOwners.containsKey(flat.getHostId())) {
                numberOfFlatsByOwners.put(flat.getHostId(), 1);
            } else {
                Integer previousNumber = numberOfFlatsByOwners.get(flat.getHostId());
                numberOfFlatsByOwners.put(flat.getHostId(), previousNumber + 1);
            }

        }
        return numberOfFlatsByOwners;
    }

    public Map<Integer, List<AirbnbFlat>> getFlatbyOwner(List<AirbnbFlat> flats) {
        Map<Integer, List<AirbnbFlat>> listOfFlatsByOwner = new HashMap<>();
        for (AirbnbFlat flat : flats) {
            if (!listOfFlatsByOwner.containsKey(flat.getHostId())) {
                List<AirbnbFlat> ownerFlats = new ArrayList<>();
                ownerFlats.add(flat);
                listOfFlatsByOwner.put(flat.getHostId(), ownerFlats);
            } else {
                listOfFlatsByOwner.get(flat.getHostId()).add(flat);
            }
        }
        return listOfFlatsByOwner;
    }

    public Map<Integer, List<AirbnbFlat>> getTopFlatOwner(List<AirbnbFlat> flats, int n) {
        Map<Integer, List<AirbnbFlat>> listOfFlatsByTopOwner = new HashMap<>();
        Map<Integer, List<AirbnbFlat>> listOfFlatsByOwners = getFlatbyOwner(flats);
        List<Map.Entry<Integer, List<AirbnbFlat>>> pairs = new ArrayList<>(listOfFlatsByOwners.entrySet());

        pairs.sort(new Comparator<Map.Entry<Integer, List<AirbnbFlat>>>() {
            @Override
            public int compare(Map.Entry<Integer, List<AirbnbFlat>> o1, Map.Entry<Integer, List<AirbnbFlat>> o2) {
                return new CompareToBuilder()
                        .append(o2.getValue().size(), o1.getValue().size())
                        .toComparison();
            }
        });
        for (int i=0; i<n; i++){
            listOfFlatsByTopOwner.put(pairs.get(i).getKey(),pairs.get(i).getValue());
        }
        return listOfFlatsByTopOwner;
    }
}