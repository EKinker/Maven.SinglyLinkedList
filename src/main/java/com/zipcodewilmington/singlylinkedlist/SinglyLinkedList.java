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
    public void add(Object data) {

    }

    @Override
    public void remove(int index) throws IndexOutOfBoundsException {

    }

    @Override
    public Object get(int index) throws IndexOutOfBoundsException {
        return null;
    }

    @Override
    public boolean contains(Object data) {
        return false;
    }

    @Override
    public int find(Object data) {
        return 0;
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public SinglyLinkedList copy() {
        return null;
    }

    @Override
    public void sort(Comparator comparator) {

    }




}
