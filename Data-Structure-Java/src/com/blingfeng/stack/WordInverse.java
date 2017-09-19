package com.blingfeng.stack;

import java.io.*;
import java.util.LinkedList;
import java.util.List;

class Inverse{
//    用list作为栈
    private List listStack = new LinkedList();
//    存储单词
    private String str;
    private String newStr="";
//    接收方法
    public void getWord() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        str = br.readLine();
    }

    public void inverse(){
        for(int i=0;i<str.length();i++) {
            listStack.add(str.charAt(i));
        }
        while(listStack.size()!=0){
            newStr = newStr+listStack.remove(listStack.size()-1);
        }
    }

    public String getNewStr() {
        return newStr;
    }
}
public class WordInverse {
    public static void main(String[] args) throws IOException {
        Inverse inverse = new Inverse();
        inverse.getWord();
        inverse.inverse();
        String newStr = inverse.getNewStr();
        System.out.println(newStr);
    }
}
