package javaForQA.lesson1;

public class Dog {

    private String breed;
    private int age;
    private String color;
    private String name;

    public Dog() {
        System.out.println("Вызван конструктор Dog");
    }
    // конструктор без параметров, по умолчанию

    public Dog(String name) {
        this.name = name;
        System.out.println("Вызван конструктор с параметром Имя");
    }
    // Конструкторов может быть сколько угодно и в любом порядке. Но только после переменных!

    public Dog(int age) {
        this.age = age;
        System.out.println("Вызван конструктор с параметром возраст");
    }

    public Dog(int age, String color) {
        this.age = age;
        this.color = color;
        System.out.println("Вызван конструктор с двумя параметрами: возраст и цвет");
    }

    public Dog(String name, int age, String breed, String color) {
        this.breed = breed;
        this.age = age;
        this.color = color;
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void setAge(int age) {
        // Если возраст меньше 0, то выбрасываем ошибку
        if (age < 0) {
            System.out.println("Возраст не может быть отрицательным");
            age = 0;
        }
        this.age = age;
    }
    public int getAge(){
        return age;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    void bark() {
        // System.out.println("Woof!");
        // этот метод работает для любой собаки
        System.out.println(name + " лает: Woof!");
    } // метод, который заставляет собаку лаять

    void sleep() {

    }

    void walk() {

    }

}
