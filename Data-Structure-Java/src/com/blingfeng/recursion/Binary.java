package com.blingfeng.recursion;

class BinaryFind {
    public int front = 0;
    public int later = -1;
    private long num[];
    private long searchNumber;
    private int count = 0;

    public BinaryFind(int size) {
        num = new long[size];
    }

    //    28 83 19 4 95 21 12 54 123
    public int find(long searchNumber, int front, int later) {
//二分查找中间点的坐标
        int middle = (front + later) / 2;
        if (num[middle] == searchNumber)
            return middle;
        else if (front > later)
//            没有找到元素
            return -1;
        else {
            if (num[middle] > searchNumber)
                return find(searchNumber, front, middle - 1);
            else
                return find(searchNumber, middle + 1, later);
        }
    }

    public void insert(long num) {
        this.num[count++] = num;
        later++;
    }
}

public class Binary {

    public static void main(String[] args) {
        BinaryFind binaryFind = new BinaryFind(20);
        binaryFind.insert(12);
        binaryFind.insert(23);
        binaryFind.insert(26);
        binaryFind.insert(43);
        binaryFind.insert(47);
        binaryFind.insert(55);
        binaryFind.insert(58);
        binaryFind.insert(77);
        binaryFind.insert(87);
        int location = binaryFind.find(87 ,binaryFind.front, binaryFind.later);
        if(location!=-1)
        System.out.println("查找的元素的位置为："+location);
        else
            System.out.println("没有查找到元素");
    }
}
