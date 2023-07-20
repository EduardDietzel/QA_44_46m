package javaForQA.lesson15_Stream.task4;

import java.io.File;
import java.io.IOException;

public class FileTest {
    public static void main(String[] args) throws IOException {

        File file = new File("fileTest\\testFile.txt");
        // здесь мы только создали объект, но не сам файл
        boolean isFileExists = file.exists();
        System.out.println("Существует ли реальный файл? - " + isFileExists);

        // теперь мы действительно создадим файл
        file.createNewFile();
        isFileExists = file.exists();
        System.out.println("Существует ли реальный файл? - " + isFileExists);
        // при повторном запуске программы в консоль будет выведено дважды true
        // так как файл уже создан при первом запуске

        // File file = new File("fileTest\\testFile.txt");

        System.out.println("Размер файла - " + file.length());
        file.delete();
        isFileExists = file.exists();
        System.out.println("Существует ли реальный файл? - " + isFileExists);
        // тут мы удалили файл из папки fileTest

        File file1 = new File("testDirectory");
        // создаем папку:
        file1.mkdir();
        // проверим, указывает наш объект на файл или папку
        // объект класса File может быть как файлом, так и папкой
        System.out.println("Является ли объект file1 файлом" + file1.isFile());
        System.out.println("Является ли объект file1 папкой" + file1.isDirectory());

        // можно создать несколько папок:
        File file2 = new File("firstDir\\secondDir\\thirdDir\\fourthDir");
        // метод mkdir() может создавать только одну папку
        file2.mkdir();
        // метод mkdirs() может создавать несколько папок
        file2.mkdirs();
        System.out.println(file2.exists());

        File[] files = file2.listFiles();
        for (File currentFile : files) {
            System.out.println(currentFile.getName() + " " + currentFile.isDirectory());
        }

    }
}
