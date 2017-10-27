package gmail.masiukoleg;

import java.util.Scanner;

public class HomeWorkLv2T4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a;
		a = sc.nextInt();
		int k1 = a % 10;
		int k2 = a / 10 % 10;
		int k3 = a / 100 % 10;
		int k4 = a / 1000 % 10;
		int k5 = a / 10000 % 10;
		int k6 = a / 100000 % 10;
		if ((k1 == k6) && (k2 == k5) && (k3 == k4)) {
			System.out.println("Palindrom");
		} else {
			System.out.println(" NE Palindrom");
		}
      sc.close();
	}

}
