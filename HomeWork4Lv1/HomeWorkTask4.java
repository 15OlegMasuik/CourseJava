package gmail.olegmasiuk;
import java.util.Scanner;
/**
 * Created by Marta on 31.10.2017.
 */
public class HomeWorkTask4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                if (j == 1  || i == 1 || i == n|| j == m) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println("");

        }
    }
}