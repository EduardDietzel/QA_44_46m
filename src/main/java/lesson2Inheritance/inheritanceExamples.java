package lesson2Inheritance;


// Наследование - функция
// Полиморфизм - это следствие наследования

public class inheritanceExamples {
    public static void main(String[] args) {

        Animal animal = new Animal();
        animal.voice();

        Dog dog = new Dog();
        dog.voice();

        Shepard shepard = new Shepard();
        shepard.voice();

        Bird bird = new Bird();
        bird.voice();

        Parrot parrot = new Parrot();
        parrot.voice();
        parrot.fly();
        parrot.eat();

    }
}

class Animal {
    public void voice() {
        System.out.println("Voice-voice");
    }

    public void animalMethod() {}
    // просто пустой метод - как вариант, что можно использовать

    public void getMethod(){
    }
}

class Bird extends Animal implements Flying, Eating {
    public void voice() {
        System.out.println("Tru-lu-lu");
    }

    @Override
    public void fly() {
    }

    @Override
    public void eat() {
    }
}

final class Parrot extends Bird {
    // final - означает, что унаследовать новый класс от этого класса мы уже не можем. Если будет нужно, то надо будет убрать final.
    @Override
    public void voice() {
        System.out.println("Chick-chi-rick");
        fly();
        eat();
    }

    @Override
    public void fly() {
        System.out.println("fly skill was added");
    }

    @Override
    public void eat() {
        System.out.println("eat skill was added");
    }
}

class Dog extends Animal{
    @Override
    public void voice() {
        System.out.println("Bark-Bark");
    }

    public void dogMethod() {}
}

class Shepard extends Dog implements Jamping{
    @Override
    public void voice(){
        System.out.println("Bark-Shepard-Bark");
    }

    @Override
    public void jamp() {
    }
}

// (направление в сторону дочернего класса)
// Пример многоуровневого наследования:
// Shepard <- Dog <- Animal
// Bird<- Animal -> Dog (пример иерархического сценария) два класса, которые наследуются от одного класса
// если бы было только Dog <- Animal это одноуровневое наследование.

interface Flying {
    void fly();
}

interface Eating {
    void eat();
}

interface Jamping {
    void jamp();
}