package com.blingfeng.sort;

import java.util.Arrays;

class ArrayBubb{
    //        一个Long型数组
    private Long[] array;
    //        插入的数量，进行计数
    private int tag;
    //       构造函数
    public ArrayBubb(Integer maxSize){
        this.array=new Long[maxSize];
    }
    //        插入待排序数
    public void insert(Long num){
        this.array[tag] = num;
        tag++;
    }
    //        排序算法
    public void sort(){
        for (int i=0;i<tag-1;i++){
            for(int j=0;j<tag-1-i;j++){
                if(array[j]>array[j+1])
                    change(j,j+1);
            }
        }
    }
    //        数组元素交换
    private void change(int front,int back){
        long temp = this.array[front];
        this.array[front] = this.array[back];
        this.array[back] = temp;
    }

    public Long[] getArray() {
        return array;
    }
}


public class BubbleSort {
    /*冒泡排序*/

    public static void main(String[] args){
        long start = System.currentTimeMillis();
         ArrayBubb arrayBubb = new ArrayBubb(10);
         arrayBubb.insert(10l);
         arrayBubb.insert(20l);
         arrayBubb.insert(3l);
         arrayBubb.insert(201l);
         arrayBubb.insert(1l);
        arrayBubb.sort();
        Long[] array = arrayBubb.getArray();
        System.out.println(Arrays.toString(array));
        long end = System.currentTimeMillis();
        System.out.println(end - start);
    }

}
