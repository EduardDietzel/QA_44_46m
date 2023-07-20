package javaForQA.lesson13_Func.Task1;

@FunctionalInterface
public interface Filter {

    // аннотация FunctionalInterface нужна, чтобы никто больше не внес другой абстрактный метод
    // заводим абстрактный метод в интерфейсе
    boolean test(Student student);
    // boolean - так как мы сравниваем студента с условиями, где возвращается либо тру, либо фолс
}
