package com.blingfeng.link;

class Link {
    public double data;
    public Link next;

    public Link(double data, Link next) {
        this.data = data;
        this.next = next;
    }

    public void display() {
        System.out.println(data);
    }
}

class LinkList {
    private Link first = null;

    public LinkList() {
        this.first = null;
    }

    public void addFirst(Link first) {
        Link link = new Link(first.data, first.next);
        this.first = link;
    }

    public void deleteFirst() {
        this.first = this.first.next;
    }

    public void displayLink() {
        if (first != null) {
            Link node = first;
            do {
                System.out.println(node.data);
                node = node.next;
            } while (node!= null);
        }
    }

}

public class LinkApp {
    public static void main(String[] args) {
         Link node1 = new Link(2,null);
         Link node2 = new Link(3,node1);
         Link node3 = new Link(5,node2);
         Link node4 = new Link(1,node3);
         LinkList list = new LinkList();
         list.addFirst(node4);
         list.displayLink();
    }
}
