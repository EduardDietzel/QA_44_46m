package javaForQA.lesson14_PracticFunc.task3;

import java.util.ArrayList;
import java.util.List;

public class AnimalTest {
    public static void main(String[] args) {

        List<Cow> cows = new ArrayList<>();
        cows.add(new Cow(200));
        cows.add(new Cow(250));
        cows.add(new Cow(300));

        List<Dog> dogs = new ArrayList<>();
        dogs.add(new Dog(30));
        dogs.add(new Dog(40));
        dogs.add(new Dog(50));

        List<Animal> animals = new ArrayList<>();

        AnimalUtils.copy(animals, cows);
        AnimalUtils.copy(animals, dogs);

        for (Animal animal : animals){
            animal.voice();
        }

    }
}
