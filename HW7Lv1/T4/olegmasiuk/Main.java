package olegmasiuk;

import java.util.Arrays;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] a = new int[size];
        for (int i = 0; i < size; i++) {
            a[i] = sc.nextInt();

        }
        System.out.println(Arrays.toString(a));
        System.out.println(serchNumber(a,6));
    }
    public static int serchNumber(int[]m,int b){
        int number= -1;
        for (int i=0;i<m.length;i++){
            if(m[i]==b){
                number=i;
            }

        }
        return number;
    }
}
