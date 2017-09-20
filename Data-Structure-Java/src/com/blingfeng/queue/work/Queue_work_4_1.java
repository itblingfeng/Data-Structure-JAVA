package com.blingfeng.queue.work;

import java.util.Arrays;

/**
 * 编程作业
 * 4.1 为queue.java 程序（清单4.4）的Queue类中写一个方法，显示队列的
 * 内容。注意这并不是要简单的显示出数组的内容。它要求按数据项插入的队
 * 列的顺序，从第一个插入的数据项到最后一个插入的数据项显示出来。不要
 * 输出因为在数组末端回绕而折成两半的样子。注意无论front和rear在什么
 * 位置上，都要正确显示出一个数据项和没有数据项的情况。
 **/
//队列(数组实现)
class QueueArray {

    private int maxSize;
    private long[] queue;
    //    队头指针
    private int rear;
    //    队尾指针
    private int front;
    //    队列长度
    private int size;

    public QueueArray(int maxSize) {
//       初始化队列
        this.maxSize = maxSize;
        queue = new long[maxSize];
        front = 0;
        rear = -1;
        size = 0;
    }

    public void insert(long num) {
//       先判断队列
        if (rear == maxSize - 1)
            rear = -1;
        queue[++rear] = num;
        size++;
    }

    public long remove() {
//        移除判断队头
        long temp = queue[front];
        if (front == maxSize - 1)
            front = 0;
        size--;
        return temp;
    }

    public long[] getQueue() {
        return queue;
    }

    /*    编程作业4.1  */
    public void printQueue() {
        if (rear < front) {
            for (int i = front; i < queue.length; i++) {
                System.out.print(queue[i] + " ");
            }
            for (int i = 0; i <= rear; i++) {
                System.out.print(queue[i] + " ");
            }
        } else {
            for (int i =front;i<=rear;i++){
                System.out.print(queue[i]+" ");
            }
        }
    }
}

public class Queue_work_4_1 {
    public static void main(String[] args){
       QueueArray queueArray = new QueueArray(15);
        queueArray.insert(20);
        queueArray.insert(10);
        queueArray.insert(2);
        queueArray.insert(26);
        queueArray.insert(59);
        queueArray.insert(90);
        queueArray.insert(57);
        queueArray.insert(11);
        queueArray.insert(55);
        queueArray.insert(32);
        queueArray.insert(21);
        long[] queue = queueArray.getQueue();
        queueArray.printQueue();

    }
}
