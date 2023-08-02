package com.zipcodewilmington.singlylinkedlist;

import java.util.Comparator;

/**
 * Created by leon on 1/10/18.
 */
public class SinglyLinkedList<T> implements LinkedListIface{

    class Node{

        T value;
        Node nextNode;

        public Node(T value){
            this.value = value;
//            this.nextNode = null;
        }
        public T getValue() {
            return value;
        }
        public void setValue(T value){ this.value = value;}

        public Node getNextNode() {
            return nextNode;
        }
        public void setNextNode(Node nextNode){
            this.nextNode = nextNode;
        }
    }

    Node first= null;
    Node last= null;



    @Override
    public void add(Object data) { //add a new node to the end of the list
//        Node node = new Node();
//        if (first == null){ //for the first item in the linked list
//            first = node; //size of list = 1
//            last = node; //so first = last
//        } else { //otherwise point the current last to the new node
//            last.setNextNode(node);
//            last = node; //and make the new node the new last
//        }
    }

    public void remove(int index){ //remove a node from the list given an index

    }


    public int findElement(T valueToFind){ //get the index of a given value/element

        return -1;
    }

    public int size(){ // get the size of the list

        return 0;
    }

    @Override
    public SinglyLinkedList copy() {
        return null;
    }

    @Override
    public void sort(Comparator comparator) {

    }


    @Override
    public boolean contains(Object data) {
        return false;
    }

    @Override
    public int find(Object data) {
        return 0;
    }


}
