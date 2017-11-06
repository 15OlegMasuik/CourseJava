package gmail.olegmasiuk;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Marta on 06.11.2017.
 */
public class Home5T2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Inpute Size:");
        int size = sc.nextInt();
        int[] number = new int[size];
        for (int i = 0; i < number.length; i++) {
            number[i] = sc.nextInt();

        }
        System.out.println(Arrays.toString(number));
        sc.close();
    }

}
