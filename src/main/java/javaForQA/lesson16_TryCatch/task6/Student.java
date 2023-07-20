package javaForQA.lesson16_TryCatch.task6;

import java.util.Objects;

public class Student {

    private String name;
    private int age;
    private String group;
    private double averageRate;

    public Student(String name, int age, String group, double averageRate) {
        this.name = name;
        this.age = age;
        this.group = group;
        this.averageRate = averageRate;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getGroup() {
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
        return age == student.age && Double.compare(student.averageRate, averageRate) == 0 && Objects.equals(name, student.name) && Objects.equals(group, student.group);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, group, averageRate);
    }

    @Override
    public String toString() {
        return String.format("Студент: имя - %s, возраст - %d, группа - %s, средний балл - %.2f", name, age, group, averageRate);

    }
}
