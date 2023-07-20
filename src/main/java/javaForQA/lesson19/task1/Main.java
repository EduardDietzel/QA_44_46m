package javaForQA.lesson19.task1;

public class Main {

    public static void main(String[] args) {

        int x = 10;
        int y = 0;

        int result;

        try {
            result = divide(x, y);
        } catch (ArithmeticException e) {
            result = 0;
            System.out.println("Возникла ошибка при вычислениях");
            System.out.println("Сообщение об ошибке - " + e.getMessage());
            e.printStackTrace();
        }

        System.out.println(result);
    }

    public static int divide(int x, int y) {
        int result = x / y;
        return result;
    }
}
