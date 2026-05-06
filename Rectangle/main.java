package Rectangle;

import static java.lang.System.*;

public class main {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle( 200.0, 200.2);

        rectangle.setWidth(777.7);

        out.println(rectangle.width * rectangle.height);

    }
}
