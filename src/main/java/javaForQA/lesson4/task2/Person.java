package javaForQA.lesson4.task2;

public class Person {

    private int age;

    public Person(int age) {
        this.age = age;
    }

    public int getAge() { return age; }

    public void setAge(int age) { this.age = age; }

    public void test() {
        int i = 7;
        double d = i + 8;
        double result = d * 2;
        age = (int) result;

    }


}
