package javaForQA.lesson14PracticFunc.task3;

import java.util.List;

public class AnimalUtils {

    public static void copy(List<? super LandAnimal> destination, List<? extends LandAnimal> sourse){
        // ? super LandAnimal -> LandAnimal, Animal, Object
        // ? extends LandAnimal -> LandAnimal, Cow, Dog

        destination.addAll(sourse);
    }
}
