package puto.airbnb.service;

import org.testng.annotations.Test;
import puto.airbnb.model.AirbnbFlat;

import java.math.BigDecimal;

import static org.assertj.core.api.Assertions.assertThat;
import static org.testng.Assert.*;

public class AirbnbFlatParserTest {
    @Test
    public void AirbnbFlatParserTest(){
      //given
        AirbnbFlatParser airbnbFlatParser= new AirbnbFlatParser();
      //  String line="2539;Clean & quiet apt home by the park;2787;John;Brooklyn;Kensington;40.64749;-73.97237;Private room;149;1;9;2018-10-19;0.21;6;365";
        String line=  "50447;Lovely Apt & Garden;  Legal;  Best Area; Amenities;9744;Laurie;Brooklyn;South Slope;40.6693;-73.98804;Entire home/apt;135;5;151;2019-06-22;1.43;3;162";
      //when
       AirbnbFlat flat= airbnbFlatParser.parse(line);
      //then
        assertThat(flat.getId()).isEqualTo(2539);
        assertThat(flat.getFlatName()).isEqualTo("Clean & quiet apt home by the park");
        assertThat(flat.getHostId()).isEqualTo(2787);
        assertThat(flat.getHostName()).isEqualTo("John");
        assertThat(flat.getNeighbourhoodGroup()).isEqualTo("Brooklyn");
        assertThat(flat.getGetNeighbourhood()).isEqualTo("Kensington");
        assertThat(flat.getRoomType()).isEqualTo("Private room");
        assertThat(flat.getPrice()).isEqualTo(new BigDecimal(149));
        assertThat(flat.getMinimumNights()).isEqualTo(1);
        assertThat(flat.getNumberOfReviews()).isEqualTo(9);
        assertThat(flat.getAvailability()).isEqualTo(365);
    }

}