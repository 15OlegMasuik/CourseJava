import javax.swing.*;
import java.util.Arrays;


public class Group implements Starosta {
    private Student[] studentsArray = new Student[10];

    public Group(Student[] studentsArray) {
        this.studentsArray = studentsArray;
    }

    public Group() {
        super();
    }

    public Student[] getStudentsArray() {
        return studentsArray;
    }

    public void setStudentsArray(Student[] studentsArray) {
        this.studentsArray = studentsArray;
    }

    public void addStudent1(Student student) throws MyException {
        if (student == null) {
            throw new IllegalArgumentException("Null student");
        }
        for (int i = 0; i < studentsArray.length; i++) {
            if (studentsArray[i] == null) {
                studentsArray[i] = student;
                return;
            }
        }
        throw new MyException();
    }

    public void addStudent() throws MyException {
        Student student = null;
        try {
            String name = getName("Input student name");
            String lastName = getName("Input student lastname");
            int age = getAge();
            boolean sex = getSex("Input sex -> man or women");
            int kurs = getKurs("Input kurs");
            String group = getName("Input group name");
            String university = getName("Input group name");
            boolean present = getPresent("input present");
            boolean leadership = getPresent("input lidership");
            boolean responsibility = getPresent("input responsibility");
            boolean resistance_to_stress = getPresent("input resistance_to_stress");
            boolean communicative = getPresent("input communicative");
            boolean ability_to_convince = getPresent("input ability_to_convince");
            Student st = new Student(name, lastName, age, sex, group, kurs, university, present, leadership, responsibility, resistance_to_stress, communicative, ability_to_convince);
            this.addStudent();
        } catch (NullPointerException e) {
            System.out.println("Canceled");
            return;
        }
    }

    private int getAge() throws NullPointerException {
        boolean done = false;
        int age = 0;
        for (; !done; ) {
            try {
                age = Integer.valueOf(JOptionPane.showInputDialog("Input student age"));
                done = true;
            } catch (NumberFormatException e) {
                JOptionPane.showInternalMessageDialog(null, "Invalid ");
            }
        }
        return age;
    }

    private String getName(String message) throws NullPointerException {
        boolean done = false;
        String name = "";
        for (; !done; ) {
            try {
                name = JOptionPane.showInputDialog(message);
                done = true;
            } catch (NumberFormatException e) {
                JOptionPane.showInternalMessageDialog(null, "Invalid format");
            }
        }
        return name;
    }

    private boolean getSex(String message) throws NullPointerException {
        boolean done = false;
        boolean name = false;
        for (; !done; ) {
            try {
                name = JOptionPane.showInputDialog(message).equals("man");
                done = true;
            } catch (NumberFormatException e) {
                JOptionPane.showInternalMessageDialog(null, "Invalid format");
            }
        }
        return name;
    }

    private boolean getPresent(String message) throws NullPointerException {
        boolean done = false;
        boolean present = false;
        for (; !done; ) {
            try {
                present = JOptionPane.showInputDialog(message).equals("present");
                done = true;
            } catch (NumberFormatException e) {
                JOptionPane.showInternalMessageDialog(null, "Invalid format");
            }
        }
        return present;
    }


    private int getKurs(String message) throws NullPointerException {
        boolean done = false;
        int kurs = 0;
        for (; !done; ) {
            try {
                kurs = Integer.valueOf(JOptionPane.showInputDialog(message));
                done = true;
            } catch (NumberFormatException e) {
                JOptionPane.showInternalMessageDialog(null, "Invalid format");
            }
        }
        return kurs;
    }

    public Student search(String lastName) {
        String miss="miss";
        for (Student student : studentsArray) {
            if (student != null && student.getLastname().equals(lastName) && student.isPresents() == true) {
                return student;
            }
        }

        return null;

    }

    public void deleteStudent(int n) {
        if (!(n >= 0 && n < studentsArray.length)) {
            System.out.println("Error index");
            return;
        }
        studentsArray[n] = null;
    }


    private void sort() {
        for (int i = 0; i < studentsArray.length - 1; i++) {
            for (int j = i + 1; j < studentsArray.length; j++) {
                if (compareStudent(studentsArray[i], studentsArray[j]) > 0) {
                    Student temp = studentsArray[i];
                    studentsArray[i] = studentsArray[j];
                    studentsArray[j] = temp;
                }
            }
        }
    }

    private int compareStudent(Student a, Student b) {
        if (a != null && b == null) {
            return 1;
        }
        if (a == null && b != null) {
            return -1;
        }
        if (a == null && b == null) {
            return 0;
        }
        return a.getLastname().compareTo(b.getLastname());

    }

    public void sortByParametr(int i) {
        Arrays.sort(this.studentsArray, new StudentComparator(i));
    }

    public void sortByParametr(int i, boolean forward) {
        Arrays.sort(this.studentsArray, new StudentComparator(i, forward));
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        int i = 0;
        // sort();
        for (Student student : studentsArray) {
            if (student != null) {
                sb.append((++i) + ") ").append(student);
                sb.append(System.lineSeparator());
            }
        }
        return sb.toString();
    }

    public Student get(int n) {
        return studentsArray[n];
    }

    @Override
    public  Student[]  getStarosta() {
        int n = 0;
        Student[] list2 = new Student[10];
        for (int i = 0; i < studentsArray.length; i++) {
            if (studentsArray[i] != null && (studentsArray[i].isCommunicative()&& studentsArray[i].isResponsibility()&&studentsArray[i].isResistance_to_stress()&&studentsArray[i].isLeadership()&&studentsArray[i].isAbility_to_convince())) {
                n++;
                list2[n] = studentsArray[i];
                System.out.println("Фамилия: " + get(i).getLastname() + " | " + "Имя: " + get(i).getName() + " | ");

            }
        }

            return null;
        }

    }
