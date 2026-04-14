package StudentGroup;

public class StudentGroup {
    String groupName;
    int studentCount;

    StudentGroup(String groupName, int studentCount) {
        this.groupName = groupName;
        this.studentCount = studentCount;
    }

//    Сеттер
    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }
    public void setStudentCount(int studentCount) {
        this.studentCount = studentCount;
    }

//    Геттеры
    public int getStudentCount() {
        return studentCount;
    }

    public String getGroupName() {
        return groupName;
    }

    void printInfo()
    {
        System.out.println("Название группы: " + this.groupName + ", Количество студентов: " + this.studentCount);
    }
}
