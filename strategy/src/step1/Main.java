package step1;

/*
issue 1 - 상속
 */
public class Main {

    public static void main(String[] args) {
        Duck mallardDuck = new MallardDuck();
        Duck rubberDuck = new RubberDuck();

        mallardDuck.display();
        mallardDuck.fly();
        mallardDuck.quack();

        rubberDuck.display();
        rubberDuck.fly();
        rubberDuck.quack();
    }
}
