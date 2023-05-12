package javaForQA.lesson5_Arrays.sea_batle;

import java.util.Scanner;

public class Player {

    private String name;
    private char[][] field;
    private int fieldSize = 10;
    // координаты полей будут индексы массивов
    private int[][] deckShipAmount = {{4, 1}, {3, 2}, {2, 3}, {1, 4}};
    // массив с кораблями - (кол-во палуб, кол-во кораблей)
    private char emptyCell = '.';  // переменная - пустая ячейка
    private char valueForShip = 'O';  // переменная обозначения корабля на поле
    private boolean isAlive = true;

    public Player(String name) {
        this.name = name;
        this.field = new char[fieldSize][fieldSize];
        initialField();
    }

    public String getName() {
        return name;
    }

    public char[][] getField() {
        return field;
    }

    @Override
    public String toString() {
        return name;
    }

    // метод первоначального заполнения полей
    private void initialField() {
        for (int i = 0; i < fieldSize; i++) {
            for (int j = 0; j < fieldSize; j++) {
                field[i][j] = emptyCell;
            }
        }
    }

    public void printField() {
        for (char[] row : field) {
            for (char cell : row) {
                System.out.print(cell + " ");
            }
            System.out.println();
        }
    }

    // метод для заполнения полей игроками
    public void fillGameField() {
        // нужен массив
        Scanner scanner = new Scanner(System.in);
        for (int[] row : deckShipAmount) {
            int decks = row[0]; // кол-во палуб
            int ships = row[1]; // кол-во кораблей

            for (int i = 0; i < ships; i++) {
                System.out.printf("%s, разместите корабль на %d палубы.\n", name, decks);
                System.out.println("Введите ряд:");
                // здесь везде должны быть проверки на корректность введенных значений.
                int inputtedRow = Integer.parseInt(scanner.nextLine());
                System.out.println("Введите столбец.");
                int inputtedColumn = Integer.parseInt(scanner.nextLine());
                System.out.println("Выберите расположение: 1 - горизонтальное, 2 - вертикальное.");
                int direction = Integer.parseInt(scanner.nextLine());

                // Проверка корректности введенных координат.
                // Не выходит ли корабль за пределы игрового поля.
                // Не соприкасается ли корабль с соседним кораблем.
                boolean result = isCoordinatesCorrect(inputtedRow, inputtedColumn, direction, decks);
                // В зависимости от результата либо размещать корабль, либо заставить игрока повторить ввод координат.

                placeShip(inputtedRow, inputtedColumn, direction, decks); // метод, рисующий корабль
                printField();

                //  заменить: x - inputtedRow, y - inputtedColumn
            }
        }
    }

    private void placeShip(int x, int y, int direction, int decks) {
        for (int i = 0; i < decks; i++) {
            field[x][y] = valueForShip;
            if (direction == 1) {
                y++;
            } else { x++; }
        }
    }

    private boolean isCoordinatesCorrect(int x, int y, int direction, int decks) {
        // Вернуть true, если координаты корректны,
        // то есть корабль не соприкасается и не пересекает другие
        // и не выходит за пределы поля.
        // Иначе вернуть false.
        return false;
    }
}
