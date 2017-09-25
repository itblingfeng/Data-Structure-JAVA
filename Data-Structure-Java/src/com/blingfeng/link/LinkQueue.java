package com.blingfeng.link;

import java.util.LinkedList;

class Link4 {
    public double data;
    public Link4 next;

    public Link4(double data, Link4 next) {
        this.data = data;
        this.next = next;
    }

    public void display() {
        System.out.println(data);
    }
}

class LinkList4 {
    private Link4 first;
    private Link4 last;

    public LinkList4() {
        this.first = null;
        this.last = null;
    }

    public void insertFirst(Link4 node) {
        node.next = first;
        this.first = node;
    }

    public void insertLast(Link4 node) {
        this.last.next = node;
        this.last = node;

    }

    public void deleteFirst() {
        first = first.next;
    }
}

class LinkListQueue {
    private LinkList4 linkList;
    public LinkListQueue(){
        linkList = null;
    }
    public void insert(Link4 node) {
        linkList.insertLast(node);
    }

    public void delete() {
        linkList.deleteFirst();
    }
}

public class LinkQueue {
    public static void main(String[] args) {
        Link4 node1 = new Link4(20, null);
        Link4 node2 = new Link4(20, null);
        LinkListQueue linkListQueue = new LinkListQueue();
        linkListQueue.insert(node1);
        linkListQueue.insert(node2);
    }
}
