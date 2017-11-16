package com.olegmasiuk;

import java.util.Scanner;

/**
 * Created by Marta on 14.11.2017.
 */
public class Task5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String text= sc.nextLine();
        System.out.println(words(text));

    }
    public static int words (String  text){
        int num=0;
        String[] t = text.split("[ ]");
        for (int i=0;i<t.length;i++){
            num++;
        }
        return num;
    }
}
