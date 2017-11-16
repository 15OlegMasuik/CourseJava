package com.gmail.olegmasiuk;
import java.util.Scanner;
public class HomeWorkTask1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		double a;
		double b;
		double c;
		double d;
		double k;
		System.out.println("Inpute 4 numbers:");
		a=sc.nextDouble();
		b=sc.nextDouble();
		c=sc.nextDouble();
		d=sc.nextDouble();
		if (a>b && (a>c) &&(a>d)){
			k=a;
			} else if (b>c && b>d){
					k=b;
				} else if (c>d){
						k=c;
					}else{
							k=d;
					}
		
		System.out.println("max:"+k);
		sc.close();
	}

}
