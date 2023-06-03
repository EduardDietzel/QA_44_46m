package javaForQA.lesson13Func.Task3;

import java.util.function.Consumer;

public class ConsumerTest {
    public static void main(String[] args) {

        Consumer<Integer> display = x -> System.out.println(x);

        display.accept(15);
        display.accept(35);
        // записали один раз метод (возможно во много строк), а вызываем его одной командой display.accept(t);
    }
}
