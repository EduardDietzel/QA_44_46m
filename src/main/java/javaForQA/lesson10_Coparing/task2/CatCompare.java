package javaForQA.lesson10_Coparing.task2;

import java.util.Set;
import java.util.TreeSet;

public class CatCompare {
    public static void main(String[] args) {

        Set<Cat> cats = new TreeSet<>(new AllParametersComparator());

        cats.add(new Cat("A-кот", 3, 2.52));
        cats.add(new Cat("B-кот", 2, 2.15));
        cats.add(new Cat("C-кот", 5, 3.45));
        cats.add(new Cat("D-кот", 4, 2.87));
        cats.add(new Cat("D-кот", 2, 3.17));
        cats.add(new Cat("D-кот", 3, 3.33));
        cats.add(new Cat("D-кот", 3, 2.33));
        cats.add(new Cat("D-кот", 3, 2.53));
        cats.add(new Cat("D-кот", 3, 1.98));
        cats.add(new Cat("E-кот", 1, 3.18));

        for (Cat cat : cats){
            System.out.println(cat);
        }
    }
}
