package com.zipcodewilmington.singlylinkedlist;

import org.junit.jupiter.api.Assertions;

/**
 * Created by leon on 1/10/18.
 */
public class SinglyLinkedListTest {

    @org.junit.jupiter.api.Test
    void addNode() {
        SinglyLinkedList<Integer> list = new SinglyLinkedList<>();
        int expected = 42;
        int expectedSize = 1;

        list.add(expected);
        int actual = list.get(0);
        int actualSize = list.size();

        Assertions.assertEquals(expectedSize, actualSize);
        Assertions.assertEquals(expected, actual);

    }

    @org.junit.jupiter.api.Test
    void removeNode() {
        SinglyLinkedList<Integer> list = new SinglyLinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);

        list.remove(1);
        int expectedSize = 2;
        int actualSize = list.size();

        Assertions.assertEquals(expectedSize, actualSize);
    }

    @org.junit.jupiter.api.Test
    void contains() {
        SinglyLinkedList<String> list = new SinglyLinkedList<>();
        String expected = "Crosby";
        list.add(expected);
        list.add("Stills");
        list.add("Nash");
        list.add("Young");

        Assertions.assertTrue(list.contains(expected));
    }

    @org.junit.jupiter.api.Test
    void findElement() {
        SinglyLinkedList<Integer> list = new SinglyLinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        int expected = 2;
        int actual = list.findElement(3);

        Assertions.assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void size() {
        SinglyLinkedList<Integer> list = new SinglyLinkedList<>();
        Assertions.assertEquals(0, list.size());

        list.add(1);
        Assertions.assertEquals(1, list.size());

    }

    @org.junit.jupiter.api.Test
    void get() {
        SinglyLinkedList<String> list = new SinglyLinkedList<>();
        String expected = "George";
        list.add("Ernest");  //was an elephant, a great big fellow,
        list.add("Leonard"); //was a lion with a six foot tail,
        list.add(expected); // was a goat, and his beard was yellow, and
        list.add("James"); // was a very small snail.

        String actual = list.get(2);
        Assertions.assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void copy() {
    }

    @org.junit.jupiter.api.Test
    void sort() {
    }
}
