package com.list;

import com.singlyLinkedList.Node;
import com.singlyLinkedList.SinglyLinkedList;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class SinglyLinkedListTest {

    SinglyLinkedList<Integer> list;

    @BeforeEach
    public void init(){
        list = new SinglyLinkedList<>();
    }

    @Test
    public void test1() {
        list.push(38);
        Assertions.assertEquals(list.getLength(),1);
        Assertions.assertEquals(list.getTail().getVal(), 38);
        list.push(39);
        Assertions.assertEquals(list.getLength(),2);
        Assertions.assertEquals(list.getTail().getVal(), 39);
        Assertions.assertEquals(list.getHead().getVal(), 38);
    }

    @Test
    public void test2() {
        list.push(38);
        list.push(39);
        list.push(40);
        list.pop();
        Assertions.assertEquals(list.getLength(),2);
        Assertions.assertEquals(list.getTail().getVal(), 39);
        Assertions.assertEquals(list.getHead().getVal(), 38);

    }

    @Test
    public void test3() {
        list.push(38);
        int val = list.pop();
        Assertions.assertEquals(list.getLength(),0);
        Assertions.assertEquals(val, 38);
        Assertions.assertNull(list.getTail());
        Assertions.assertNull(list.getHead());
    }

    @Test
    public void shiftTest() {
        list.push(38);
        list.push(39);
        list.push(40);
        int val = list.shift();
        Assertions.assertEquals(val, 38);
        Assertions.assertEquals(list.getLength(),2);
        Assertions.assertEquals(list.getTail().getVal(), 40);
        Assertions.assertEquals(list.getHead().getVal(), 39);
    }

    @Test
    public void shiftTestLengthOne() {
        list.push(38);
        list.push(39);
        list.shift();
        int val = list.shift();
        Assertions.assertEquals(list.getLength(),0);
        Assertions.assertEquals(val, 39);
        Assertions.assertNull(list.getTail(), "Tail is not null");
        Assertions.assertNull(list.getHead(), "Head is not null");
    }

    @Test
    public void getIndex() {
        list.push(38);
        list.push(39);
        list.push(40);
        list.push(41);
        int val = list.getVal(3);
        Assertions.assertEquals(val,41);
    }

    @Test
    public void getIndexOutOfBounds() {
        Assertions.assertThrows(RuntimeException.class, () -> list.getVal(5));
    }

}