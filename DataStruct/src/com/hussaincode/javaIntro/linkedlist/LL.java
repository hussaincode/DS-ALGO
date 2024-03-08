package com.hussaincode.javaIntro.linkedlist;

import java.util.Collections;
import java.util.LinkedList;

public class LL {
    /*public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.addFirst(5);
        System.out.println(list.get(0));

    }*/

    private Node head;
    private Node tail;
    private int size;

    public LL() {
        this.size=0;
    }
    //insertFirst Function
    public void insertFirst(int value){
        Node node = new Node(value);
        node.next = head;
        head = node;

        if (tail==null){
            tail=head;
        }
        size++;
    }

    //insertLast function
    public void insertLast(int value){
        if (tail==null){
            insertFirst(value);
            return;
        }
        Node node = new Node(value);
        tail.next = node;
        tail = node;

        size++;
    }

    //insert at some index function
    public void insertatIndex(int value, int index){
        if (index==0){
            insertFirst(value);
            return;
        }
        if (index==size){
            insertLast(value);
            return;
        }
        Node temp = head;
        for (int i=1; i<index; i++){
            temp =temp.next;
        }
        Node node = new Node(value,temp.next);
        temp.next = node;
        size++;
    }

    // insert using recursion
    public void insertRec(int val, int index) {
        head = insertRec(val, index, head);
    }
    private Node insertRec(int val, int index, Node node) {
        if (index == 0) {
            Node temp = new Node(val, node);
            size++;
            return temp;
        }

        node.next = insertRec(val, index-1, node.next);
        return node;
    }

    // deleteFirst function
    public int deleteFirst(){
        int value = head.value;
        head = head.next;
        if (head==null){
            tail=null;
        }
        size--;
        return value;
    }

    //deleteLast function
    public int deleteLast(){
        Node secondLast = get(size-2);
        int value = tail.value;
        tail=secondLast;
        tail.next=null;
        return value;
    }

    //deleteAtIndex function
    public int deleteAtIndex(int index){
        if (index==0){
            return deleteFirst();
        }
        if (index==size-1){
            return deleteLast();
        }
        Node prev = get(index-1);
        int value = prev.next.value;
        prev.next = prev.next.next;
        return value;
    }

    //findNode function
    public Node findNode(int value){
        Node node = head;
        while (node!=null){
            if(node.value==value){
                return node;
            }
            node=node.next;
        }
        return null;
    }

    //get node of the index
    public Node get(int index){
        Node node = head;
        for (int i=0; i<index; i++){
            node=node.next;
        }
        return node;
    }


    public void display(){
        Node temp = head;
        while (temp!=null){
            System.out.print(temp.value + " -> ");
            temp=temp.next;
        }
        System.out.println("END");
    }
    private class Node{
         int value;
         Node next;

         public Node(int value) {
             this.value = value;
         }

         public Node(int value, Node next) {
             this.value = value;
             this.next = next;
         }
     }
}
