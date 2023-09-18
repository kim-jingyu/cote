package theory.decorator;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

public class DecoratorPatternDemo {
    public static void main(String[] args) throws FileNotFoundException {
        Shape shape = new GreenShapeDecorator(new RedShapeDecorator(new Circle()));
        shape.draw();

        InputStream in = new DataInputStream(new FileInputStream("a.txt"));

    }
}
