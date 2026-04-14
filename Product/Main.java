package Product;

public class Main {
    public static void main(String[] args) {
        Product product = new Product("iPhone", 1250);

        product.appleDiscount(17.5);

        product.printInfo();
    }
}
