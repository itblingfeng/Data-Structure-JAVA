package com.blingfeng.queue.work;

/**
 * * 4.2 根据本章里对双端队列的讨论编写一个Deque类，它应该包括
 * insertLeft()、insertRight()、removeLeft()、removeRight()、
 * isEmpty()、isFull()方法。要求像队列那样支持在数据末端的回绕。
 */
//这里的理解就是左插入就是向队头插入 右插入就是往队尾插入
class Queue{
    private int maxSize;
    private long [] queue;
    private int front;
    private int rear;
    private int size;
    public Queue(int maxSize){
        this.maxSize = maxSize;
        queue = new long[maxSize];
        size = 0;
        front = 0;
        rear = -1;
    }
    public void insertLeft(long num){
        if(front ==0)
            front = maxSize;
        queue[--front] = num;
    }
    public void insertRight(long num){
        if(rear ==maxSize-1)
            rear = -1;
        queue[++rear] = num;
    }
//    将队头删除
    public void removeLeft(){
        if(front ==maxSize-1)
            front = -1;
        front++;
    }
    public void removeRight(){
         if(rear == 0)
             rear = maxSize;
         rear--;
    }
    public boolean isEmpty(){
         return rear - front !=0;
    }
//    2 3 4 2 12 43 54 12
    public boolean isFull(){
        return (front>rear&&front-rear==1)||(front<rear&&rear-front == maxSize-1);
    }

}
public class Queue_work_4_2 {
    public static void main(String[]  args){
          Queue queue = new Queue(20);
          queue.insertLeft(20);
          queue.insertRight(10);
    }
}
