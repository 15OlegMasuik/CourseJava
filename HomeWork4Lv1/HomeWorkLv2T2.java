package gmail.olegmasiuk;

/**
 * Вычислить с помощью цикла факториал числа - n введенного с
клавиатуры (4<n<16). Факториал числа это произведение всех чисел от
этого числа до 1. Например 5!=5*4*3*2*1=120
 */

import java.util.Scanner;

public class HomeWorkLv2T2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if ((4 < n) && (n < 16)) {
            int mod = 1;
            for (int i = 1; i < n + 1; i++) {

                mod *= i;
            }
            System.out.println("Answer:" + mod);

        } else {
            System.out.println("Repeat,number must be (4<n<16)");
        }
    }
}
