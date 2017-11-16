package gmail.olegmasiuk;

/**
 * 3) Напечатайте таблицу умножения на 5. предпочтительно печатать 1 x 5 =
5, 2 x 5 = 10, а не просто 5, 10 и т. д.
 */

import java.util.Scanner;

public class HpmeWorkLv1T3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = 1;

        for (int i = 1; i < n + 1; i++) {
            a = i*n;
            System.out.println( + i + "*" + n+"="+a);
        }
    }
}
