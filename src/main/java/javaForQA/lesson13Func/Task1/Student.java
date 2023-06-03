package javaForQA.lesson13Func.Task1;

import java.util.Objects;

public class Student {

    private String name;
    private int age;
    private Gender gender;
    private int group;
    private double averageRate;

    public Student(String name, int age, Gender gender, int group, double averageRate) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.group = group;
        this.averageRate = averageRate;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Gender getGender() {
        return gender;
    }

    public int getGroup() {
        return group;
    }

    public double getAverageRate() {
        return averageRate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return age == student.age && group == student.group && Double.compare(student.averageRate, averageRate) == 0 && Objects.equals(name, student.name) && gender == student.gender;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, gender, group, averageRate);
    }

    @Override
    public String toString() {
        return String.format("Студент: имя - %s, возраст - %d, пол - %s, группа - %d, средний балл - %.2f", name, age, gender.getDescription(), group, averageRate);
    }
}
