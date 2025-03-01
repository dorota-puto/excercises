package puto.airbnb.service;

import puto.airbnb.dto.AirbnbFlatDto;
import puto.airbnb.model.Flat;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class AirbnbFlatDataReader {
    private AirbnbFlatParser parser = new AirbnbFlatParser();

    public List<Flat> read(String path) {
        List<Flat> result = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String line = br.readLine();
            int counter = 0;
            while ((line = br.readLine()) != null) {
                Flat x = parser.parse(line);

                if (x != null) {
                    result.add(x);
                } else counter++;
            }
            System.out.println("not processed: " + counter);
            System.out.println("processed: " + result.size());
        } catch (IOException e) {
            e.printStackTrace();
        }
        return result;
    }
}
