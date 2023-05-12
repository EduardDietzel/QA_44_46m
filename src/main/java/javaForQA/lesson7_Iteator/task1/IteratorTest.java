package javaForQA.lesson7_Iteator.task1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorTest {

    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<>();
        numbers.add(3);
        numbers.add(7);
        numbers.add(4);
        numbers.add(1);
        numbers.add(0);

        System.out.println("Вывод всех чисел в строку:");

        for (Integer number: numbers) {
            System.out.print(number + " ");
        }
        System.out.println();

        System.out.println("Вывод всех чисел в строку с помощью итеатора:");

        Iterator<Integer> iterator = numbers.iterator();

        while (iterator.hasNext()){
            System.out.print(iterator.next() + " ");

        }
    }
}
