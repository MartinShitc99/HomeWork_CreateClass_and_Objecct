package Circle;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(14.77);

        circle.radius = (14.99);
        System.out.println("Площадь: " + circle.caluclateArea());
        System.out.println("Длина: " + circle.caluclateCircumference());
    }
}
