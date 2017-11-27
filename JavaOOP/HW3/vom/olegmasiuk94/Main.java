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
        Students jol = new Students("jol", "ff", 22, "NKU", "Mh", 1, 5, 3.9);
        Students bol = new Students("bol", "fy", 30, "NjU", "Mu", 2, 5, 3.9);
        Students lol = new Students("lol", "fd", 22, "NKU", "Mh", 1, 5, 3.9);
        Students hih = new Students("hih", "di", 30, "NjU", "Mu", 2, 5, 3.9);
        Students kil = new Students("kil", "fu", 22, "NKU", "Mh", 1, 5, 3.9);
        Students bil = new Students("bil", "fo", 30, "NjU", "Mu", 2, 5, 3.9);
        Students dod = new Students("dod", "kol", 30, "NjU", "Mu", 2, 5, 3.9);

        Group group1 = new Group();

        try {
            group1.addStudents(oleg);
            group1.addStudents(ola);
            group1.addStudents(yna);
            group1.addStudents(ynal);
            group1.addStudents(jol);
            group1.addStudents(bol);
            group1.addStudents(lol);
            group1.addStudents(hih);
            group1.addStudents(kil);
            group1.addStudents(bil);
            group1.addStudents(dod);
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
