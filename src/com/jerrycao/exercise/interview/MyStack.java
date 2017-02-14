package com.jerrycao.exercise.interview;

/**
 * Created by JerryCao on 2017/2/5.
 */
public class MyStack {
    private MyNode top;
    int size = 0;
    public MyNode peek(){
        if(top!=null){
            return top;
        }else{
            return null;
        }
    }
    public MyNode pop(){
        if(top!=null){
            MyNode temp = new MyNode(top.getVal());
            top = top.getNext();
            size--;
            return temp;
        }else{
            return null;
        }
    }
    public void push(int val){
        MyNode node = new MyNode(val);
        node.setNext(top);
        top = node;
        size++;
    }

    public int size(){
        return size;
    }

    public static void main(String[] args) {
        MyStack myStack = new MyStack();
        myStack.push(1);
        myStack.push(2);
        myStack.push(3);
        myStack.push(4);
        myStack.push(5);
        myStack.push(6);
        System.out.println(myStack.size()+"===");
        System.out.println(myStack.pop().getVal());
        System.out.println(myStack.size());
        System.out.println(myStack.pop().getVal());
        System.out.println(myStack.size());
        System.out.println(myStack.pop().getVal());
        System.out.println(myStack.size());
        System.out.println(myStack.pop().getVal());
        System.out.println(myStack.size());
        System.out.println(myStack.pop().getVal());
        System.out.println(myStack.size());
        System.out.println(myStack.pop().getVal());
        System.out.println(myStack.size());
    }
}
