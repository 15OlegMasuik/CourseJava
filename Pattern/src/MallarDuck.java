/**
 * Created by Marta on 25.10.2018.
 */
public class MallarDuck  extends  Duck{

    public  MallarDuck(){
        quackBehavior = new Quack();
        flyBehavior =new FlyWithWings();


    }
    public void  display(){
        System.out.println("I'm ready!");
    }
}
