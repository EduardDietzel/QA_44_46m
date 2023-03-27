package javaForQA.lesson4.task4;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Integer[] array = new Integer[10];

        for (int i = 0; i < array.length; i++) {
            //здесь применилась "Автоупаковка"
            array[i] = i;
        }

        System.out.println(Arrays.toString(array));
        System.out.println("Сумма четных чисел - " + sumOfEvens(array));
    }

    public static int sumOfEvens(Integer[] array) {
        int sum = 0;
        for (Integer value : array) {
            // "Автораспаковка"
            // 1. value распакуется в примитив, получим int значение
            // 2. вычисляется остаток от деления на 2 этого int
            // 3. результат сравнивается с нулём
            if (value % 2 == 0) {
                // "Автораспаковка" sum = sum + value;
                // 1. value распаковывается в int
                // 2. суммируются оба int
                // 3. результат заносится в переменную sum
                sum += value;
            }
        } return sum;
    }

}
