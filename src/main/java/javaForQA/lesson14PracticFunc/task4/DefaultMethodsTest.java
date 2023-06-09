package javaForQA.lesson14PracticFunc.task4;

import java.util.function.Function;

public class DefaultMethodsTest {
    public static void main(String[] args) {

        Function<String, String> function1 = x -> x + "1";

        System.out.println(function1.apply("Test"));

        Function<String, String> function2 = x -> x + "2";
        Function<String, String> function3 = x -> x + "3";
        Function<String, String> function4 = x -> x + "4";

        Function<String, String> totalFunc1 = function1.andThen(function2).andThen(function3);

        System.out.println(totalFunc1.apply("Hello"));

        Function<String, String> totalFunc2 = function3.andThen(function4).compose(function2).compose(function1);

        System.out.println(totalFunc2.apply("Java"));

        // Пример: есть чисто в виде строки
        // пишем функцию, которая:
        // 1. Конвертируем эту строку в число ->
        // 2. Число округляем ->
        // 3. Это число возводим в квадрат

        Function<String, Double> func1 = x -> Double.parseDouble(x);
        Function<Double, Long> func2 = x -> Math.round(x);
        Function<Long, Long> func3 = x -> x * x;

        Function<String, Long> total = func1.andThen(func2).andThen(func3);

        System.out.println(total.apply("5.72"));

        Function<String, String> identityFunc = Function.identity();

        System.out.println(identityFunc.apply("Hello"));

    }
}
