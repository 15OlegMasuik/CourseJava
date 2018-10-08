import java.util.Arrays;

/**
 * Created by Marta on 08.10.2018.
 */
    public class Main {
    public static void main(String[] args) {
        Student st1 =new Student("Bob1","AA", 12, true, "fd",1, "kpi",true,true,true,true,true,true);
        Student st2 =new Student("Bob2","AA", 12, true, "fd",1, "kpi",false,true,true,true,true,true);
Profesor pr1= new Profesor("Bil","kos",33,true,"eng");
        Group gr =  new Group();
        try{
           // gr.addStudent(new Student("Bob3","AA", 12, true, "fd",1, "kpi",false,true,false,true,false,true));
            gr.addStudent1 (new Student("oleg", "dd", 12, true, "fd",1, "kpi",false,true,true,false,true,true));
            gr.addStudent1 (new Student("fog", "cc", 12, false, "fd",1, "kpi",true,false,false,true,true,true));
            gr.addStudent1 (new Student("bzi", "dfsfd", 22, true, "fd",1, "kpi",false,true,true,false,true,true));

            gr.addStudent1 (new Student("Alex", "AA", 18, true, "fd",1, "kpi",true,true,true,true,true,true));
        }catch (MyException e){
            System.out.println("error");
        }
        System.out.println(gr);
        gr.sortByParametr(0);
        System.out.println(gr);
        gr.sortByParametr(1);
        System.out.println(gr);
        //перевырка присутніх
        System.out.println("Present");
        System.out.println(gr.search("AA"));
        System.out.println(gr.search("bb"));
        System.out.println(gr.search("cc"));
        System.out.println(gr.search("dfsfd"));
//вибір старости
        System.out.println("Starosta");
        System.out.println(Arrays.toString(gr.getStarosta()));



    }
}
