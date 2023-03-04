package javaForQA.lesson2Extends;

public class Bird extends Animal implements Flyable {
    @Override
    public void move() {
        System.out.println("Птица летит в воздухе");
    }

    @Override
    public void fly() {
        System.out.println("Я могу летать");
    }
}
