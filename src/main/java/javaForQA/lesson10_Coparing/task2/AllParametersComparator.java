package javaForQA.lesson10_Coparing.task2;

import java.util.Comparator;

public class AllParametersComparator implements Comparator<Cat> {
    @Override
    public int compare(Cat cat1, Cat cat2) {
        String name1 = cat1.getName();
        String name2 = cat2.getName();

        if (!name1.equals(name2)) {
            return name1.compareTo(name2);
        }

        int age1 = cat1.getAge();
        int age2 = cat2.getAge();

        if (age1 != age2) {
            return age2 - age1;
        }
        return Double.compare(cat1.getWeight(), cat2.getWeight());
    }
}
