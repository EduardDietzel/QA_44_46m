package javaForQA.lesson16_TryCatch.task2;

import java.io.File;
import java.io.FileOutputStream;

public class FileOutputStreamTest {
    public static void main(String[] args) {

        File dir = new File("outputDir");
        dir.mkdir();
        File file = new File("outputDir\\output.txt");

        try (FileOutputStream out = new FileOutputStream(file, true)){
            // параметр true позволяет записывать в файл повторяющиеся данные
            file.createNewFile();
            out.write(72);

        } catch (Exception e) {
            System.out.println("Произошла ошибка");
        }
    }
}
