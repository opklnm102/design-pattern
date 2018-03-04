package step3;

/**
 * Created by ethan.kim on 2018. 3. 3..
 */
/*
달라지는 부분을 찾아내고, 달라지지 않는 부분으로부터 분리

달라지는 부분
fly(), quack()에 관련된 인터페이스 생성 및 구현 클래스 생성

상속보다는 구성 활용
구현 클래스가 아닌 인터페이스 활용
 */
public abstract class Duck {

    private FlyBehavior flyBehavior;

    private QuackBehavior quackBehavior;

    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }

    public void performQuack() {
        quackBehavior.quack();
    }

    public void performFly() {
        flyBehavior.fly();
    }

    public void swim() {
        System.out.println("swim");
    }

    public abstract void display();
}
