package Point;

public class Point {
    int x;
    int y;

    Point(int someX, int someY) {
        this.x = someX;
        this.y = someY;
    }

//    Сеттеры
    public void setX(int x) {
        this.x = x;
    }
    //    Геттеры
    public int getX() {
        return x;
    }

    void print() {
        System.out.println("X: " + x + " Y: " + y);
    }
}
