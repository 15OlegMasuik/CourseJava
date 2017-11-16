package olegmasiuk;

/**
 * Created by Marta on 14.11.2017.
 */
public class Main {
    public static void main(String[] args) {
int a =33;
double b=43.4;
String c="hello";

        System.out.print(concant(a,b,c));

    }
    public static String concant (int a , double b, String c){
        String con=a+b+c;
        return con;
    }
}
