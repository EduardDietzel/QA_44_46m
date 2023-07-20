package javaForQA.lesson11_Stack.task3;

public class StackTest {

    public static void main(String[] args) {
        first();
    }

    public static void first() {
        second();
    }

    public static void second() {
        third();
    }

    public static void third() {
        fourth();
        throw new RuntimeException();
    }

    public static void fourth() {
        // throw new RuntimeException();
        System.out.println("Отработал метод 4");
    }

    // Java использует Steck для записи методов, выдавая потом цепочку, начиная с последнего
    // все методы добавляются в стек до тех пор, пока метод не сработает.
    // когда метод отрабатывает, он сразу же удаляется из Стэка
}
