package gmail.olegmasiuk;

import java.util.Arrays;
/**
 * Created by Marta on 06.11.2017.
 */
public class TaskRandomNumder {
    public static void main(String[] args) {
        int [] arrayrandom = new int[15];
        for (int  i= 0; i<arrayrandom.length;i++){
            arrayrandom[i] =(int) (Math.random()*10);
                   }
        System.out.println(Arrays.toString(arrayrandom));
        int [] doublearray= Arrays.copyOf(arrayrandom, 30);
        for (int j=0;j<arrayrandom.length;j++){
            doublearray[j+15]=arrayrandom[j]*2;


        }
        System.out.println(Arrays.toString(doublearray));
    }

}
