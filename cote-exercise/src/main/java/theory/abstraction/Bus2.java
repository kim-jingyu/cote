package theory.abstraction;

public class Bus2 extends Car2{
    public Bus2() {
        super("I am Bus");
        System.out.println("Bus2 기본 생성자 호출");
    }

    @Override
    public void run() {
        System.out.println("후륜구동으로 동작한다.");
    }
}
