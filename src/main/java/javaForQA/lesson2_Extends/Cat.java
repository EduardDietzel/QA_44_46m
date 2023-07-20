package javaForQA.lesson2_Extends;

public class Cat extends Mammal {

    public String name;
    public static int pawsCount = 4;

    public Cat (String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    public Cat() {
        System.out.println("Вызван конструктор Cat");
    }

    @Override
    public void move() {
        System.out.println("Кот бежит по земле");
    }

    @Override
    public void voice() {
        System.out.println("Кот мяукает");
    }

    public void voice(String name) {
        System.out.println(name + " мяукает");
    }

    public void voice(int i) {
        System.out.println("Кот мяукнул " + i + " раз");
    }
    // перегруженные методы - методы с одним названием, но с разным набором данных (параметров)



}
