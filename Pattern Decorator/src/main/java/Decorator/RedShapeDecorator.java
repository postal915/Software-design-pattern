package Decorator;

public class RedShapeDecorator extends ShapeDecorator {

    public RedShapeDecorator(Shape shapeDecorator) {
        super(shapeDecorator);
    }

    public void draw() {
        shapeDecorator.draw();
        setRedBorder(shapeDecorator);
    }

    public void setRedBorder(Shape shapeDecorator) {
        System.out.println("Border Color: Red");
    }
}
