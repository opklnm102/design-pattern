package step2;

/*
issue 2 - 인터페이스
 */
public class Main {

    public static void main(String[] args) {
        Duck mallardDuck = new MallardDuck();
        Duck rubberDuck = new RubberDuck();

        mallardDuck.display();
        ((MallardDuck) mallardDuck).fly();
        ((MallardDuck) mallardDuck).quack();

        rubberDuck.display();
        ((RubberDuck) rubberDuck).quack();
    }
}
