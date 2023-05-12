package javaForQA.lesson9_Set.task2;

import java.util.Objects;

public class Student implements Comparable<Student>{

    private int id;
    private String name;
    private String surname;
    private int course;
    private double averageRate;

    public Student(int id, String name, String surname, int course, double averageRate) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.course = course;
        this.averageRate = averageRate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public double getAverageRate() {
        return averageRate;
    }

    public void setAverageRate(double averageRate) {
        this.averageRate = averageRate;
    }

    // мы должны дать программе понять, по какому принципу она должна сортировать сет
    @Override
    public int compareTo(Student student) {
        // если курсы не равны, то сравниваем по курсу
        // если курсы равны, сравниваем по среднему баллу
        // если средний балл равен, сравниваем по фамилии
        //return id - student.getId();

        if (course != student.course){
            return course - student.course;
        }
        if (averageRate != student.averageRate){
            return Double.compare(averageRate, student.averageRate);
        }
        return surname.compareTo(student.surname);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return id == student.id && course == student.course && Double.compare(student.averageRate, averageRate) == 0 && Objects.equals(name, student.name) && Objects.equals(surname, student.surname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, surname, course, averageRate);
    }
}
