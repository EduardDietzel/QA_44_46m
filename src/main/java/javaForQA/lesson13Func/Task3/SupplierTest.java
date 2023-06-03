package javaForQA.lesson13Func.Task3;

import java.util.function.Supplier;

public class SupplierTest {
    public static void main(String[] args) {

        // метод ничего не принимает, ставим ()
        Supplier<Double> supplier = () -> Math.random();

        System.out.println(supplier.get());
        System.out.println(supplier.get());
        System.out.println(supplier.get());
        System.out.println(supplier.get());
        System.out.println(supplier.get());
    }
}
