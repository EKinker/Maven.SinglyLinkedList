package com.zipcodewilmington.singlylinkedlist;

import com.sun.jdi.connect.Connector;
import org.junit.Assert;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

/**
 * Created by leon on 1/10/18.
 */
public class SinglyLinkedListTest {

    @Test
    public void testConstructor() {
        SinglyLinkedList<Integer> list = new SinglyLinkedList<>();
        Assert.assertNotNull(list);
    }

@Test
public void testIsEmpty(){
        SinglyLinkedList<Integer> list = new SinglyLinkedList<>();
        Assert.assertEquals(true, list.isEmpty());

}

    @Test
    public void testAdd(){
        SinglyLinkedList<Integer> list = new SinglyLinkedList<>();
        list.add(42);
        Assert.assertFalse(list.isEmpty());
    }

    @Test
    public void testAdd2(){
        SinglyLinkedList<Integer> list = new SinglyLinkedList<>();
        list.add(42);
        list.add(10000000);
        Assert.assertFalse(list.isEmpty());
    }

    @Test
    public void testAdddddddd() {
//        SinglyLinkedList<Integer> list = new SinglyLinkedList<>();
//        int expected = 42;
//        int expectedSize = 1;
//
//        list.add(expected);
//        int actual = list.get(0);
//        int actualSize = list.size();
//
//        Assertions.assertEquals(expectedSize, actualSize);
//        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void removeNode() {
//        SinglyLinkedList<Integer> list = new SinglyLinkedList<>();
//        list.add(1);
//        list.add(2);
//        list.add(3);
//
//        list.remove(1);
//        int expectedSize = 2;
//        int actualSize = list.size();
//
//        Assertions.assertEquals(expectedSize, actualSize);
    }

    @Test
    public void contains() {
//        SinglyLinkedList<String> list = new SinglyLinkedList<>();
//        String expected = "Crosby";
//        list.add(expected);
//        list.add("Stills");
//        list.add("Nash");
//        list.add("Young");
//
//        Assertions.assertTrue(list.contains(expected));
    }

    @Test
    public void findElement() {
//        SinglyLinkedList<Integer> list = new SinglyLinkedList<>();
//        list.add(1);
//        list.add(2);
//        list.add(3);
//        list.add(4);
//
//        int expected = 2;
//        int actual = list.find(3);
//
//        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void size() {
        SinglyLinkedList<Integer> list = new SinglyLinkedList<>();
        Assertions.assertEquals(0, list.size());

        list.add(1);

        Assertions.assertEquals(1, list.size());

    }

    @Test
    public void get() {
//        SinglyLinkedList<String> list = new SinglyLinkedList<>();
//        String expected = "George";
//        list.add("Ernest");  //was an elephant, a great big fellow,
//        list.add("Leonard"); //was a lion with a six foot tail,
//        list.add(expected); // was a goat, and his beard was yellow, and
//        list.add("James"); // was a very small snail.
//
//        String actual = list.get(2);
//        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void copy() {
    }

    @Test
    public void sort() {
    }

    @Test
    public void testToString(){
        SinglyLinkedList<Integer> list = new SinglyLinkedList<>();
        String expected = "head -> NULL";

        Assert.assertEquals(expected, list.toString());
    }

    @Test
    public void testToString2(){
        SinglyLinkedList<Integer> list = new SinglyLinkedList<>();
        list.add(1);

        String expected = "head -> [1] -> NULL";

        Assert.assertEquals(expected, list.toString());
    }

    @Test
    public void testToString3(){
        SinglyLinkedList<Integer> list = new SinglyLinkedList<>();
        list.add(1);
        list.add(2);

        String expected = "head -> [1] -> [2] -> NULL";

        Assert.assertEquals(expected, list.toString());
    }
}
