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
        String line="2539,Clean & quiet apt home by the park,2787,John,Brooklyn,Kensington,40.64749,-73.97237,Private room,149,1,9,2018-10-19,0.21,6,365";
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