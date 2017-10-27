package com.gmail.olegmasiuk;

import java.util.Scanner;

public class HomeWorkTask2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Inpuåe apartment");
		int a = sc.nextInt();

		if ((a <= 36) && (a > 0)) {

			System.out.println("1 Passenger");
		} else if ((a > 36) && (a <= 72)) {
			System.out.println(" Passenger 2");
		} else if ((a > 72) && (a <= 108)) {
			System.out.println(" Passenger 3");
		} else if ((a > 108) && (a <= 144)) {
			System.out.println("Passenger  4");

		} else {

			System.out.println("doesn't exist ");
		}
		if ((a > 0) && (a >= 144)) {
			System.out.println("doesn't floor ");
		} else {

			int floor = a % 36;

			if ((floor <= 4) && (floor > 0)) {
				System.out.println("1-st floor");
			} else if ((floor > 4) && (floor <= 8)) {
				System.out.println("2-nd floor");
			} else if ((floor > 8) && (floor <= 12)) {
				System.out.println("3-nd floor");
			} else if ((floor > 12) && (floor <= 16)) {
				System.out.println("4 floor");
			} else if ((floor > 16) && (floor <= 20)) {
				System.out.println("5-nd floor");
			} else if ((floor > 20) && (floor <= 24)) {
				System.out.println("6-nd floor");
			} else if ((floor > 24) && (floor <= 28)) {
				System.out.println("7-nd floor");
			} else if ((floor > 28) && (floor <= 32)) {
				System.out.println("8-nd floor");
			} else if ((floor > 32) && (floor <= 36)) {
				System.out.println("9-nd floor");
			}
			sc.close();
		}
	}

}