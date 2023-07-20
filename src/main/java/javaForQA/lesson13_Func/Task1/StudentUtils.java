package javaForQA.lesson13_Func.Task1;

import java.util.List;

public class StudentUtils {

    // метод выводит студентов в консоль, но только тех, кто подходит по фильтру
    public static void filter(List<Student> students, Filter filter){
        // сначала делаем цикл по студентам
        for (Student student: students) {
            if (filter.test(student)){
                System.out.println(student);
            }
        }
    }
}
