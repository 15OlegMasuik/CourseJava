package gmail.olegmasiuk;
import java.util.Scanner;
import java.util.Arrays;
/**
 * Created by Marta on 06.11.2017.
 */
public class PodrahB {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int podrah=0;
        String word;
        System.out.println("Inpute word:");
        word=sc.nextLine();
        char [] b=word.toCharArray();
        for (int i=0;i<b.length;i++){
if (b[i]=='b'){
podrah=podrah+1;
}

        }
        System.out.println("Podrah b:"+podrah);
        sc.close();
    }
}
