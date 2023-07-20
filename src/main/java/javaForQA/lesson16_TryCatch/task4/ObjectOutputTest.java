package javaForQA.lesson16_TryCatch.task4;

import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class ObjectOutputTest {
    public static void main(String[] args) {

        Cat cat = new Cat(3, "Black", 5.47);
        System.out.println(cat);

        File file = new File("objectTest\\object.txt");

        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(file))){
            out.writeObject(cat);
        } catch (Exception e) {
            System.out.println("Ошибка!");
        }
    }
}
