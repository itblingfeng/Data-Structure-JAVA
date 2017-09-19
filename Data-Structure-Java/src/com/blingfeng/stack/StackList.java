package com.blingfeng.stack;

import java.util.LinkedList;
import java.util.List;

class ListStack {
    //    用链表来作栈
    private List listStack = new LinkedList();

    public void push(long num) {
        listStack.add(num);
    }

    public long pop() {
        return (Long) listStack.remove(listStack.size() - 1);
    }

    public boolean isEmpty() {
        return listStack.size() == 0;
    }
}

//用链表作为栈，不需要预定大小，可扩展
public class StackList {
    public static void main(String[] args) {
        ListStack listStack = new ListStack();
        listStack.push(20);
        listStack.push(77);
        listStack.push(20);
        listStack.push(99);
        listStack.push(1111);
        while (!listStack.isEmpty()) {
            System.out.println(listStack.pop());
        }
    }
}
