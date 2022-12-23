package com.linkedlist;

public class LinkedListMain {
    public static void main(String[] args) {
        MyNode<Integer> firstNode = new MyNode<>(50);
        MyNode<Integer> secondNode = new MyNode<>(60);
        MyNode<Integer> thirdNode = new MyNode<>(70);

        LinkedListCustom list =new LinkedListCustom();
        /*list.add(firstNode);
        list.add(secondNode);
        list.add(thirdNode);
        list.print();*/

        list.append(firstNode);
        list.append(secondNode);
        list.append(thirdNode);
        list.print();

    }
}
