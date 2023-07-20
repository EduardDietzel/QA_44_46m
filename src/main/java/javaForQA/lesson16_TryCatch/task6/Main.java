package javaForQA.lesson16_TryCatch.task6;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        /*
        1. Создать класс Студент
        2. Студент должен иметь имя, возраст, номер группы и средний балл.
        3. Создайте конструктор для всех параметров, геттеры, equals, hashCode и toString,
           который должен выводить информацию о студенте в красивом форматированном виде
        4. В методе main создайте список студентов и добавьте туда 10 студентов
           с разными значениями полей (должно быть три группы, в каждой из которых 3-4 студента)
        5. Напишите метод, который в качестве параметра принимает лист студентов,
           а возвращает map, где ключ - это номер группы, а значение - список студентов,
           которые состоят в этой группе.
        6. Вызовите этот метод из метода main и выведите получившийся map в консоль.
        7. Запустите цикл, который из полученного map выведет информацию в консоль
           в следующем виде:
           Группа 1301:
           Студент такой-то...
           Студент такой-то...
           Студент такой-то...
           Группа 245:
           Студент такой-то...
           Студент такой-то...
           Студент такой-то...
           Группа 2876:
           Студент такой-то...
           Студент такой-то...
           Студент такой-то...
           Студент такой-то...
         */

        List<Student> studentsList = new ArrayList<>();
        studentsList.add(new Student("Tom Smith", 21, "1301", 4.56));
        studentsList.add(new Student("Ivan Ivanov", 20, "2876", 4.22));
        studentsList.add(new Student("Petr Petrov", 23, "1301", 3.56));
        studentsList.add(new Student("Anna Petrova", 22, "245", 4.59));
        studentsList.add(new Student("Sidor Sidorov", 20, "1301", 3.99));
        studentsList.add(new Student("Anna Molokova", 21, "245", 4.05));
        studentsList.add(new Student("Nazar Nazarov", 25, "2876", 4.56));
        studentsList.add(new Student("Tom Lee", 21, "245", 4.33));
        studentsList.add(new Student("Lena Petrova", 24, "1301", 4.77));
        studentsList.add(new Student("Petr Ivanov", 23, "2876", 4.56));

        Map<String, List<Student>> listStudentsByGroup = getListStudentsByGroup(studentsList);
        System.out.println(listStudentsByGroup);

        for (Map.Entry<String, List<Student>> pair : listStudentsByGroup.entrySet()) {
            String group = pair.getKey();
            System.out.printf("Группа %s:\n", group);
            List<Student> students = pair.getValue();
            for (Student student : students) {
                System.out.println(student);
            }
        }
    }

    public static Map<String, List<Student>> getListStudentsByGroup(List<Student> students) {

        Map<String, List<Student>> mapStudents = new HashMap<>();
        for (Student stud : students) {
            String numberGroup = stud.getGroup();
            if (mapStudents.containsKey(numberGroup)) {
                List<Student> currentList = mapStudents.get(numberGroup);
                currentList.add(stud);
            } else {
                List<Student> newList = new ArrayList<>();
                newList.add(stud);
                mapStudents.put(numberGroup, newList);
            }
        }
        return mapStudents;
    }

}
