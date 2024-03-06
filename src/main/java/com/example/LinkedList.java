package com.example;

public class LinkedList {
    Node head;
    Node tail;

    public void add(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            tail = head;
        }else{
            tail.next = newNode;
            tail = newNode;
        }
    }

    public void delete(){
        Node temp = head;
        while(temp.next != tail){
            temp = temp.next;
        }
        tail = temp;
        tail.next = null;
    }

    public void printList(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
        System.out.println();
    }

    public void firstadd(int data){
        Node n = new Node(data);
        n.next = head;
        head= n;
    }
}
