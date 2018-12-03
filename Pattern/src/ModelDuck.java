public class ModelDuck extends Duck {
    public ModelDuck() {
        flyBehavior = new NoFly();
        quackBehavior = new Sqeak();
    }

    public void display() {
        System.out.println("I'm model duck");
    }

}


