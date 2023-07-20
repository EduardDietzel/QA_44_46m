package javaForQA.lesson19.task3;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите возраст:");
        int age = scanner.nextInt();
        try {
            registration(age);
        } catch (TooBigAgeException | TooSmallAgeException e) {
            System.out.println("Ошибка. Переданный возраст некорректен");
//            System.out.println(e.getMessage());
        }
    }

    public static void registration(int age) throws TooBigAgeException {
        // Ограничения по возрасту
        // Пользователь должен быть не младше 12 лет
        // Пользователь должен быть не старше 200 лет

        if (age < 12) {
//            System.out.println("Возраст слишком мал");
//            return;
            throw new TooSmallAgeException();
        }
        if (age > 200) {
//            System.out.println("Возраст слишком велик");
//            return;
            throw new TooBigAgeException();
        }

        System.out.println("Регистрация успешна");
    }
}
