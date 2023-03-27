package javaForQA.lesson4.task1;

public class Dog {

    private int age;
    private String color;

    public Dog(int age, String color) {
        this.age = age;
        this.color = color;
    }




    public void printInfo() {
        System.out.println("Dog");
        System.out.println("Age:" + age);
        System.out.println("Color:" + color);
    }
}
