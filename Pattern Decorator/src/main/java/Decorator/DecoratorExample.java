package Decorator;

public class DecoratorExample {
    public static void main(String[] args) {

        Shape circle = new Circle();

        Shape redCirle = new RedShapeDecorator(new Circle());

        Shape redRectangle = new RedShapeDecorator(new Rectangle());

        System.out.println("Circle with normal border");
        circle.draw();

        System.out.println("\nCircle of red border");
        redCirle.draw();

        System.out.println("\nRectangle of red border");
        redRectangle.draw();
    }
}
