/**
 * Created by Marta on 25.10.2018.
 */
public class Main {
    public static void main(String[] args) {
        Duck maladar = new MallarDuck();
        maladar.performQuack();
        maladar.performFly();
        Duck model = new ModelDuck();
        model.performFly();
        model.setFlyBehavior(new FlyWithRocket());
        model.performFly();

    }
}
