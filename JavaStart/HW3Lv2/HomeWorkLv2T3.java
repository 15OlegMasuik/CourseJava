package gmail.masiukoleg;

import java.util.Scanner;

public class HomeWorkLv2T3 {

	public static void main(String[] args) {

		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a;
		a = sc.nextInt();
		int k1 = a % 10;
		int k2 = a / 10 % 10;
		int k3 = a / 100 % 10;
		int k4 = a / 1000 % 10;
		int happy = (k4 + k3) / 2;

		if ((k1 + k2) == (k3 + k4)) {
			System.out.println("Happy ticket");
		} else if ((happy) == (k1 + k2)) {
			System.out.println(" double happy ticket");
		} else {
			System.out.println("Simple ticket");
		}

		sc.close();

	}

}
