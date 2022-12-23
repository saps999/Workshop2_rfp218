package com.linkedlist;

public class LinkedListCustom {
    INode head;
    INode tail;

    public LinkedListCustom() {
        this.head = null;
        this.tail = null;
    }

    public void  add(INode newNode){
        if(this.tail==null){
            this.tail=newNode;
        }
        if (this.head==null){
            this.head=newNode;
        }
        else {
            INode tempNode = this.head;
            this.head=newNode;
            this.head.setNext(tempNode);
        }
    }
    public void append(INode newNode){
        if(this.tail==null){
            this.tail=newNode;
        }
        if (this.head==null){
            this.head=newNode;
        }
        else {
            INode tempNode =this.tail;
            this.tail.setNext(newNode);
            this.tail=newNode;
        }
    }

    @Override
    public String toString() {
        return "LinkedListCustom{" +
                "head=" + head +
                ", tail=" + tail +
                '}';
    }
    public void print(){
        System.out.println("My LinkedList: "+head);
    }
}
