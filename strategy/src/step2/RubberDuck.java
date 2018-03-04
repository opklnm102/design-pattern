package step2;

/**
 * Created by ethan.kim on 2018. 3. 3..
 */
public class RubberDuck extends Duck implements Quackable {

    @Override
    public void display() {
        System.out.println("RubberDuck");
    }

    @Override
    public void quack() {
        System.out.println("quack");
    }
}
