package Car;

public class Car
{
    String brand;
    int year;

    Car(int someYear, String someBrand) {
        this.year = someYear;
        this.brand = someBrand;
    }
//    Геттеры
    int getYear() {
        return this.year;
    }
    String getBrand() {
        return this.brand;
    }
//    Сеттеры
    void setYear(int newYear) {
        this.year = newYear;
    }
    void setBrand(String newBrand) {
        this.brand = newBrand;
    }

    void print() {
        System.out.println("Год выпуска: " + this.year + ", Марка " + this.brand);
    }

}
