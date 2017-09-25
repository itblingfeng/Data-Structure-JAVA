package com.blingfeng.link;

/*
* 第五章排序链表
* */
class Link5 {
    public long data;
    public Link5 next;

    public Link5(long data) {
        this.data = data;
        next = null;
    }
}

class SortLinkList {
    private Link5 first;

    public SortLinkList() {
        this.first = null;
    }

    public void insert(long data) {
        Link5 newNode = new Link5(data);
        if (this.first == null) {
            this.first = newNode;
            return;
        }
        Link5 first = null;
        Link5 last = this.first;
        while (last != null && last.data < data) {
            first = last;
            last = last.next;

        }
        if (last == null) {
            last = newNode;
            first.next = last;
        } else {
            if (first == null) {
                first = newNode;
                newNode.next = last;
            }else {
                first.next = newNode;
                newNode.next = last;
            }
        }
    }

    public void delete(long data) {
        Link5 first = null;
        Link5 last = this.first;
        while (last != null && last.data != data) {
            first = last;
            last = last.next;
        }
        if (last == null) {
            System.out.println("找不到删除的节点");
        } else {
            if (first == null) {
                first = this.first;
            }
            first.next = last.next;
            System.out.println("删除节点成功");
        }
    }

}

public class SortLink {
    public static void main(String[] args) {
        SortLinkList sortLinkList = new SortLinkList();
        sortLinkList.insert(22);
        sortLinkList.insert(32);
        sortLinkList.insert(20);
        sortLinkList.delete(22);
    }
}
