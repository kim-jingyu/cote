package theory.lambda;

public class LambdaMain {
    public static void main(String[] args) {
        Car car = new Car() {
            @Override
            public void a() {
                System.out.println("이름없는 객체의 a 메서드 오버라이딩");
            }
        };

        car.a();
    }
}
