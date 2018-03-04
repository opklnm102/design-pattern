package step3;

/**
 * Created by ethan.kim on 2018. 3. 3..
 */
public class RubberDuck extends Duck {

    public RubberDuck() {
        this.setFlyBehavior(new FlyNoWay());
        this.setQuackBehavior(new MuteQuack());
    }

    @Override
    public void display() {
        System.out.println("--- RubberDuck ---");
    }
}
