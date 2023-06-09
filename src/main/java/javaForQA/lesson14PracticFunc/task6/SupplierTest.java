package javaForQA.lesson14PracticFunc.task6;

import java.util.function.Supplier;

public class SupplierTest {
    public static void main(String[] args) {

        String phrase = "Hello World!";
        Supplier<String> supplier = () -> phrase.toUpperCase();

        System.out.println(supplier.get());
    }
}
