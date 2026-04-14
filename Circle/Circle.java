package Circle;

public class Circle {
    double radius;

    public Circle(double radius) {
        this.radius = radius;

    }

    public double caluclateArea() {
         return Math.PI * radius * radius;
    };
    public double caluclateCircumference() {
        return 2 * Math.PI * radius;
    };

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

}
