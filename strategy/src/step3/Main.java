package step3;

/*
strategy pattern
 */
public class Main {

    public static void main(String[] args) {
        Duck mallardDuck = new MallardDuck();
        Duck rubberDuck = new RubberDuck();

        mallardDuck.display();
        mallardDuck.performFly();
        mallardDuck.performQuack();

        rubberDuck.display();
        rubberDuck.performFly();
        rubberDuck.performQuack();
    }
}
