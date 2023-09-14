package theory.abstraction;

public class SportsCar extends Car2{
    public SportsCar() {
        super("SportsCar!!");
    }

    @Override
    public void run() {
        System.out.println("사륜구동으로 동작한다.");
    }
}
