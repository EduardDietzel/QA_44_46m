package javaForQA.lesson19.task2;

import java.io.FileReader;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {

        try {
            System.out.println(divide(10, 0));
            readFile("testFile1.txt");
        } catch (IOException e) {
            System.out.println("Возникла ошибка доступа к файлу");
        } catch (ArithmeticException e) {
            System.out.println("Возникла ошибка при вычислениях");
        }
    }

    public static void readFile(String fileName) throws IOException {
        // FileNotFoundException, IOException
//        try {
        FileReader fr = new FileReader(fileName);
        System.out.println(fr.read());
        fr.close();
//        } catch (IOException e) {
//            System.out.println("Произошла ошибка доступа к файлу");
//        }
    }

    public static int divide(int x, int y) {
        // ArithmeticException
        return x / y;
    }
}
