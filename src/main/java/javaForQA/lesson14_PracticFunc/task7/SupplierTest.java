package javaForQA.lesson14_PracticFunc.task7;

import java.util.function.Supplier;

public class SupplierTest {
    public static void main(String[] args) {

        print(() -> 5);
        System.out.println();
        print(() -> (int) (Math.random() * 10));
    }

    public static void print(Supplier<Integer> supplier){
        for (int i = 0; i < 10; i++) {
            System.out.print(supplier.get() + " ");
        }
    }
}
