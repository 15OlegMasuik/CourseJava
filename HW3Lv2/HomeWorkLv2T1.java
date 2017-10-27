package gmail.masiukoleg;

import java.util.Scanner;

public class HomeWorkLv2T1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int x;
		int r=4;
		int y;
		x=sc.nextInt();
		y=sc.nextInt();
		double distans=Math.sqrt(x*x+y*y);
		if (distans<=r){
			System.out.println("enter");
		}else{
			System.out.println("not enter");
		}
		
		

	}

}
