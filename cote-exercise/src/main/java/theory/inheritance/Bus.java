package theory.inheritance;

public class Bus extends Car{
    @Override
    public void run() {
        System.out.println("후륜구동으로 달리다.");
    }

    public void 안내방송() {
        System.out.println("안내방송하다.");
    }
}
