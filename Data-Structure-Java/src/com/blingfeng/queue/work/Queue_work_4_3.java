package com.blingfeng.queue.work;

/**
 *  * 4.3 编写一个基于上机作业4.2的Deque类的栈类。这个栈类应该与
 * stack.java程序（清单4.1）中的StackX类具有机同的方法和功能。
 */
class DeStack{

    private Queue stackDeque;
    public DeStack(int maxSize){
        stackDeque = new Queue(maxSize);
    }

    public void push(long num){
        stackDeque.insertRight(num);
    }
    public long pop(){
        return	stackDeque.removeRight();
    }
    public boolean isEmpty(){
        return stackDeque.isEmpty();
    }
    public boolean isFull(){
        return stackDeque.isFull();
    }

}
public class Queue_work_4_3 {
    public static void main(String[] args){

    }
}
