package puto;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class MaxTest {
    @Test
    public void testOneElementArray() {
        // given
        int[] a = {2};
        Max max = new Max();

        //when
        int result = max.calculateMax(a);

        //then
        assertEquals(result,2);
    }
    @Test
    public void testArrayWithDuplicates() {
        // given
        int[] a = {2,8,8,5};
        Max max = new Max();

        //when
        int result = max.calculateMax(a);

        //then
        assertEquals(result,8);
    }

}