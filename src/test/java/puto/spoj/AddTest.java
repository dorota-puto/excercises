package puto.spoj;

import org.testng.annotations.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static puto.spoj.Add.add;

public class AddTest {

    @Test
    public void testAdd() {
        //given
        String first = "99999";
        String second = "11111";
        //when
        String result =add(first, second);
        String expected="111110";
        //then
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void testAdd2() {
        //given
        String first = "";
        String second = "";
        //when
        String result =add(first, second);
        String expected="";
        //then
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void testAdd3() {
        //given
        String first = "362848";
        String second = "25";
        //when
        String result =add(first, second);
        String expected="362873";
        //then
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void testAdd4() {
        //given
        String first = "2";
        String second = "9";
        //when
        String result =add(first, second);
        String expected="11";
        //then
        assertThat(result).isEqualTo(expected);
    }
    @Test
    public void testAdd5() {
        //given
        String first = "123";
        String second = "25";
        //when
        String result =add(first, second);
        String expected="148";
        //then
        assertThat(result).isEqualTo(expected);
    }

}