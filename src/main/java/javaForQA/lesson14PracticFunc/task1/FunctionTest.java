package javaForQA.lesson14PracticFunc.task1;

import java.util.function.Function;

public class FunctionTest {
    public static void main(String[] args) {

        // Функция, которая принимает Double, округляет и возвращает Long
        // если метод содержит только одну строчку, то return можно не писать
        Function<Double, Long> function = x -> Math.round(x);
        System.out.println(function.apply(4.56));
    }
}
