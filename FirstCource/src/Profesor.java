
public class Profesor  extends Human{
    private  String lesons;

    public Profesor(String name, String lastname, int age, boolean sex, String lesons) {
        super(name, lastname, age, sex);
        this.lesons = lesons;
    }

    public Profesor(String lesons) {
        this.lesons = lesons;
    }

    public String getLesons() {
        return lesons;
    }

    public void setLesons(String lesons) {
        this.lesons = lesons;
    }

    @Override
    public String toString() {
        return "Profesor{" +
                "lesons='" + lesons + '\'' +super.toString()+
                '}';
    }
}


