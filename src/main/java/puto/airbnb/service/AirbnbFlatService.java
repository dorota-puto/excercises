package puto.airbnb.service;

import org.apache.commons.lang3.builder.CompareToBuilder;
import puto.airbnb.dto.AirbnbFlatDto;

import java.util.*;

public class AirbnbFlatService {
    public Map<Integer, Integer> getNumberOfFlatsByOwners(List<AirbnbFlatDto> flats) {
        Map<Integer, Integer> numberOfFlatsByOwners = new HashMap<>();
        for (AirbnbFlatDto flat : flats) {
            if (!numberOfFlatsByOwners.containsKey(flat.getHostId())) {
                numberOfFlatsByOwners.put(flat.getHostId(), 1);
            } else {
                Integer previousNumber = numberOfFlatsByOwners.get(flat.getHostId());
                numberOfFlatsByOwners.put(flat.getHostId(), previousNumber + 1);
            }
        }
        return numberOfFlatsByOwners;
    }

    public Map<Integer, List<AirbnbFlatDto>> getFlatbyOwner(List<AirbnbFlatDto> flats) {
        Map<Integer, List<AirbnbFlatDto>> listOfFlatsByOwner = new HashMap<>();
        for (AirbnbFlatDto flat : flats) {
            if (!listOfFlatsByOwner.containsKey(flat.getHostId())) {
                List<AirbnbFlatDto> ownerFlats = new ArrayList<>();
                ownerFlats.add(flat);
                listOfFlatsByOwner.put(flat.getHostId(), ownerFlats);
            } else {
                listOfFlatsByOwner.get(flat.getHostId()).add(flat);
            }
        }
        return listOfFlatsByOwner;
    }

    public Map<Integer, List<AirbnbFlatDto>> getTopFlatOwner(List<AirbnbFlatDto> flats, int n) {
        Map<Integer, List<AirbnbFlatDto>> listOfFlatsByTopOwner = new HashMap<>();
        Map<Integer, List<AirbnbFlatDto>> listOfFlatsByOwners = getFlatbyOwner(flats);
        List<Map.Entry<Integer, List<AirbnbFlatDto>>> pairs = new ArrayList<>(listOfFlatsByOwners.entrySet());

        pairs.sort(new Comparator<Map.Entry<Integer, List<AirbnbFlatDto>>>() {
            @Override
            public int compare(Map.Entry<Integer, List<AirbnbFlatDto>> o1, Map.Entry<Integer, List<AirbnbFlatDto>> o2) {
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