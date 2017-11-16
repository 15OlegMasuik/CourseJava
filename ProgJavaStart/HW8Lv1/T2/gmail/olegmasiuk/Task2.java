package gmail.olegmasiuk;

import java.util.Calendar;
import java.util.Date;

/**
 * Created by Marta on 08.11.2017.
 */
public class Task2 {
    public static void main(String[] args) {
        Calendar cl = Calendar.getInstance();
        cl.set(Calendar.DAY_OF_MONTH,11);
        cl.set(Calendar.MONTH,Calendar.OCTOBER);
        cl.set(Calendar.YEAR,1981);
        Date date =cl.getTime();
        System.out.println(date);
    }
}
