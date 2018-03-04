package step1;

/**
 * Created by ethan.kim on 2018. 3. 3..
 */
/*
다양한 오리를 만든다고 할 때
Duck을 상속하여 display()를 오버라이딩 한다

오리말고 다른건 없을까...?

상품이 있고
해당 상품은 할인률을 가진다
할인률은 이벤트에 따라 다르다

이벤트 마다 구매 할인률이 다르다
이벤트 1 - 할인률 1%
이벤트 2 - 할인률 2%
이벤트 3 - 할인률 3%

상품 1 - 할인률 1%
상품 2 - 할인률 2%

이벤트 1 - 할인률 1%
    상품 1 - 할인률 1% -> 1% + 1%
    상품 2 - 할인률 2% -> 2% + 1%
이벤트 2 - 할인률 2%
    상품 1 - 할인률 2% -> 2% + 2%
    상품 2 - 할인률 4% -> 4% + 2%

이벤트마다 할인 정책이 다르다?
+, *
너무 갔나...

Product에 원래 금액이 있고,
Product 할인 정책을 가지고 있고
어떤 일을 수행하면서 금액을 계산해서 적용한다

Event ----- DiscountPolicy
            정률, 정액
            숫자
            +, * 인지
*/
public class Duck {

    public void quack() {
        System.out.println("quack");
    }

    public void swim() {
        System.out.println("swim");
    }

    public void display() {
        System.out.println("Duck");
    }

    /*
      issue 1
      날아다녀야 하는 기능 추가
      날 수 없는 RubberDuck을 추가 -> 부작용 발생

      resolve
      fly(), quack() 오버라딩하여 기능 변경
      RubberDuck과 같은 클래스 추가시 상속 메소드의 오버라이딩해야 하는 문제 존재..
     */
    public void fly() {
        System.out.println("fly");
    }
}
