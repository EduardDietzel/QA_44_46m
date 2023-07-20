package javaForQA.lesson16_TryCatch.task3;

import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;

public class DataOutputStreamTest {
    public static void main(String[] args) {

        File file = new File("dataTest\\data.txt");

        try (DataOutputStream out = new DataOutputStream(new FileOutputStream(file))) {
            out.writeUTF("Hello World!");
        } catch (Exception e) {
            System.out.println("Ошибка!");
        }
    }
}
