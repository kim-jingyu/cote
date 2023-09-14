package theory.abstraction;

public class Car2Main {
    public static void main(String[] args) {
//        Bus2 b = new Bus2();
//        b.run();
//
//        SportsCar s = new SportsCar();
//        s.run();

//        Car2 c = new Bus2();
//        c.run();

        Car2[] arr = new Car2[2];
        arr[0] = new Bus2();
        arr[1] = new SportsCar();
        for (Car2 car2 : arr) {
            car2.run();
        }
    }
}
