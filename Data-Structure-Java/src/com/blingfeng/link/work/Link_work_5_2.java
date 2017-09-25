package com.blingfeng.link.work;

/**
 * 5.2 实现一个基于双向链表的双向队列
 **/
class Link1 {
    public double data;
    public Link1 next;

    public Link1(long data) {
        this.data = data;
        this.next = null;
    }

    public void display() {
        System.out.println(data);
    }
}

class FirstLastLink {
    private Link1 first;
    private Link1 last;

    public FirstLastLink() {
        this.first = null;
        this.last = null;
    }

    public void insertFirst(Link1 node) {
        node.next = first;
        this.first = node;
    }

    public void insertLast(Link1 node) {
        this.last.next = node;
        this.last = node;

    }

    public void leftDelete() {
        this.first = this.first.next;
    }

    public void rightDelete() {
        Link1 node = this.first;
        while (node.next != last) {
              node = node.next;
        }
        node.next = null;
        last = node;
    }
}

class DeQueue {
    private FirstLastLink firstLastLink;

    public DeQueue() {
        firstLastLink = new FirstLastLink();
    }

    //    左插入
    public void leftInsert(long num) {
        Link1 node = new Link1(num);
        firstLastLink.insertFirst(node);
    }

    //    右插入
    public void rightInsert(long num) {
        Link1 node = new Link1(num);
        firstLastLink.insertLast(node);
    }

    //    左删除
    public void leftDelete() {
        firstLastLink.leftDelete();
    }

    //    右删除
    public void rightDelete() {
          firstLastLink.rightDelete();
    }

}

public class Link_work_5_2 {
    public static void main(String[] args) {
      DeQueue deQueue = new DeQueue();
      deQueue.leftInsert(20);
      deQueue.leftInsert(10);

    }
}

