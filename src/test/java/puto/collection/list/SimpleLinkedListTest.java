package puto.collection.list;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class SimpleLinkedListTest {
    @Test
    public void testRemovingFromOneElementList() {
        //given
        SimpleLinkedList<String> simpleLinkedList = new SimpleLinkedList<>() ;
        simpleLinkedList.add("kotek");

        //when
        simpleLinkedList.remove(0);

        //then
        assertEquals(simpleLinkedList.size(), 0);
    }

    @Test
    public void testRemovingHeadFromTwoElementList() {
        //given
        SimpleLinkedList<String> simpleLinkedList = new SimpleLinkedList<>() ;
        simpleLinkedList.add("kotek");
        simpleLinkedList.add("piesek");

        //when
        simpleLinkedList.remove(0);

        //then
        assertEquals(simpleLinkedList.size(), 1);
        assertEquals(simpleLinkedList.get(0), "piesek");
    }

    public void testRemovingTailFromTwoElementList() {
        //given
        SimpleLinkedList<String> simpleLinkedList = new SimpleLinkedList<>() ;
        simpleLinkedList.add("kotek");
        simpleLinkedList.add("piesek");

        //when
        simpleLinkedList.remove(1);

        //then
        assertEquals(simpleLinkedList.size(), 1);
        assertEquals(simpleLinkedList.get(0), "kotek");
    }

    @Test
    public void testRemovingHeadFromThreeElementList() {
        //given
        SimpleLinkedList<String> simpleLinkedList = new SimpleLinkedList<>() ;
        simpleLinkedList.add("kotek");
        simpleLinkedList.add("piesek");
        simpleLinkedList.add("myszka");

        //when
        simpleLinkedList.remove(0);

        //then
        assertEquals(simpleLinkedList.size(), 2);
        assertEquals(simpleLinkedList.get(0), "piesek");
        assertEquals(simpleLinkedList.get(1), "myszka");
    }

    @Test
    public void testRemovingTailFromThreeElementList() {
        //given
        SimpleLinkedList<String> simpleLinkedList = new SimpleLinkedList<>() ;
        simpleLinkedList.add("kotek");
        simpleLinkedList.add("piesek");
        simpleLinkedList.add("myszka");

        //when
        simpleLinkedList.remove(2);

        //then
        assertEquals(simpleLinkedList.size(), 2);
        assertEquals(simpleLinkedList.get(0), "kotek");
        assertEquals(simpleLinkedList.get(1), "piesek");
    }

    @Test
    public void testRemovingMiddleElementFromThreeElementList() {
        //given
        SimpleLinkedList<String> simpleLinkedList = new SimpleLinkedList<>() ;
        simpleLinkedList.add("kotek");
        simpleLinkedList.add("piesek");
        simpleLinkedList.add("myszka");

        //when
        simpleLinkedList.remove(1);

        //then
        assertEquals(simpleLinkedList.size(), 2);
        assertEquals(simpleLinkedList.get(0), "kotek");
        assertEquals(simpleLinkedList.get(1), "myszka");
    }

    @Test
    public void testRemovingFewElementsFromList() {
        //given
        SimpleLinkedList<String> simpleLinkedList = new SimpleLinkedList<>() ;
        simpleLinkedList.add("kotek");
        simpleLinkedList.add("piesek");
        simpleLinkedList.add("myszka");
        simpleLinkedList.add("ptaszek");
        simpleLinkedList.add("jaszczurka");

        //when
        simpleLinkedList.remove(4);
        simpleLinkedList.remove(2);
        simpleLinkedList.remove(0);

        //then
        assertEquals(simpleLinkedList.size(), 2);
        assertEquals(simpleLinkedList.get(0), "piesek");
        assertEquals(simpleLinkedList.get(1), "ptaszek");
    }

    @Test(expectedExceptions = ArrayIndexOutOfBoundsException.class)
    public void testRemovingNotExistingIndex() {
        //given
        SimpleLinkedList<String> simpleLinkedList = new SimpleLinkedList<>() ;
        simpleLinkedList.add("kotek");
        simpleLinkedList.add("piesek");
        simpleLinkedList.add("myszka");

        //when
        simpleLinkedList.remove(3);

    }

    @Test(expectedExceptions = ArrayIndexOutOfBoundsException.class)
    public void testRemovingNegitiveIndex() {
        //given
        SimpleLinkedList<String> simpleLinkedList = new SimpleLinkedList<>() ;
        simpleLinkedList.add("kotek");
        simpleLinkedList.add("piesek");
        simpleLinkedList.add("myszka");

        //when
        simpleLinkedList.remove(-2);

    }
}
