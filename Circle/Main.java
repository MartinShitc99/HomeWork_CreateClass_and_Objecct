package Circle;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(14.77);

        circle.setRadius(2.2);
        
        System.out.println("Площадь: " + circle.calculateArea());
        System.out.println("Длина: " + circle.calculateCircumference());
    }
}
