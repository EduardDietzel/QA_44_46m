package javaForQA.lesson14PracticFunc.task3;

public class Cow extends LandAnimal {

    public Cow(int weight){
        this.weight = weight;
    }

    @Override
    void voice() {
        System.out.println("Moooooo!");
    }
}
