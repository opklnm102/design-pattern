package step2;

/**
 * Created by ethan.kim on 2018. 3. 3..
 */
public class RedHeadDuck extends Duck implements Flyable, Quackable {

    @Override
    public void display() {
        System.out.println("RedHeadDuck");
    }

    @Override
    public void fly() {
        System.out.println("fly");
    }

    @Override
    public void quack() {
        System.out.println("quack");
    }
}
