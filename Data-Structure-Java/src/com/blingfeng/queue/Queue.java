package com.blingfeng.queue;

import java.util.Arrays;

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
}

public class Queue {
    public static void main(String[] args) {
        QueueArray queueArray = new QueueArray(30);
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
        System.out.println(Arrays.toString(queue));

    }
}
















