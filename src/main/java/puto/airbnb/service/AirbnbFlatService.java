package puto.airbnb.service;

import puto.airbnb.model.AirbnbFlat;

import java.util.List;

public class AirbnbFlatService {
    public static void main (String[] args){
        AirbnbFlatDataReader reader= new AirbnbFlatDataReader();
       List<AirbnbFlat> result= reader.read("C:\\workspace\\excercises\\src\\main\\resources\\airbnb\\AB_NYC_2019.csv");

    }
}
