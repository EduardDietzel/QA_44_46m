package taskMikhail.taskLesson1;

public class Task1 {
    public static void main(String[] args) {
        int[] arr = {12, 3, 6, 5, 4, 7, 8, 9, 6, 5, 4, 1, 23};

    }
    private static void sum(int[] arr){
        int start = 0;
        int end = arr.length - 1;
        int sum = 0;

        while (start != end){
            sum = sum + (arr[start] + arr[end]);
            start++;
            end--;
        }
        if (start == end){
//            sum = sum + arr[start];
            sum +=arr[start];
        }

//        for (int i = 0; i < arr.length/2; i++) {
//            sum = sum + (arr[i] + arr[arr.length - (i+1)]);
//        }

        System.out.println(sum);
    }
}

/*
HT
дан массив. Надо найти
- если массив длины больше чем 4 - 3й и 4й по минимальности элемент
если меньше то сообщение, что массив меньше

- заполнить массив числами фибоначчи

 */