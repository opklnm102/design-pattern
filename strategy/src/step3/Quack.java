package step3;

/**
 * Created by ethan.kim on 2018. 3. 3..
 */
public class Quack implements QuackBehavior {

    @Override
    public void quack() {
        System.out.println("Quack");
    }
}
