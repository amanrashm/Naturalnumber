package com.aman;

import java.util.Scanner;

import static java.lang.System.out;

public class Naturalsum {
    public static void main(String[] args) {
        // write your code here
        int a , b;
        Scanner x = new Scanner(System.in);
        out.println("Give Value");
        a  = 1;
        b = x.nextInt();
        for (int i =1; i <= b ; i++){
            a = a+i;
            if(i != b ) {
                out.print(i + "+");
            }else
                out.print(i+"="+a);
        }
    }
}
