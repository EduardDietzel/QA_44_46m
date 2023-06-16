package javaForQA.lesson15Stream.task5;

import java.io.*;
import java.util.Scanner;

public class FileOutTest {
    public static void main(String[] args) throws IOException {

        File file = new File("fileTest\\outFileTest.txt");
        file.createNewFile();
        FileOutputStream out = new FileOutputStream(file);
        FileWriter writer = new FileWriter(file);

        System.out.println("Начинаем запись данных в файл");
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();

        while (input != 0) {
            out.write(input);
            input = scanner.nextInt();
        }

        out.close();
        writer.close();

        System.out.println("Запись в файл закончена, исходящий поток закрыт");

        System.out.println("Начинаем считывать данные из файла");
        InputStream in = new FileInputStream(file);
        int data = in.read();

        while (data != -1) {
            System.out.println(data);
            data = in.read();
        }
        in.close();
        System.out.println("Считывание данных из файла закончено, входящий поток закрыт");
    }
}
