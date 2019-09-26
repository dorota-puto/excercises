package puto.collection.list;

import org.testng.annotations.Test;

import java.util.Iterator;

import static org.testng.Assert.*;

public class SimpleLinkedListIteratorTest {
    @Test
    public void testEmptyListIterator() {
        //given
        SimpleLinkedList<String> simpleLinkedList = new SimpleLinkedList<>();

        //when
        Iterator<String> it = simpleLinkedList.iterator();

        //then
        assertFalse(it.hasNext());
    }

    @Test
    public void testOneElementListIterator() {
        //given
        SimpleLinkedList<String> simpleLinkedList = new SimpleLinkedList<>();
        simpleLinkedList.add("kotek");

        //when
        Iterator<String> it = simpleLinkedList.iterator();

        //then
        assertTrue(it.hasNext());
        assertEquals(it.next(),"kotek");
        assertFalse(it.hasNext());
    }
    @Test
    public void testTwoElementListIterator() {
        //given
        SimpleLinkedList<String> simpleLinkedList = new SimpleLinkedList<>();
        simpleLinkedList.add("kotek");
        simpleLinkedList.add("piesek");

        //when
        Iterator<String> it = simpleLinkedList.iterator();

        //then
        assertTrue(it.hasNext());
        assertEquals(it.next(),"kotek");
        assertTrue(it.hasNext());
        assertEquals(it.next(),"piesek");
        assertFalse(it.hasNext());
    }
    @Test(expectedExceptions = IllegalStateException.class)
    public void testGettingNotExistingElement(){
        //given
        SimpleLinkedList<String> simpleLinkedList = new SimpleLinkedList<>();

        //when
        Iterator<String> it = simpleLinkedList.iterator();
        it.next();
    }
}