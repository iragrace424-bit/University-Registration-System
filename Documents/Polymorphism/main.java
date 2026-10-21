package java_polymorphism;

public class Main {

    public static void main(String[] args) {

        Shape circle = new Circle("Red", 5);
        Shape rectangle = new Rectangle("Blue", 10, 4);

        System.out.println("Circle area: " + circle.calculateArea());
        System.out.println("Rectangle area: " + rectangle.calculateArea());
    }
}