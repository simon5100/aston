package module1.task2;

import java.util.ArrayList;
import java.util.List;

public class Student {

    public Student(String fullName, int age, List<Book> books) {
        this.fullName = fullName;
        this.age = age;
        this.books = books;
    }

    private String fullName;

    private int age;

    private List<Book> books;

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }

    @Override
    public String toString() {
        return "Имя: " + fullName +
                "\n Возраст: " + age +
                "\n Количество книг: " + books.size() +
                "\n______________________";
    }

    public void addBook(Book book) {
        if (books == null) {
            books = new ArrayList<>();
        }

        books.add(book);
    }
}
