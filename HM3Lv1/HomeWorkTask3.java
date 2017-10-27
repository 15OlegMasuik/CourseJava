package com.gmail.olegmasiuk;

import java.util.Scanner;

public class HomeWorkTask3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Inpute year:");
		int year = sc.nextInt();

		if ((year % 4) == 0 && (year % 100) != 0) {
			System.out.println("hight year");
		} else if (year % 400 == 0) {
			System.out.println("hight year");
		} else {
			System.out.println("norm year)");
		}
		sc.close();
	}

}
