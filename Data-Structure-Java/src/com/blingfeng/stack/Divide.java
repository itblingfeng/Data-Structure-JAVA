package com.blingfeng.stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

//a{b[c(d)]a} 按分隔符匹配
class DivideStack{
//    用来保存通配符
    private List<Character> listStack = new LinkedList<>();
    private List<Character> charStack = new LinkedList<>();;
    private String str;
    public void read() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        str = br.readLine();
    }
    public void deal(){
        char c;
        for(int i=0;i<str.length();i++){
            c = str.charAt(i);
            if(c=='{'||c=='['||c=='('){
                push(str.charAt(i));
            }else if(c=='}'||c==']'||c==')'){
               switch(c) {
                   case '}':
                       if ('{' != pop()) {
                           System.out.println("分隔符不匹配!");
                           return;
                       }
                       break;
                   case ']':
                       if ('[' != pop()) {
                           System.out.println("分隔符不匹配!");
                           return;
                       }
                       break;
                   case ')':
                       if ('(' != pop()) {
                           System.out.println("分隔符不匹配!");
                           return;
                       }
               }
            }else {
                charStack.add(c);
            }

    }
    if(listStack.size()!=0){
            throw new RuntimeException("分隔符不匹配");
    }
    }
    private void push(char c){
        listStack.add(c);
    }
    private char pop(){
       return listStack.remove(listStack.size()-1);
    }

    public List<Character> getCharStack() {
        return charStack;
    }
}
public class Divide {
    public static void main(String[] args) throws IOException {
        DivideStack divideStack = new DivideStack();
        divideStack.read();
        divideStack.deal();
        for (Character character : divideStack.getCharStack()) {
            System.out.print(character.charValue());
        }


    }
}
