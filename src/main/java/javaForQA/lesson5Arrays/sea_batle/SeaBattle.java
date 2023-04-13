package javaForQA.lesson5Arrays.sea_batle;

import java.util.Scanner;

public class SeaBattle {
    public static Player[] players = new Player[2];

    public static void main(String[] args) {

        // создание игроков
        createPlayers();
        // заполнить поля игроков
        fillPlayerFields();
        // старт игры
        // вывод результатов

    }

    private static void createPlayers() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Морской бой.");
        System.out.println("Игрок 1, введите своё имя: ");
        String name = scanner.nextLine();
        players[0] = new Player(name);
        // players[0].printField(); // это показывает сетку поля

        System.out.println("Игрок 2, введите свое имя:");
        name = scanner.nextLine();
        players[1] = new Player(name);

    }

    private static void fillPlayerFields() {
        for (Player player : players) {
            player.fillGameField();
        }
    }
}
