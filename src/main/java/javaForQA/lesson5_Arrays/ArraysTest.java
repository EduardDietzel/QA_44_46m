package javaForQA.lesson5_Arrays;

import java.util.Arrays;

public class ArraysTest {
    public static void main(String[] args) {

        String name = "Hello";
        String[] stringArray = new String[10];

        System.out.println(stringArray[5]);

        stringArray[5] = name;

        System.out.println(stringArray[5]);

        // массив элементов типа int (чисел)
        int[] intArray = {6, 3, 15, 0, 45};

        System.out.println(Arrays.toString(intArray));

        // напишем цикл "for-ech"
        for (int value: intArray) {
            System.out.println(value);
        }

        for (int index = 0; index < intArray.length; index++) {
            // такой метод универсальный и сможет работать с массивом любой длины
            // как нам по очереди вывести все элементы
            System.out.println(intArray[index] + " index = " + index);
            // тут мы вывели и само значение, и адрес, по которому оно записано
        }

        int[][] intArray2D = new int[3][4];

        intArray2D[2][1] = 5;

        // System.out.println(Arrays.toString(intArray2D));

        for (int[] row : intArray2D) {
            for (int cell : row) {
                System.out.print(cell + " ");
            }
            System.out.println();
        }

        int[][] intArray2D1 = {{1,2,3},
                                {4,5,6},
                                {7,8,9}};

        for (int[] row : intArray2D1) {
            for (int cell : row) {
                System.out.print(cell + " ");
            }
            System.out.println();
        }

        int[][][] intArray3D = new int[3][4][7];

        intArray3D[2][1][5] = 7;

        for (int[][] array2D : intArray3D) {
            for (int[] row : array2D) {
                for (int cell : row) {
                    System.out.print(cell + " ");
                }
                System.out.println();
            }
            System.out.println();
        }

        int[] array = {0,0,3,6,8,9,12,15,20};
        int search = 9;

        System.out.println(ArrayService.binarySearch(array, search));

        int[] array1 = {8,3,12,1,0,15,20};

        Arrays.sort(array1);

        System.out.println(Arrays.toString(array1));
    }
}
