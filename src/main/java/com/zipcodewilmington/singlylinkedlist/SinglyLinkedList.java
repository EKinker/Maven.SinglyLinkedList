package com.zipcodewilmington.singlylinkedlist;

/**
 * Created by leon on 1/10/18.
 */
public class SinglyLinkedList {

    class Node{

        int value;
        Node next;

        public Node(int value, Node next){
            this.value = value;
            this.next = next;
        }
        public int getValue() {
            return value;
        }

        public Node getNext() {
            return next;
        }
    }

}
