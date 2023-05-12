package javaForQA.lesson10_Coparing.task2;

import java.util.Comparator;

public class CatComparatorByName implements Comparator<Cat> {
    @Override
    public int compare(Cat cat1, Cat cat2) {
        // если имена котов надо ставить по алфавиту, то возвращаем -1
        // если наоборот, то 1
        return cat1.getName().compareTo(cat2.getName());
    }
}
