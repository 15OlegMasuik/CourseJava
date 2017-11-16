package olegmasiuk.gmail.com;
//Test

public class Main {
    public static void main(String[] args) {

        Cat cat1 = new Cat("brown", 12, 3, "Pea");
        System.out.println(cat1);
        cat1.voice();
        Cat cat2 = new Cat("br", 2,4 , "Bob");

        System.out.println(cat2);
        cat2.voice();
        Cat cat3 =new Cat();
        cat3.setName("yo");
        System.out.println(cat3);

    }
}

