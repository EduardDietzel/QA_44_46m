package javaForQA.lesson7iteator.task1;

import com.sun.jdi.connect.spi.TransportService;

import java.util.*;

public class ListTest {
    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<>();

        for (int i = 0; i < 21; i++) {
            numbers.add(i);
        }

        for (Integer num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println();

        Iterator<Integer> iterator = numbers.iterator();

//        for (Integer num: numbers) {
//            if (num % 2 == 0) {
//                numbers.remove(num);
//            }
//        }
        // с помощью цикла никогда не нужно и перебирать, и изменять коллекцию одновременно
        while (iterator.hasNext()) {
            Integer num = iterator.next();
            if (num % 2 == 0) {
                iterator.remove();
            }
        }
        for (Integer num: numbers) {
            System.out.print(num + " ");
        }
        System.out.println();

        Vector<Integer> nums1 = new Vector<>();

        for (int i = 0; i < 21; i++) {
            nums1.add(i);
        }

        Enumeration<Integer> enumeration = nums1.elements();

        while (enumeration.hasMoreElements()) {
            System.out.print(enumeration.nextElement() + " ");
        }
    }
}
