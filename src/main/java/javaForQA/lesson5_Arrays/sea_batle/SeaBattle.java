package javaForQA.lesson5_Arrays.sea_batle;

import java.util.Scanner;

public class SeaBattle {
    static Scanner scanner = new Scanner(System.in);
    public static Player[] players = new Player[2];

    public static void main(String[] args) {
        // Это главный метод, он будет включать в себя отдельные методы.
        // Здесь будем писать только их названия
        // 1. создание игроков
        createPlayers();
        // 2. Заполнить поля игроков. Запускаем метод
        fillPlayerFields();
        // 2. старт игры

        // 4. вывод результатов

    }

    private static void createPlayers() {
//        Scanner scanner = new Scanner(System.in);
        // метод для создания двух игроков
        System.out.println("Морской бой.");
        System.out.println("Игрок 1, введите своё имя: ");
        String name = scanner.nextLine();
        players[0] = new Player(name);
        // players[0].printField(); // это показывает сетку поля

        System.out.println("Игрок 2, введите свое имя:");
        name = scanner.nextLine();
        players[1] = new Player(name);

    }

    // Заполнять игровые поля должен каждый игрок
    private static void fillPlayerFields() {
        // проходим циклом по массиву игроков
        // где у каждого игрока вызовем метод fillGameField
        // поскольку игроков два, то и итерации будет две
        for (Player player : players) {
            player.fillGameField();
        }
    }
}
