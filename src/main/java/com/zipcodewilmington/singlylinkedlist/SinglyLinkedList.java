package com.zipcodewilmington.singlylinkedlist;

/**
 * Created by leon on 1/10/18.
 */
public class SinglyLinkedList{

    public Node head = null;

    public Node tail = null;



    public boolean add(int data){
        Node newNode = new Node(data);

        if(head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
            return true;
        }

        return false;
    }


    public void remove(int data) {
        this.tail.data = data;

        if (head == null) {
            System.out.println("List is empty");
        } else {
        if(head != tail){
            Node current = head;
            while(current.next!=tail){
                current = current.next;
            }
            tail = current;
            tail.next = null;
        }
        else {
            head = tail = null;
        }
        }
    }

    public Integer size() {
        int count = 0;
        for(Node n = head; n.next != null; n = n.next){
            count++;
        }
        return count;
    }

    public Integer get(int data) {
        this.tail.data = data;
        if(data < 0 || data >= size()) {
            throw new IllegalArgumentException("index was out of bounds");
        }
        Node current = head;
        for(int i = 0; i<data; i++){
            current = current.next;
        }
        return current.data;
    }

    public int find(int i) {
         int index = 0;
         Node current = head;
         while(current != null){
             if(current.data==i) {
                 return index;
             }
             index++;
             current = current.next;
         }
         return -1;
    }

    public void sort() {
        int temp;
        Node current = head, index = null;
        if(head == null){
            return;
        }
        else {
            while(current != null){
                index = current.next;

                while (index != null){
                    if(current.data > index. data){
                        temp = current.data;
                        current.data = index.data;
                        index.data = temp;
                    }
                    index = index.next;
                }
                current = current.next;
            }
        }



    }

    public boolean contains(int value) {
        Node current = head;
        while(current !=null){
            if(current.data==value){
                return true;
            }
            current = current.next;
        }
        return false;
    }
}
