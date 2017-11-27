package vom.olegmasiuk94;

/**
 * Created by Marta on 27.11.2017.
 */
public class Students extends  Human{
    private  String university;
    private String facultet;
    private int course;
    private  int group;
    private double averegeScore;

    public Students(String firstname, String secondname, int age, String university, String facultet, int course, int group, double averegeScore) {
        super(firstname, secondname, age);
        this.university = university;
        this.facultet = facultet;
        this.course = course;
        this.group = group;
        this.averegeScore = averegeScore;
    }

    public Students(String university, String facultet, int course, int group, double averegeScore) {
        this.university = university;
        this.facultet = facultet;
        this.course = course;
        this.group = group;
        this.averegeScore = averegeScore;
    }

    public Students() {
    }

    public String getUniversity() {
        return university;
    }

    public void setUniversity(String university) {
        this.university = university;
    }

    public String getFacultet() {
        return facultet;
    }

    public void setFacultet(String facultet) {
        this.facultet = facultet;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public int getGroup() {
        return group;
    }

    public void setGroup(int group) {
        this.group = group;
    }

    public double getAveregeScore() {
        return averegeScore;
    }

    public void setAveregeScore(double averegeScore) {
        this.averegeScore = averegeScore;
    }

    @Override
    public String toString() {
        return "Students{" +"firstname='" + getFirstname() + '\'' +
                ", secondname='" + getSecondname() + '\'' +
                ", age=" + getAge() +
                ", university='" + university + '\'' +
                ", facultet='" + facultet + '\'' +
                ", course=" + course +
                ", group=" + group +
                ", averegeScore=" + averegeScore +
                '}';
    }
}
