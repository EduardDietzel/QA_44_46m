package javaForQA.lesson16_TryCatch.task2;

import java.io.File;
import java.io.FileInputStream;

public class FileInputStreamTest {
    public static void main(String[] args) {

        File dir = new File("testDir");
        // пока мы только создали объект, но не файл
        dir.mkdir();
        File file = new File("testDir\\inputTest.txt");

        try {
            file.createNewFile();
            FileInputStream in = new FileInputStream(file);
            System.out.println("Available: " + in.available());

            int read = in.read();
            System.out.println("Считанная информация" + (char) read);

            while (read != -1) {
                System.out.print((char) read);
                read = in.read();
            }

        } catch (Exception e) {
            System.out.println("Произошла ошибка");
        }
    }
}
