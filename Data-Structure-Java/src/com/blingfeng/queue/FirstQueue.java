package com.blingfeng.queue;

import java.util.Arrays;

class FirstQueueArray {
    private int maxSize;
    private long[] queue;
    private int size;

    public FirstQueueArray(int maxSize) {
        this.maxSize = maxSize;
        queue = new long[maxSize];
        size = 0;
    }

    //    20                   19 33 44 581 3394 599
    public void insert(long num) {
        int i;
        if (size == 0)
            queue[size++] = num;
        else {
            for (i = size - 1; i >=0; i--) {
                if (queue[i] < num) {
                    queue[i + 1] = queue[i];
                } else {
                    break;
                }

            }
            queue[++i] = num;
            size++;
        }
    }

    public void remove() {
        size--;
    }

    public long[] getQueue() {
        return queue;
    }
}

public class FirstQueue {
    public static void main(String[] args) {
        FirstQueueArray firstQueueArray = new FirstQueueArray(10);
        firstQueueArray.insert(10);
        firstQueueArray.insert(17);
        firstQueueArray.insert(92);
        firstQueueArray.insert(555);
        firstQueueArray.insert(19);
        firstQueueArray.insert(15);
        firstQueueArray.insert(32);
        long[] queue = firstQueueArray.getQueue();
        System.out.println(Arrays.toString(queue));
    }
}
