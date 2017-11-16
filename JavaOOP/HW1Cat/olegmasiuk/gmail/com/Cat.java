package olegmasiuk.gmail.com;

/**
 * Created by Marta on 15.11.2017.
 */
public class Cat {
    private String color;
    private double high;
    private double weight;
    private String name;


    public Cat(String color, double high, double weight, String name) {
        this.color = color;
        this.high = high;
        this.weight = weight;
        this.name = name;
    }

    public Cat() {
        color = "hz";
        high = 1;
        weight = 1;
        name = "noname";
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getHigh() {
        return high;
    }

    public void setHigh(double high) {
        this.high = high;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void voice() {
        System.out.println(name + " Myav Myav");
    }

    @Override
    public String toString() {
        return "Cat{" +
                "color='" + color + '\'' +
                ", high=" + high +
                ", weight=" + weight +
                ", name='" + name + '\'' +
                '}';
    }
}
