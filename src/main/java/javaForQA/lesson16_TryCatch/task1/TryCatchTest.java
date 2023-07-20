package javaForQA.lesson16_TryCatch.task1;

public class TryCatchTest {
    public static void main(String[] args) {

        System.out.println(div(6, 0));

        System.out.println("Конец работы программы");
        // если программа работает, до дойдет до конца
        // если будет ошибка, то программа перестанет выполнять действия после неё
    }

    public static int div(int x, int y){
        int result = -1;
        try {
            result = x / y;
        } catch (ArithmeticException e) {
            System.out.println("Возникла ошибка в методе div");
        } finally {
            System.out.println("Отработал блок finally");
        }
        // блок finally отрабатывает в любом случае, даже если есть ошибка в программе
        return result;
    }
}
