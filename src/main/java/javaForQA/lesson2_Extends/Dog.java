package javaForQA.lesson2_Extends;

public class Dog extends Mammal {
    public Dog() {
        System.out.println("Вызван конструктор Dog");
    }

    @Override
    public void move() {
        System.out.println("Собака бежит по земле");
    }

    @Override
    public void voice() {
        System.out.println("Собака лает");
    }
}
