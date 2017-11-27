package vom.olegmasiuk94;

/**
 * Created by Marta on 27.11.2017.
 */
public class Human {
    private String firstname;
    private String secondname;
    private int age;

    public Human(String firstname, String secondname, int age) {
        this.firstname = firstname;
        this.secondname = secondname;
        this.age = age;
    }

    public Human() {
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getSecondname() {
        return secondname;
    }

    public void setSecondname(String secondname) {
        this.secondname = secondname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Human{" +
                "firstname='" + firstname + '\'' +
                ", secondname='" + secondname + '\'' +
                ", age=" + age +
                '}';
    }
}
