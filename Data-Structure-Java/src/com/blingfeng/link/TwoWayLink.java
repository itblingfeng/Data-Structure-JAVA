package com.blingfeng.link;
class Link3 {
    public double data;
    public Link3 next;

    public Link3(double data, Link3 next) {
        this.data = data;
        this.next = next;
    }

    public void display() {
        System.out.println(data);
    }
}
class FirstLastLink{
    private Link3 first;
    private Link3 last;
    public FirstLastLink(){
        this.first = null;
        this.last = null;
    }
    public void insertFirst(Link3 node){
        node.next = first;
        this.first = node;
    }
    public void insertLast(Link3 node){
        this.last.next = node;
        this.last = node;

    }

}
public class TwoWayLink {
    public static void main(String[] args){
        Link3 node1 = new Link3(20,null);
        Link3 node2 = new Link3(10,node1);
        FirstLastLink firstLastLink = new FirstLastLink();
        firstLastLink.insertFirst(node1);
        firstLastLink.insertLast(node2);
    }
}
