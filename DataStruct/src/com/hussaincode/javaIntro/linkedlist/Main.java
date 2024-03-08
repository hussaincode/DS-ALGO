package com.hussaincode.javaIntro.linkedlist;

public class Main {
    public static void main(String[] args) {
       /* LL list = new LL();
        list.insertFirst(3);
        list.insertFirst(5);
        list.insertFirst(15);
        list.insertLast(99);
        list.insertatIndex(88,2);
        list.display();
        System.out.println(list.deleteFirst());
        list.display();
        System.out.println(list.deleteLast());
        list.display();
        System.out.println(list.deleteAtIndex(2));
        list.display();
        System.out.println(list.findNode(88));*/

       /* DLL list = new DLL();
        list.insertFirst(3);
        list.insertFirst(5);
        list.insertFirst(15);
        list.display();*/

         LL list = new LL();
//        CLL list = new CLL();
        list.insertFirst(23);
        list.insertFirst(3);
        list.insertFirst(19);
        list.insertFirst(75);
        list.display();
//        list.delete(19);
        list.display();
        list.insertRec(88, 2);
        list.display();
    }
}
