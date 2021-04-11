package com.singlyLinkedList;

public class Node<T> {
    private T val;
    private Node<T> next;

    public Node(T val) {
        this.val = val;
        this.next = null;
    }

    public T getVal() {
        return val;
    }

    public void setVal(T val) {
        this.val = val;
    }

    public Node<T> getNext() {
        return next;
    }

    public boolean hasNext(){
        return this.next != null;
    }

    protected void setNext(Node<T> next) {
        this.next = next;
    }
}
