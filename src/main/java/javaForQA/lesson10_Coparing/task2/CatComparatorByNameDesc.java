package javaForQA.lesson10_Coparing.task2;

import java.util.Comparator;

public class CatComparatorByNameDesc implements Comparator<Cat> {
    @Override
    public int compare(Cat cat1, Cat cat2) {
        return cat2.getName().compareTo(cat1.getName());
    }
}
