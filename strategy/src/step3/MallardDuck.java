package step3;

/**
 * Created by ethan.kim on 2018. 3. 3..
 */
public class MallardDuck extends Duck {

    public MallardDuck() {
        this.setFlyBehavior(new FlyWithWings());
        this.setQuackBehavior(new Quack());
    }

    @Override
    public void display() {
        System.out.println("--- MallardDuck ---");
    }
}
