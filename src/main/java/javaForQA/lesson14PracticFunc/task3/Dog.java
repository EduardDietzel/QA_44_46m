package javaForQA.lesson14PracticFunc.task3;

public class Dog extends LandAnimal{

    public Dog(int weight) {
        this.weight = weight;
    }

    @Override
    void voice() {
        System.out.println("Wof, wof!");
    }
}
