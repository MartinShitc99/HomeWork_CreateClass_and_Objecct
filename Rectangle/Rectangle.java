package Rectangle;

public class Rectangle
{
    double width;
    double height;

    public Rectangle(double someWidth, double someHeight) {
        this.width = someWidth;
        this.height = someHeight;
    }

    //    Геттеры
    double getWidth() {
        return this.width;
    }
    double getHeight() {
        return this.height;
    }

//    Сеттеры
    void setWidth(double newWidth) {
        this.width = newWidth;
    }
}
