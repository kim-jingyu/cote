package theory.generics;

public class GenericBoxMain {
    public static void main(String[] args) {
        GenericBox<String> box = new GenericBox<>();
        box.setT("kim");
        String str = box.getT();
        System.out.println("str.toUpperCase() = " + str.toUpperCase());
    }
}
