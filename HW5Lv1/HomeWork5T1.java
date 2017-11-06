package gmail.olegmasiuk;

/**
 * Created by Marta on 05.11.2017.
 */
public class HomeWork5T1 {
    public static void main(String[] args) {

        int[] m= {0,5,2,4,7,1,3,19};
        int k=0;
        for (int i:m){

            if  (i%2!=0){
                k=k+1;
            }

        }
        System.out.print(k);
    }
}
