package puto.airbnb.service;

import org.apache.commons.lang3.tuple.Pair;
import puto.airbnb.model.Flat;
import puto.airbnb.model.Host;
import puto.airbnb.model.Neighbourhood;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FlatService {
    public Map<Host, List<Flat>> getFlatByOwner(List<Flat> flats) {
        Map<Host, List<Flat>> listFlatsByOwner = new HashMap<>();
        for (Flat flat : flats) {
            if (!listFlatsByOwner.containsKey(flat.getHost())) {
                List<Flat> ownerFlats = new ArrayList<>();
                ownerFlats.add(flat);
                listFlatsByOwner.put(flat.getHost(), ownerFlats);
            } else {
                listFlatsByOwner.get(flat.getHost()).add(flat);
            }
        }
        return listFlatsByOwner;
    }

    public Map<Pair<Neighbourhood, Host>, List<Flat>> getFlatByNeighbourhoodAndHost(List<Flat> flats) {
        Map<Pair<Neighbourhood, Host>, List<Flat>> listOfFlatsByNeighbourhoodAndHost = new HashMap<>();
        for (Flat flat: flats){
           Pair<Neighbourhood,Host> pair= Pair.of(flat.getNeighbourhood(),flat.getHost());
            if(!listOfFlatsByNeighbourhoodAndHost.containsKey(pair)){
                List<Flat> ownerFlats = new ArrayList<>();
                ownerFlats.add(flat);
                listOfFlatsByNeighbourhoodAndHost.put(pair,ownerFlats);
            }else{
                listOfFlatsByNeighbourhoodAndHost.get(pair).add(flat);
            }
        }
        return listOfFlatsByNeighbourhoodAndHost;
    }
}
