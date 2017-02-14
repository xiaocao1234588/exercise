package com.jerrycao.exercise.interview;

import java.util.Stack;

/**
 * Created by JerryCao on 2017/1/15.
 */
public class TwoStackImplQueueTest {
    public static void main(String[] args) {
        MyQueue myQueue = new MyQueue();
        myQueue.add(1);
        myQueue.add(2);
        myQueue.add(3);
        Integer value = null;
        while ((value=myQueue.poll())!=null){
            System.out.println(value);
        }
    }

    static class MyQueue{
        private Stack<Integer> stack_1;
        private Stack<Integer> stack_2;

        public MyQueue() {
            stack_1 = new Stack<Integer>();
            stack_2 = new Stack<Integer>();
        }

        public void add(Integer value){
            stack_1.push(value);
        }

        public Integer poll(){
           if(stack_2.isEmpty()){
               if(stack_1.isEmpty()){
                   return null;
               }else{
                   while (!stack_1.isEmpty()){
                       stack_2.push(stack_1.pop());
                   }
                   return stack_2.pop();
               }
           }else {
               return stack_2.pop();
           }
        }
    }
}
