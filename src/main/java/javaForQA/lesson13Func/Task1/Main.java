package javaForQA.lesson13Func.Task1;

import org.apache.commons.collections.FastArrayList;

import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        List<String> names = Arrays.asList("Дмитрий", "Александра", "Екатерина");

        List<Student> students = new ArrayList<>();
        // интерфейсная ссылка List должна создавать объект класса, а не интерфейса - класса ArrayList в данном случае

        students.add(new Student("Александра", 19, Gender.FEMALE, 123, 4.87));
        students.add(new Student("Евгений", 18, Gender.MALE, 125, 3.35));
        students.add(new Student("Михаил", 23, Gender.MALE, 121, 4.90));
        students.add(new Student("Татьяна", 20, Gender.FEMALE, 131, 4.81));
        students.add(new Student("Светлана", 18, Gender.FEMALE, 140, 4.21));
        students.add(new Student("Владимир", 22, Gender.MALE, 138, 3.75));
        students.add(new Student("Степан", 22, Gender.MALE, 145, 4.58));
        students.add(new Student("Елена", 21, Gender.FEMALE, 151, 4.48));

        System.out.println("Фильтр при помощи объекта StudentFilter");
        StudentUtils.filter(students, new StudentFilter());
        System.out.println();

        System.out.println("Фильтр при помощи объекта AnotherFilter");
        StudentUtils.filter(students, new AnotherFilter());
        System.out.println();

        System.out.println("Фильтр при помощи анонимного класса");
        StudentUtils.filter(students, new Filter() {
            @Override
            public boolean test(Student student) {
                return names.contains(student.getName()) && student.getGroup() > 110;
            }
        });
        // анонимный класс вызываем тогда, когда нам надо воспользоваться методом один раз
        System.out.println();

        // используем Фильтр при помощи лямбда-выражения
        // женщины, возраст больше 20, балл больше 4
        System.out.println("Фильтр при помощи лямбда-выражения");
        // StudentUtils.filter(students, student -> student.getGender().equals(Gender.FEMALE) && student.getAge() > 20 && student.getAverageRate() > 4);
        StudentUtils.filter(students, x -> x.getGender().equals(Gender.FEMALE) && x.getAge() > 20 && x.getAverageRate() > 4);

    }
}
