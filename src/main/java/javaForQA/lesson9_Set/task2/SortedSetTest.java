package javaForQA.lesson9_Set.task2;

import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetTest {

    public static void main(String[] args) {

        Student student1 = new Student(11, "John", "Smit", 3, 4.53);
        Student student2 = new Student(4, "Max", "Faktor", 1, 3.15);
        Student student3 = new Student(7, "Fill", "Dubl", 5, 4.88);
        Student student4 = new Student(9, "Ed", "Hardi", 2, 4.15);
        Student student5 = new Student(2, "Mark", "Mayers", 4, 3.99);
        Student student6 = new Student(19, "Ilon", "Mask", 3, 4.53);
        Student student7 = new Student(8, "Luk", "Besson", 1, 4.71);
        Student student8 = new Student(25, "Steev", "Jobs", 5, 3.73);
        Student student9 = new Student(14, "Jack", "Mitchel", 2, 5.00);
        Student student10 = new Student(30, "Bob", "Marly", 4, 4.25);
        Student student11 = new Student(30, "Bob", "Marly", 4, 4.25);

        // мы должны дать программе понять, по какому принципу она должна сортировать сет
        SortedSet<Student> students = new TreeSet<>();
        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);
        students.add(student5);
        students.add(student6);
        students.add(student7);
        students.add(student8);
        students.add(student9);
        students.add(student10);
        students.add(student11);

        for (Student student : students) {
            System.out.println("Id: " + student.getId() + ", Name: " + student.getName() + ", Surname: " + student.getSurname() + ", Course: " + student.getCourse() + ", Average Rate: " + student.getAverageRate());

        }
    }
}
