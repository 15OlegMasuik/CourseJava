package com.gmail.olegmasiuk;

import java.util.Scanner;

public class HomeWorkTask4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Inpute 3 numbers:");
		double a;
		double b;
		double c;
		a = sc.nextDouble();
		b = sc.nextDouble();
		c = sc.nextDouble();
		if (((a + c) > b) && ((b + c) > a) && ((a + b) > c)) {
			System.out.println("It's triangle");
		} else {
			System.out.println("It isn't triangle");
		}

	}

}
