package theory.decorator;

public class GreenShapeDecorator extends ShapeDecorator{
     public GreenShapeDecorator(Shape decoratedShape) {
        super(decoratedShape);
    }

    @Override
    public void draw() {
        System.out.println("GREEN **************** START");
        decoratedShape.draw();
        System.out.println("GREEN **************** END");
    }
}
