package javaForQA.lesson15Stream.task2;

import java.io.*;

public class InTest {
    public static void main(String[] args) throws IOException {

        // создадим объект входящего потока
        // в аргументы надо что-то передать в виде строки

        InputStream in = new FileInputStream("fileTest\\test.txt");
        // FileInputStream было подчеркнуто красным, надо добавить throws
        Reader reader = new InputStreamReader(in);
        // создали объект класса InputStreamReader, который будет работать с объектом InputStream

        int data = reader.read();
        System.out.println(data);
        // в консоль выведется "84" - это байты информации
        // её надо преобразовать к символьному виду
        // метод read() считывает 1 байт информации

        System.out.println((char) data);

        // нужен цикл
        // будет работать до тех пор, пока наша информация (файл) не закончится (-1)
        // false закончит работу цикла
        while (data != -1) {
            System.out.print((char) data + " ");
            data = reader.read();
        }

    }
}
