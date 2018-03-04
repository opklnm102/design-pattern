package step5_lambda_another;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

/*
Strategy Pattern using lambda expression
 */
public class Main {

    public static void main(String[] args) {

        // before
        List<Computation> computations = Arrays.asList(
                new IntSum(),
                new IntProduct(),
                new IntDifference()
        );

        for (Computation computation : computations) {
            System.out.println(computation.compute(10, 4));
        }

        // after
        List<Computation<Integer>> computationsWithLambda = Arrays.asList(
                (n, m) -> n + m,
                (n, m) -> n * m,
                (n, m) -> n - m
        );

        computationsWithLambda.forEach(computation -> System.out.println(computation.compute(10, 4)));
    }
}
