package gmail.masiukoleg;

import java.util.Scanner;

public class HomeWorkLv2T2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter x,y");
		int x;
		int y;
		x = sc.nextInt();
		y = sc.nextInt();
		int x1 = 0;
		int x2 = 4;
		int x3 = 6;
		int y1 = 0;
		int y2 = 4;
		int y3 = 1;
		double ab = Math.sqrt(Math.pow((x1 - x2), 2) + Math.pow((y1 - y2), 2));
		double ac = Math.sqrt(Math.pow((x1 - x3), 2) + Math.pow((y1 - y3), 2));
		double bc = Math.sqrt(Math.pow((x2 - x3), 2) + Math.pow((y2 - y3), 2));

		double ad = Math.sqrt(Math.pow((x1 - x), 2) + Math.pow((y1 - y), 2));
		double bd = Math.sqrt(Math.pow((x2 - x), 2) + Math.pow((y2 - y), 2));
		double cd = Math.sqrt(Math.pow((x3 - x), 2) + Math.pow((y3 - y), 2));
		// abc
		double pbig = (ab + ac + bc) / 2;
		double sbig = Math.sqrt(pbig * (pbig - ab) * (pbig - ac) * (pbig - bc));
		// ACD
		double ps1 = (ab + bd + ad) / 2;
		double ss1 = Math.sqrt(ps1 * (ps1 - ab) * (ps1 - bd) * (ps1 - ad));
		// BCD
		double ps2 = (bc + bd + cd) / 2;
		double ss2 = Math.sqrt(pbig * (ps2 - bc) * (ps2 - cd) * (ps2 - cd));
		// ACD
		double ps3 = (ac + ad + cd) / 2;
		double ss3 = Math.sqrt(pbig * (ps3 - ac) * (ps3 - ad) * (ps3 - cd));
		double s3 = ss1 + ss2 + ss3;
		if (sbig >= (s3)) {
			System.out.println("enter");
		} else {
			System.out.println("not enter");
		}

	}

}
