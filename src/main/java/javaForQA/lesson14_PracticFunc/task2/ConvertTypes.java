package javaForQA.lesson14_PracticFunc.task2;

import java.util.function.Function;

public class ConvertTypes {
    public static void main(String[] args) {

        Dog dog = new Dog(3, "Black", 9);
        System.out.println(dog);

        // надо написать такую функцию, которая превратит собаку в кота
        // конвертация объекта собаки в объект кота
        Function<Dog, Cat> converter = x -> new Cat(x.getAge(), x.getColor(), x.getWeight() / 2);

        Cat cat = converter.apply(dog);
        System.out.println(cat);
    }
}
