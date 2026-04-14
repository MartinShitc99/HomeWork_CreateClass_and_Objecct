package Laptop;

public class Laptop {
    String brand;
    int price;

    Laptop(String brand, int price) {
        this.brand = brand;
        this.price = price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getPrice() {
        return price;
    }

    public String getBrand() {
        return brand;
    }

    void printInfo() {
        System.out.println("Бренд: " + this.brand + "; Цена: " + this.price);
    }
}
