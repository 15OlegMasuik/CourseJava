/**
 * Created by Marta on 09.10.2018.
 */
public class DeliveryMan {
    private String name;
    private int age;

    public DeliveryMan(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public DeliveryMan() {
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

   public  void delivery(Delivery d){
        System.out.println("Goods delivered ro adress:");

   }
}
