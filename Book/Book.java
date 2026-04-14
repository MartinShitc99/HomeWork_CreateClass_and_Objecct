package Book;

public class Book
{
    String title;
    String author;

    Book(String someTitle, String someAuthor) {
        this.title = someTitle;
        this.author = someAuthor;
    }

//    Геттеры
    String getTitle() {
        return this.title;
    }
    String getAuthor() {
        return this.author;
    }

//    Сеттеры
    void setTitle(String newTitle) {
        this.title = newTitle;
    }
    void setAuthor(String newAuthor) {
        this.author = newAuthor;
    }


    public void printInfo() {
        System.out.println("Автор книги: " + this.author + ", Название книги: " + this.title);

    }
}
