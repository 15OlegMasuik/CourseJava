package olegmasiuk;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/**
 * Created by Marta on 13.11.2017.
 */
public class Main {
    public static void main(String[] args) {
        File file = new File("C://Users//Marta//IdeaProjects//ClassWork8T4//src//olegmasiuk//Main.java");
        String text = getStringFromFile(file);
        System.out.println(text);
    }

    public static String getStringFromFile(File file) {
        StringBuilder sb = new StringBuilder();
        try (Scanner sc = new Scanner(file)) {
            for (; sc.hasNextLine(); ) {
                sb.append(sc.nextLine());
                sb.append(System.lineSeparator());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return sb.toString();
    }
}
