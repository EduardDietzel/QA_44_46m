package javaForQA.lesson2_Extends;

public class Fish extends Animal {

    public boolean canFeedWithMilk;

    public Fish() {
        canFeedWithMilk = false;
    }
    @Override
    public void move() {
        System.out.println("Рыба плывет в воде");
    }
}
