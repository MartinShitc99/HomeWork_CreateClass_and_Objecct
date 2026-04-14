package Product;

public class Product {

        String name;
        double price;

        public double appleDiscount(double discount) {
            discount = price * (discount / 100);

            price = (double) (price - discount);
            return discount;
        }


    public Product(String name, int price) {
            this.name = name;
            this.price = price;
        }

        public String getName() {
            return name;
        }
        public double getPrice() {
            return price;
        }

        void printInfo() {
            System.out.println("стоимость со скидкой: " + this.price + " Наименование: " + this.name);
        }
    }
