package com.aman;
import java.util.Scanner;
import static java.lang.System.out;

public class SumNatural {

    public static void main(String[] args) {
        // write your code here
        int a = 1;
        Scanner x = new Scanner(System.in);
        out.println("Give Value");

        a = x.nextInt();
        for (int i =1; i<= a ; i++){
            a = a+i;


            out.println(a);
        }
    }
}
