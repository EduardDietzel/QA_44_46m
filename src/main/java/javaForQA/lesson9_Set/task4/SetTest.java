package javaForQA.lesson9_Set.task4;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetTest {
    public static void main(String[] args) {

        Circle circle = new Circle(5, "Green");

        System.out.println(circle.getRadius());
        System.out.println(circle.getLength());

        circle.setLength(20);
        System.out.println(circle.getRadius());

        Set<Circle> circles = new HashSet<>();

        Circle circle1 = new Circle(10, "Green");
        Circle circle2 = new Circle(7, "Black");
        Circle circle3 = new Circle(12, "Red");
        Circle circle4 = new Circle(15, "Blue");
        Circle circle5 = new Circle(10, "Orange");
        Circle circle6 = new Circle(7, "Black");

        circles.add(circle);
        circles.add(circle1);
        circles.add(circle2);
        circles.add(circle3);
        circles.add(circle4);
        circles.add(circle5);
        circles.add(circle6);

        System.out.println(circle2.hashCode());
        System.out.println(circle6.hashCode());

        System.out.println(circle2.equals(circle6));

        for (Circle c : circles) {
            System.out.println("radius: " + c.getRadius() + ", color: " + c.getColor());
        }

        List<Integer> integerList = new ArrayList<Integer>();
        integerList.add(1);
        integerList.add(3);
        integerList.add(3);
        integerList.add(7);
        integerList.add(7);

        System.out.println("List: " + integerList);
        // выведет список всех добавленных элементов
        Set<Integer> integerSet = new HashSet<>(integerList);

        System.out.println("Set: " + integerSet);
        // выведет сет только неповторяющихся элементов

        Set<String> stringSet = new HashSet<>(20);
        // размер хранилища - 20

        Set<String> stringSet1 = new HashSet<>(20, 0.9f);
        // loadFactor - показатель, когда именно будет увеличено хранилище (20*0.9 = 18)
        // варьируя эти показатели можно снижать нагрузку на память и добиться лучших результатов при работе с огромным объемом данных

        long start = System.currentTimeMillis();

        Set<Integer> testSet = new HashSet<>();
        for (int i = 0; i < 10_000_000; i++) {
            testSet.add(i);
        }

        long end = System.currentTimeMillis();

        System.out.println("Milliseconds: " + (end - start));

    }
}
