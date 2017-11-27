package vom.olegmasiuk94;

/**
 * Created by Marta on 27.11.2017.
 */
public class Main {
    public static void main(String[] args) {


        Students oleg = new Students("oleg", "masiuk", 23, "KPI", "FPM", 6, 4, 4.1);
        Students ola = new Students("ola", "ma", 21, "NTU", "Mt", 4, 4, 3.1);
        Students yna = new Students("yna", "ff", 20, "NKU", "Mh", 1, 5, 3.9);
        Students ynal = new Students("ynal", "fl", 30, "NjU", "Mu", 2, 5, 3.9);

        Group group1 = new Group();

        try {
            group1.addStudents(oleg);
            group1.addStudents(ola);
            group1.addStudents(yna);
            group1.addStudents(ynal);

        } catch (GroupeExseption e) {
            e.printStackTrace();
        }
        System.out.println(group1);
        System.out.println();

        group1.deleteStudents(oleg);
        System.out.println(group1);
        System.out.println();

        System.out.println("search: fl:" + group1.serchStudents("fl"));
    }
}
