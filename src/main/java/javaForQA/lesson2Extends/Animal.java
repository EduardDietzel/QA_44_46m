package javaForQA.lesson2Extends;

public abstract class Animal {

    public boolean canEat;

    public Animal() {
        canEat = true;
        System.out.println("Вызван конструктор Animal");
    }

    private String name = "животное";

    public void printInfo() {
        System.out.println("Это животное");
    }

    public String getName() {
        return name;
    }

    public abstract void move();
    // создали абстрактный метод,
    // чтобы не забыть реализовать этот метод у каждого наследника
    // В том случае, когда мы точно знаем, что этот метод должен быть ОБЯЗАТЕЛЬНО
    // реализован в каждом наследнике! Тогда метод должен быть: АБСТРАКТНЫЙ !

    public static void getInfo() {
        System.out.println("Все животные живут на планете Земля");
    }
    // для вызывания методов в других классах (наследниках) не создавая объект
    // статические относятся к классу, а нестатические - к методу
}
