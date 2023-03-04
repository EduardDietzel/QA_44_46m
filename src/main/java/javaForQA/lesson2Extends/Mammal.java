package javaForQA.lesson2Extends;

public abstract class Mammal extends Animal {
    // Класс, в котором есть абстрактный метод, тоже должен быть абстрактным

//    @Override
//    public abstract void move();

    public boolean canFeedWithMilk;

    public Mammal() {
        canFeedWithMilk = true;
        System.out.println("Вызван конструктор Mammal");
    }

    public abstract void voice();

}
