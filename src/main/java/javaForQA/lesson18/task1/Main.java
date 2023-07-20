package javaForQA.lesson18.task1;

import javaForQA.lesson16_TryCatch.task4.Cat;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<String> strings = new ArrayList<>();
        List<Integer> integers = new ArrayList<>();
        List<Cat> cats = new ArrayList<>();

        Box box = new Box();

        box.putItem("Hello");
        box.putItem(24);
        box.putItem(new Cat(4, "Black", 4.76));

        Object obj = box.getItem();
        System.out.println(((String) obj).length());

        Object obj1 = box.getItem();
        System.out.println(((String) obj).length());
    }
}
