package gmail.olegmasiuk94;

import java.util.Arrays;
import java.util.Scanner;

public class Sobaka {

	public static void main(String[] args) {
	String d ="d";
	String a= "a";
		Scanner sc = new Scanner(System.in);
		
		String text1 = "@_________";
		char[] t = text1.toCharArray();
		String input = sc.nextLine();
		for (int i = 0; i > t.length; i++) {
		//i = text1.indexOf("@");
		
		if (input==d){
			System.out.println(Arrays.toString(t)+"_"+"@"+"/r");
		}else if (input ==a){
			System.out.println(Arrays.toString(t)+"_"+"@"+"/r");
		}else{
			System.out.println("write d or a");
		
		}
			
		}
		
	}

}
