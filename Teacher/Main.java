package Teacher;

public class Main {
    public static void main(String[] args) {
        Teacher teacher = new Teacher("Наталья", "Русский язык");

        teacher.subject = "Немецкий язык";

        teacher.print();
    }
}
