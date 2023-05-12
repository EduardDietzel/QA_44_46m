package javaForQA.lesson10_Coparing.task2;

import java.util.Comparator;

public class CatComparatorByNameAndAge implements Comparator<Cat> {
    @Override
    public int compare(Cat cat1, Cat cat2) {
        // 1. сравниваем имена котов
        // 2. если они не равны сортируем по имени
        // 3. если они равны, сравниваем возрасты и сортируем по ним

        String name1 = cat1.getName();
        String name2 = cat2.getName();

        if (!name1.equals(name2)) {
            return name1.compareTo(name2);
        }

        return cat2.getAge() - cat1.getAge();
    }
}
