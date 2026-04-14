package Car;

public class Main {
    public static void main (String[] args) {
        Car audi = new Car(2016, "AUDI");

        audi.print();

        Car bmw = new Car(2011, "BMW");

        bmw.print();

        bmw.year = 2021;
        bmw.print();
    }


}
