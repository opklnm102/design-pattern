package step5_lambda_another;

/**
 * Created by ethan.kim on 2018. 3. 3..
 */
public class IntProduct implements Computation<Integer> {

    @Override
    public Integer compute(Integer n, Integer m) {
        return n * m;
    }
}
