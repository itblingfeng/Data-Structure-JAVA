package com.blingfeng.stack;

class StackArray {
    //    栈的最大容量
    private int maxSize;
    //    栈顶指针默认-1
    private int top = -1;
    //    栈
    private long[] stack;

    //    初始化
    public StackArray(int maxSize) {
        this.maxSize = maxSize;
//    初始化栈
        this.stack = new long[maxSize];
    }

    //    push
    public void push(long num) {
//        在插入前先判断是否满
        if (isFull()) {
            System.out.println("栈已满");
            return;
        }
        stack[++top] = num;
    }

    //    pop
    public long pop() {
        if (isEmpty()) {
            return 0;
        }
        return stack[top--];
    }

    //    判断栈非空
    public boolean isEmpty() {
        return top == -1;
    }

    //    判断栈是否满
    public boolean isFull() {
        return top == maxSize - 1;
    }
}

public class Stack {
    public static void main(String[] args) {
        StackArray stackArray = new StackArray(5);
        stackArray.push(20);
        stackArray.push(10);
        stackArray.push(70);
        stackArray.push(80);
        stackArray.push(80);
        while (!stackArray.isEmpty()) {
            System.out.println(stackArray.pop());
        }
    }
}
