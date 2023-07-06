package javaForQA.lesson18.task2;

import javaForQA.lesson16TryCatch.task4.Cat;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List list = new ArrayList<>();
        list.add("Hello");
        list.add(new Cat(3, "Black", 4.12));
        String text = list.get(0) + " World"; // конкатинируя к любому объекту строку, мы превращаем новый объект в строку
        // String text = list.get(0); - так сделать нельзя, так какОбъектом может быть любой объект, который нельзя превратить в строку типа String

        System.out.println(text);

    }
}
