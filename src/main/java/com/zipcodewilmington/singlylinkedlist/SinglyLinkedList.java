package com.zipcodewilmington.singlylinkedlist;

import java.util.Comparator;

/**
 * Created by leon on 1/10/18.
 */
public class SinglyLinkedList<T> implements LinkedListIface {

    private Node<T> head = null;

    public SinglyLinkedList() {
    }


    public Boolean isEmpty() {
        return head == null;
    }

    @Override
    public void add(Object data) {
        Node newNode = new Node(data);
        if (this.head == null) {
            this.head = newNode;
        } else {
            Node<T> temp = head;
            while (temp.hasNext()) {
                temp = temp.getNext();
            }
            temp.setNext(newNode);
        }

    }

    @Override
    public void remove(int index) throws IndexOutOfBoundsException {
        

    }

    @Override
    public T get(int index) throws IndexOutOfBoundsException {
        Node<T> temp = head;
        int counter = 0;

        while (index != counter){
            if (counter == index) return temp.getData();
            counter++;
            temp = temp.getNext();
        }


        return temp.getData();
    }

    @Override
    public boolean contains(Object data) {
        return (this.find(data) != -1);
    }

    @Override
    public int find(Object data) {
        if (!this.isEmpty()) {
            int found = -1;
            Node<T> temp = head;
            do {
                found++;
                if (temp.getData().equals(data)) {
                    return found;
                }
                temp = temp.getNext();
            } while (temp != null);
        }
        return -1;
    }

    @Override
    public int size() {
        if (this.isEmpty()) return 0;
        int counter = 0;
        Node<T> temp = head;
        do {
            counter++;
            temp = temp.getNext();
        } while (temp != null);
        return counter;
    }

    @Override
    public SinglyLinkedList copy() {
        return null;
    }

    @Override
    public void sort(Comparator comparator) {

    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append("head -> ");

        if (head != null) {
            Node<T> temp = head;
            do {
                sb.append("[" + temp.getData() + "] -> ");
                temp = temp.getNext();
            } while (temp != null);
        }


        sb.append("NULL");

        return sb.toString();
    }


}
