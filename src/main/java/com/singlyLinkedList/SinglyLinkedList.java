package com.singlyLinkedList;

public class SinglyLinkedList<T> {
    private Node<T> head;
    private Node<T> tail;
    private int length;

    public SinglyLinkedList() {
        this.head = null;
        this.tail = null;
        this.length = 0;
    }

    public void push(T val){
        Node<T> newNode = new Node<>(val);
        if(this.head==null){
            this.head = newNode;
            this.tail = this.head;
        } else {
            this.tail.setNext(newNode);
            this.tail = newNode;
        }
        this.length++;
    }

    public T pop(){
        if(length==0) throw new RuntimeException("Empty list");
        Node<T> currentNode = this.head;
        T val = this.tail.getVal();
        if(length==1){
            this.head = null;
            this.tail = null;
            length--;
            return val;
        }
        while(currentNode.hasNext() && currentNode.getNext() != this.tail){
            currentNode = currentNode.getNext();
        }
        this.tail = currentNode;
        currentNode.setNext(null);
        length--;
        return val;

    }

    public T shift(){
        if(length==0) throw new RuntimeException("Empty list");
        Node<T> newHead = this.head.getNext();
        T val = this.head.getVal();
        this.head = newHead;
        this.length--;
        if(length==0) this.tail = null;
        return val;
    }

    public void unshift(T val){
        Node<T> newNode = new Node<>(val);
        if(this.length == 0){
            this.head = newNode;
            this.tail = newNode;
            return;
        }
        this.length++;
        newNode.setNext(this.head);
        this.head = newNode;
    }

    public T getVal(int index){
        if(index<0 || index>= this.length) throw new RuntimeException("Index out of bounds, index " + index + " for length " + this.length);
        int i = 0;
        Node<T> currentNode = this.head;
        while (i<index){
            currentNode = currentNode.getNext();
            i++;
        }
        return currentNode.getVal();
    }

    public Node<T> getHead() {
        return head;
    }

    public Node<T> getTail() {
        return tail;
    }

    public int getLength() {
        return length;
    }

}

