package step4_lambda;

import java.util.Arrays;
import java.util.List;

/*
Strategy Pattern using lambda expression
 */
public class Main {

    public static void main(String[] args) {

        // before
        List<Strategy> strategiesWithoutLambda = Arrays.asList(
                new LazyStrategy(),
                new ActiveStrategy()
        );

        for (Strategy strategy : strategiesWithoutLambda) {
            strategy.performTask();
        }

        // after - lambda expression
        // interface 구현체를 안만들어도 된다
        List<Strategy> strategies = Arrays.asList(
                () -> System.out.println("LazyStrategy"),
                () -> System.out.println("ActiveStrategy")
        );

        for (Strategy strategy : strategies) {
            strategy.performTask();
        }
    }
}
