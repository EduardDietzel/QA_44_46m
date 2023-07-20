package javaForQA.lesson16_TryCatch.task5;

public class Main {
    public static void main(String[] args) {

//        Дан массив из N целых чисел и целое число  K , найдите количество пар элементов в массиве, сумма которых равна K.
//
//        Пример 1:
//
//        Вход:
//        N = 4, K = 6
//        arr[] = {1, 5, 7, 1}
//        Вывод: 2
//        Объяснение:
//        arr[0] + arr[1] = 1 + 5 = 6
//        arr[1] + arr[3] = 5 + 1 = 6.

//        Вывести все пары в консоль в формате
//        1 + 5 = 6

        int[] array = {2, 5, 2, 4, 0, 8, 9, 15, 3, 5, 3, 7, 0};
        int k = 7;

        System.out.println("Количество пар - " + findPairs(array, k));
    }

    public static int findPairs(int[] array, int k) {
        // Метод должен возвращать количество найденных пар
        // и выводить каждую найденную пару в консоль
        // 2 + 5 = 7
        // 2 + 5 = 7

        int count = 0;
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i+1; j < array.length; j++) {
                if (array[i] + array[j] == k) {
                    count++;
                    System.out.println(array[i] + " + " + array[j] + " = " + k);
                }
            }

        }
        return count;
    }
}
