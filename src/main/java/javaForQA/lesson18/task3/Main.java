package javaForQA.lesson18.task3;

import javaForQA.lesson16TryCatch.task4.Cat;

public class Main {

    public static void main(String[] args) {

        Box<String> box1 = new Box<>();
        Box<Cat> box2 = new Box<>();

        box1.putItem("Hallo");
        box2.putItem(new Cat(3, "Black", 4.56));


    }
}
