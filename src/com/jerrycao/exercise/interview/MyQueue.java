package com.jerrycao.exercise.interview;

/**
 * Created by JerryCao on 2017/2/5.
 */
public class MyQueue {
    private MyNode first,last;
    public void enqueue(int val){
        MyNode node = new MyNode(val);
        if(first == null){
            first = node;
            last = first;
        }else{
            last.setNext(node);
            last = node;
        }
    }
    public MyNode dequeue(){
        if(first == null){
            return null;
        }else{
            MyNode node = new MyNode(first.getVal());
            first = first.getNext();
            return node;
        }
    }

    public static void main(String[] args) {
        MyQueue queue = new MyQueue();
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);
        queue.enqueue(5);
        System.out.println(queue.dequeue().getVal());
        System.out.println(queue.dequeue().getVal());
        System.out.println(queue.dequeue().getVal());
        System.out.println(queue.dequeue().getVal());
        System.out.println(queue.dequeue().getVal());
    }
}
