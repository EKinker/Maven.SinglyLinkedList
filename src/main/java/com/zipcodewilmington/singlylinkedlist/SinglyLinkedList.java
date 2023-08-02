package com.zipcodewilmington.singlylinkedlist;

/**
 * Created by leon on 1/10/18.
 */
public class SinglyLinkedList<T> {

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

    public void add(T value){  //add a new node to the end of the list
        Node node = new Node(value);
        if (first == null){ //for the first item in the linked list
            first = node; //size of list = 1
            last = node; //so first = last
        } else { //otherwise point the current last to the new node
            last.setNextNode(node);
            last = node; //and make the new node the new last
        }
    }

    public void remove(int index){ //remove a node from the list given an index

    }

    public boolean contains(T valueToFind){

        return false;
    }

    public int findElement(T valueToFind){ //get the index of a given value/element

        return -1;
    }

    public int size(){ // get the size of the list

        return 0;
    }

    public T get(int index) { //return the element from the list if given the index

        return null;
    }

    public SinglyLinkedList<T> copy(SinglyLinkedList<T> list){

        return null;
    }

    public void sort(SinglyLinkedList<T> list){

    }

}
