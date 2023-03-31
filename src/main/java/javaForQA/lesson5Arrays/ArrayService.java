package javaForQA.lesson5Arrays;

public class ArrayService {

    public static int binarySearch(int[] array, int search) {
        int low = 0;
        int high = array.length - 1;

        while (low <= high) {
            int half = (low + high) / 2;

            if (search < array[half]) {
                high = half - 1;
            } else if (search > array[half]) {
                low = half + 1;
            } else {
                return half;
            }
        }
        return -1;
    }
}
