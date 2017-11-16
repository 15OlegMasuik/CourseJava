package com.gmail.olegmasiuk;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Marta on 14.11.2017.
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] a = new int[size];
        for (int i = 0; i < size; i++) {
            a[i] = sc.nextInt();
        }

        System.out.println(Arrays.toString(a));
        System.out.println(masivMax(a));

    }

    public static int masivMax(int[] a) {
        int max = a[0];
        for (int i = 0; i<a.length; i++) {
            if (max < a[i]) {
                max=a[i];
            }
        }
        return max;
    }
}
