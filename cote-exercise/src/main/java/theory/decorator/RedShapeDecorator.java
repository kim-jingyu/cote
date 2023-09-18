package theory.decorator;

public class RedShapeDecorator extends ShapeDecorator{
     public RedShapeDecorator(Shape decoratedShape) {
        super(decoratedShape);
    }

    @Override
    public void draw() {
        System.out.println("RED ================ START");
        decoratedShape.draw();
        System.out.println("RED ================ END");
    }
}
