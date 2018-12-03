/**
 * Created by Marta on 25.10.2018.
 */
public abstract class Duck {
    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;

    public Duck() {

    }

    public abstract void display();

    public void performFly() {
        flyBehavior.fly();
    }

    public void performQuack() {
        quackBehavior.quack();
    }

    public void swim() {
        System.out.println("evry body can do it!");
    }

    public void setFlyBehavior(FlyBehavior fb) {
        flyBehavior = fb;

    }

    public void setQuackBehavior(QuackBehavior qb) {
        quackBehavior = qb;
    }

}
