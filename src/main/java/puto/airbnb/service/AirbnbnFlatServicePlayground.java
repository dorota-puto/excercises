package puto.airbnb.service;

import org.apache.commons.lang3.tuple.Pair;
import puto.airbnb.dto.AirbnbFlatDto;
import puto.airbnb.model.Flat;
import puto.airbnb.model.Host;
import puto.airbnb.model.Neighbourhood;

import java.util.List;
import java.util.Map;

public class AirbnbnFlatServicePlayground {
    public static void main(String[] args) {
        AirbnbFlatDataReader reader = new AirbnbFlatDataReader();
        List<Flat> result = reader.read("C:\\workspace\\excercises\\src\\main\\resources\\airbnb\\AB_NYC_2019.csv");

        FlatService flatService = new FlatService();
        //  Map<Host, List<Flat>> listFlatsByOwner = flatService.getFlatByOwner(result);

        //  for (Host host : listFlatsByOwner.keySet()) {
        //     Integer numberOfFlats = listFlatsByOwner.get(host).size();

        //     System.out.println(host + " has " + numberOfFlats + " flats");

        Map<Pair<Neighbourhood, Host>, List<Flat>> listFlatByNeighbourhoodAndHost = flatService.getFlatByNeighbourhoodAndHost(result);

        for (Pair<Neighbourhood, Host> pair : listFlatByNeighbourhoodAndHost.keySet()) {
            if (listFlatByNeighbourhoodAndHost.get(pair).size() > 3) {
                System.out.println(pair.getLeft().getGetNeighbourhood() + pair.getLeft().getNeighbourhoodGroup() + pair.getRight());
                for (Flat flat : listFlatByNeighbourhoodAndHost.get(pair)) {
                    System.out.println("    " + flat.getId() + " name = " + flat.getFlatName());
                }
            }
        }
    }
}

