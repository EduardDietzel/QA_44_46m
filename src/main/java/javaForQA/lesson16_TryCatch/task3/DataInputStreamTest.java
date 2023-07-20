package javaForQA.lesson16_TryCatch.task3;

import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;

public class DataInputStreamTest {
    public static void main(String[] args) {

        File file = new File("dataTest\\data.txt");

        try (DataInputStream in = new DataInputStream(new FileInputStream(file))) {
            System.out.println(in.readUTF());
        } catch (Exception e) {
            System.out.println("Ошибка!");
        }
    }
}
