package com.blingfeng.link.work;

/**
 * 作业5.1 实现基于有序链表的优先级队列，队列的删除操作应删除具有最小关键字的链节点
 */
class Link {
    public long data;
    public Link next;

    public Link(long data) {
        this.data = data;
        next = null;
    }
}

class SortLinkList {
    public Link first;

    public SortLinkList() {
        this.first = null;
    }

    public void insert(long data) {
        Link newNode = new Link(data);
        if (this.first == null) {
            this.first = newNode;
            return;
        }
        Link first = null;
        Link last = this.first;
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
        Link first = null;
        Link last = this.first;
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
class SortQueueOfLink{
    private SortLinkList linkList;
    public SortQueueOfLink(){
       linkList = new SortLinkList();
    }
    public void insert(long num){
        linkList.insert(num);
    }
    public void delete(){
        linkList.first = linkList.first.next;
    }
}
public class Link_work_5_1 {
    public static void main(String[] args){
        SortQueueOfLink sortQueueOfLink = new SortQueueOfLink();
        sortQueueOfLink.insert(20);
        sortQueueOfLink.insert(10);
        sortQueueOfLink.insert(99);
        sortQueueOfLink.insert(23);
        sortQueueOfLink.delete();
    }
}
