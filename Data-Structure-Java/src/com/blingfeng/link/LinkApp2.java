package com.blingfeng.link;

class Link2 {
    public double data;
    public Link2 next;

    public Link2(double data, Link2 next) {
        this.data = data;
        this.next = next;
    }

    public void display() {
        System.out.println(data);
    }
}

class LinkList2 {
    private Link2 first = null;

    public LinkList2() {
        this.first = null;
    }

    public void addFirst(Link2 first) {
        Link2 link = new Link2(first.data, first.next);
        this.first = link;
    }

    public void deleteFirst() {
        this.first = this.first.next;
    }

    public void displayLink() {
        if (first != null) {
            Link2 node = first;
            do {
                System.out.println(node.data);
                node = node.next;
            } while (node != null);
        }
    }

    public Link2 find(double num) {
        if (first != null) {
            Link2 node = first;
            while (node != null) {
                if (node.next == null) {
                    return null;
                }
                if (node.data == num) {
                    return node;
                }
            }
        } else {
            return null;
        }
        return null;
    }

    public void delete(double num) {
        if (first != null){
            Link2 front = first;
            Link2 node = null;
            if(front.next!=null){
                node = front.next;
            }
            while(node!=null){
                if(node.data ==num ){
                    front = node.next;
                }
                if(front.next!=null){
                    front = node;
                    node = node.next;
                }

            }
        }
    }

}

public class LinkApp2 {
    public static void main(String[] args) {

    }
}
