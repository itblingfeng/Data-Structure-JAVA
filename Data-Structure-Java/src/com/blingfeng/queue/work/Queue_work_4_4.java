package com.blingfeng.queue.work;

/**
 * * 4.4 清单4.6中展示的优先级队列能够快速地删除最高优先级的数据项，但是
 * 插入数据项较慢。还要包括一个显示优先级队列内容的方法，要求和上机作
 * 业4.1中一样。
 */
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
        queue[size++] = num;
    }

    public void remove() {

        size--;
    }

    public long[] getQueue() {
        return queue;
    }
}

public class Queue_work_4_4 {
    public static void main(String[] args) {

    }
}
