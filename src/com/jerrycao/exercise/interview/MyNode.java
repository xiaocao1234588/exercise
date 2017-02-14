package com.jerrycao.exercise.interview;

/**
 * Created by JerryCao on 2017/2/5.
 */
public class MyNode {
    private int val;
    private MyNode next;

    public MyNode(int val) {
        this.val = val;
        this.next = null;
    }

    public int getVal() {
        return val;
    }

    public MyNode getNext() {
        return next;
    }

    public void setNext(MyNode next) {
        this.next = next;
    }
}