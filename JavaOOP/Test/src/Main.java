/**
 * Created by Marta on 09.10.2018.
 */
public class Main {
    public static void main(String[] args) {
        Goods corn=new Goods(20,20,300,"fresh corn","Kiev", 2018);
        Manager m = new Manager("danil",23, "New");
        m.raisePrice(corn, 15);
        System.out.println(corn.getPrice());
        DeliveryMan dm = new DeliveryMan("Igor", 35);
        dm.delivery(corn);
        SanSation ss1 = new SanSation("KIEV OBS");
        ss1.check(corn);
    }
}
