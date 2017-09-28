package com.blingfeng.recursion;
//1     3    0
class Tow {
    //    初始塔
    public char from = 'A';
    //    中间塔
    public char inner ='B';
//    目的塔
    public char to = 'C';
    public int count = 3;
    public void doMove(int count,char from,char inner,char to){
        if(count==1){
            System.out.println(from+"----->"+to);
            return;
        }
        doMove(count-1,from,to,inner);
        System.out.println(from+"----->"+to);
        doMove(count-1,inner,from,to);
    }
}

public class Tower {
    public static void main(String[] args) {
     Tow tow = new Tow();
     tow.doMove(tow.count,tow.from,tow.inner,tow.to);
    }
}
