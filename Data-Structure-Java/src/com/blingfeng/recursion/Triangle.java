package com.blingfeng.recursion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Triangle {
    //  三角函数的第n项
    private static int number;
    private int result;

    public static void readInt() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("请输入第N项的值");
        String str = br.readLine();
        number = Integer.parseInt(str);
    }

    public static int triangle(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n + triangle(n-1);
        }
    }

    public static void main(String[] args) throws IOException {
          readInt();
        int result = triangle(number);
        System.out.println("第n项的值为："+result);
    }
}
