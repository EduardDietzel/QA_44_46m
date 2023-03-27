package javaForQA.lesson4.task5;

public class Book implements Cloneable {

    private String name;
    private int year;
    private Author author;

    public Book(String name, int year) {
        this.name = name;
        this.year = year;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        // объект типа "Обжект"
        return super.clone();
    }
}
