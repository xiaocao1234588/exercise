package com.jerrycao.exercise.interview;

import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

/**
 * Created by JerryCao on 2017/1/15.
 */
public class TwoQueueImplementStackTest {
    public static void main(String[] args) {
        MyStack myStack= new MyStack();
        myStack.push(1);
        myStack.push(2);
        myStack.push(3);
        Integer i = null;
        while ( (i = myStack.pop()) != null){
            System.out.println(i);
        }
    }

    static class MyStack{
        private Queue<Integer> queue_1;
        private Queue<Integer> queue_2;

        public MyStack() {
            queue_1 = new LinkedBlockingQueue<Integer>();
            queue_2 = new LinkedBlockingQueue<Integer>();
        }

        public void push(Integer i){
            if (queue_2.isEmpty()){
                queue_1.offer(i);
            }else{
                queue_2.offer(i);
            }
        }

        public Integer pop(){
            if (queue_1.isEmpty() && !queue_2.isEmpty()){
                return swapTwoQueue(queue_1, queue_2);
            }else if(!queue_1.isEmpty() && queue_2.isEmpty()){
                return  swapTwoQueue(queue_2, queue_1);
            }else {
                return null;
            }
        }

        private Integer swapTwoQueue(Queue<Integer> emptyQueue, Queue<Integer> fullQueue){
            while (fullQueue.size() != 1){
                emptyQueue.offer(fullQueue.poll());
            }
            return fullQueue.poll();
        }
    }
}
