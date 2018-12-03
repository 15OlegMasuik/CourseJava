package gmail.olegmasiuk94;

public class Main {

	boolean palindrom(String s) {
		  int n = s.length();
		  for (int i = 0; i < (n/2); ++i) {
		     if (s.charAt(i) != s.charAt(n - i - 1)) {
		         return false;
		     }
		  }

		  return true;
		}

	

	public static void main(String args[]) {
		Main C = new Main();
		System.out.println(C.palindrom("noon"));
	}

}
