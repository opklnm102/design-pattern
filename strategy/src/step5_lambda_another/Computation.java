package step5_lambda_another;

/**
 * Created by ethan.kim on 2018. 3. 3..
 */
@FunctionalInterface
public interface Computation<T> {

    T compute(T n, T m);
}
