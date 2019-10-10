package puto.airbnb.service;

import puto.airbnb.model.AirbnbFlat;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class AirbnbFlatDataReader {
    private AirbnbFlatParser parser = new AirbnbFlatParser();

    public List<AirbnbFlat> read(String path) {
        List<AirbnbFlat> result = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String line = br.readLine();
            while ((line = br.readLine()) != null) {
                result.add(parser.parse(line));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return result;
    }
}
