/**
 * Created by Marta on 09.10.2018.
 */
public class Manager {
    private  String  name;
    private  int age;
    private  String Skill;

    public Manager(String name, int age, String skill) {
        this.name = name;
        this.age = age;
        Skill = skill;
    }

    public Manager() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSkill() {
        return Skill;
    }

    public void setSkill(String skill) {
        Skill = skill;
    }
    public  void raisePrice(Selling s, double a){
        s.setPrice(s.getPrice()+a);

    }
}
