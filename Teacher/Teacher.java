package Teacher;

public class Teacher {
    String name;
    String subject;

    Teacher(String name, String subject) {
        this.name = name;
        this.subject = subject;
    }

    public String getName() {
        return name;
    }
    public String getSubject() {
        return subject;
    }


    public void setName(String name) {
        this.name = name;
    }
    public void setSubject(String subject) {
        this.subject = subject;
    }

    void print() {
        System.out.println("Имя: " + name + "; Предмет: " + subject);
    }
}
