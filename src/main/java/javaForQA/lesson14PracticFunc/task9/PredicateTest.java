package javaForQA.lesson14PracticFunc.task9;

import java.util.function.Predicate;

public class PredicateTest {
    public static void main(String[] args) {

        /* Используя интерфейс Predicate, написать функцию, которая принимает число
        и возвращает true, если это число является простым.
        Написать метод, который в качестве входящего параметра принимает Predicate
        и выводит результат его работы в консоль в одну строку для всех чисел
        от 0 до 50.
        Простое число - это такое число n, которое делится нацело только на
        самого себя и на 1.
        Список простых чисел - 2, 3, 5, 7...
         */

        Predicate<Integer> simpleNumber = x -> {
            if (x == 2){
                return true;
            }
            if (x < 2){
                return false;
            }
            for (int i = 3; i < x; i++) {
                if (x % i == 0){
                    return false;
                }
            }
            return true;
        };

        processNumbers(simpleNumber);
    }

    public static void processNumbers(Predicate<Integer> predicate){
        for (int i = 0; i < 50; i++) {
            if (predicate.test(i)){
                System.out.print(i + " ");
            }
        }
    }
}
