package javaForQA.lesson4.task5;

public class BookTest {
    public static void main(String[] args) throws CloneNotSupportedException {

        Author author = new Author("Gerbert Shield");

        Book book1 = new Book("Java. Full tutorial", 2000);
        book1.setAuthor(author);
        // Book book2 = book1;
        // клонируем объект и создаем другой самостоятельный объект
        // вручную преобразовываем объект к классу "Книга"
        Book book2 = (Book) book1.clone();
        // клон лучше использовать, когда работаем с простыми объектами
        // если мы имеем объекты  объектах, то лучше клонирование не использовать

        System.out.println(book1.getName());
        System.out.println(book1.getAuthor().getName());
        // получаем автора, потом получаем имя автора
        System.out.println(book2.getName());
        System.out.println(book2.getAuthor().getName());

        book2.setName("Algorithms");
        book2.getAuthor().setName("Vasiliy Ivanov");

        System.out.println();
        System.out.println(book1.getName());
        System.out.println(book1.getAuthor().getName());
        System.out.println(book2.getName());
        System.out.println(book2.getAuthor().getName());

    }
}
