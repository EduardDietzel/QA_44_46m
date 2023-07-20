package javaForQA.lesson16_TryCatch.task4;

import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class ObjectInputTest {
    public static void main(String[] args) {

        File file = new File("objectTest\\object.txt");

        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(file))){

            Cat cat = (Cat) in.readObject();
            System.out.println(cat);

        } catch (Exception e) {
            System.out.println("Ошибка!");
        }
    }
}
