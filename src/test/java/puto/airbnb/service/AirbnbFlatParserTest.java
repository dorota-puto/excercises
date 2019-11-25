package puto.airbnb.service;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;
import puto.airbnb.dto.AirbnbFlatDto;
import puto.airbnb.model.Flat;
import puto.airbnb.model.RoomType;

import java.math.BigDecimal;

import static org.assertj.core.api.Assertions.assertThat;

public class AirbnbFlatParserTest {
    @Ignore // TODO: Fix the test and remove Ignore Annotation
    @Test
    public void AirbnbFlatParserTest() {
        //given
        AirbnbFlatParser airbnbFlatParser = new AirbnbFlatParser();
        String line = "2539;Clean & quiet apt home by the park;2787;John;Brooklyn;Kensington;40.64749;-73.97237;Private room;149;1;9;2018-10-19;0.21;6;365";
        //when
        Flat flat = airbnbFlatParser.parse(line);
        //then
        assertThat(flat.getId()).isEqualTo(2539);
        assertThat(flat.getFlatName()).isEqualTo("Clean & quiet apt home by the park");
        assertThat(flat.getHost().getHostId()).isEqualTo(2787);
        assertThat(flat.getHost().getHostName()).isEqualTo("John");
        assertThat(flat.getNeighbourhood().getNeighbourhoodGroup()).isEqualTo("Brooklyn");
        assertThat(flat.getNeighbourhood().getGetNeighbourhood()).isEqualTo("Kensington");

        RoomType roomType = RoomType.createFromName("Private room");
        assertThat(flat.getRoomType()).isEqualTo(roomType);
        assertThat(flat.getPrice()).isEqualTo(new BigDecimal(149));
        assertThat(flat.getMinimumNights()).isEqualTo(1);
        assertThat(flat.getNumberOfReviews()).isEqualTo(9);
        assertThat(flat.getAvailability()).isEqualTo(365);
    }

}