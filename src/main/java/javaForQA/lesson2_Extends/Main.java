package javaForQA.lesson2_Extends;

public class Main {

    public static void main(String[] args) {

//        Animal animal = new Animal();
//        animal.printInfo();

        Fish fish = new Fish();
        fish.printInfo();

        Cat cat = new Cat();
        cat.printInfo();
        // Пример того, как делается многоуровневое наследование (коту от млекопитающих, те в свою очередь от животных)

//        Mammal mammal = new Mammal();
//        mammal.printInfo();

        System.out.println(cat.getName());

        cat.move();

        System.out.println("Создаем собаку");
        Dog dog = new Dog();

        System.out.println(dog.canEat);
        System.out.println(dog.canFeedWithMilk);

        System.out.println(fish.canEat);
        System.out.println(fish.canFeedWithMilk);

        Animal.getInfo();

        Cat cat1 = new Cat("Barsik");
        Cat cat2 = new Cat("Mursik");

        System.out.println(cat1.name);
        System.out.println(cat2.name);
        System.out.println("Change name cat1");
        cat1.name = "Ryjik";
        System.out.println(cat1.name);
        System.out.println(cat2.name);
        System.out.println("Count lap");
        System.out.println(cat1.pawsCount);
        System.out.println(cat2.pawsCount);
        System.out.println("Change pawsCount cat1");
        Cat.pawsCount = 5;
        System.out.println(cat1.pawsCount);
        System.out.println(Cat.pawsCount);

        Cat cat3 = new Cat();

        Mammal mammal = new Cat();
        Mammal mammal1 = new Dog();
        // можно и так, и так

        mammal.voice();
        mammal1.voice();
        // реализуется метод того, кто приписан к переменной

        System.out.println("Тестируем перегруженные методы");
        cat3.voice();
        cat3.voice("Barsik");
        cat3.voice(5);
        // полиморфизм времени компиляции
        // количество параметров (аргументов) может быть разным

    }
}
