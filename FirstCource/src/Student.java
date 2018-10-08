
public class Student extends Human {
    private  String university;
    private  int kurs;
    private  String group;
    private boolean presents; // true- present, false- missing
    private  boolean leadership;
    private  boolean responsibility;
    private  boolean resistance_to_stress;
    private  boolean communicative;
    private  boolean ability_to_convince;

    public Student(String name, String lastname, int age, boolean sex, String university, int kurs, String group, boolean presents, boolean leadership, boolean responsibility, boolean resistance_to_stress, boolean communicative, boolean ability_to_convince) {
        super(name, lastname, age, sex);
        this.university = university;
        this.kurs = kurs;
        this.group = group;
        this.presents = presents;
        this.leadership = leadership;
        this.responsibility = responsibility;
        this.resistance_to_stress = resistance_to_stress;
        this.communicative = communicative;
        this.ability_to_convince = ability_to_convince;
    }

    public Student(String university, int kurs, String group, boolean presents, boolean leadership, boolean responsibility, boolean resistance_to_stress, boolean communicative, boolean ability_to_convince) {
        this.university = university;
        this.kurs = kurs;
        this.group = group;
        this.presents = presents;
        this.leadership = leadership;
        this.responsibility = responsibility;
        this.resistance_to_stress = resistance_to_stress;
        this.communicative = communicative;
        this.ability_to_convince = ability_to_convince;
    }

    public String getUniversity() {
        return university;
    }

    public void setUniversity(String university) {
        this.university = university;
    }

    public int getKurs() {
        return kurs;
    }

    public void setKurs(int kurs) {
        this.kurs = kurs;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public boolean isPresents() {
        return presents;
    }

    public void setPresents(boolean presents) {
        this.presents = presents;
    }

    public boolean isLeadership() {
        return leadership;
    }

    public void setLeadership(boolean leadership) {
        this.leadership = leadership;
    }

    public boolean isResponsibility() {
        return responsibility;
    }

    public void setResponsibility(boolean responsibility) {
        this.responsibility = responsibility;
    }

    public boolean isResistance_to_stress() {
        return resistance_to_stress;
    }

    public void setResistance_to_stress(boolean resistance_to_stress) {
        this.resistance_to_stress = resistance_to_stress;
    }

    public boolean isCommunicative() {
        return communicative;
    }

    public void setCommunicative(boolean communicative) {
        this.communicative = communicative;
    }

    public boolean isAbility_to_convince() {
        return ability_to_convince;
    }

    public void setAbility_to_convince(boolean ability_to_convince) {
        this.ability_to_convince = ability_to_convince;
    }

    @Override
    public String toString() {
        return "Student{" +
                "university='" + university + '\'' +
                ", kurs=" + kurs +
                ", group='" + group + '\'' +
                ", presents=" + presents +
                ", leadership=" + leadership +
                ", responsibility=" + responsibility +
                ", resistance_to_stress=" + resistance_to_stress +
                ", communicative=" + communicative +
                ", ability_to_convince=" + ability_to_convince + super.toString()+
                '}';
    }
}
