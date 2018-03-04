package step4_lambda;

/**
 * Created by ethan.kim on 2018. 3. 3..
 */
public class LazyStrategy implements Strategy {

    @Override
    public void performTask() {
        System.out.println("LazyStrategy");
    }
}
