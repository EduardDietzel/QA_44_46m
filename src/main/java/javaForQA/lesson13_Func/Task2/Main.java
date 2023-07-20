package javaForQA.lesson13_Func.Task2;

public class Main {
    public static void main(String[] args) {

        Utils.print("Hello", 4, new StringOperation());
        // мы получим слово "Hello" 4 раза

        Utils.print("Hello", 4, new Operation() {
            @Override
            public String operation(String word, int count) {
                StringBuilder builder = new StringBuilder();
                for (int i = 0; i < count; i++) {
                    builder.append(word).append(" ");
                }
                return builder.toString();
            }
        });

        // делаем через лямбда-выражение
        Utils.print("Hello", 4, (x, y) -> {
            StringBuilder builder = new StringBuilder();
            for (int i = 0; i < y; i++) {
                builder.append(x).append(" ");
            }
            return builder.toString();
        });

        // можно записать в переменную метод
        Operation operation = (x, y) -> {
            StringBuilder builder = new StringBuilder();
            for (int i = 0; i < y; i++) {
                builder.append(x.toUpperCase()).append(" ");
            }
            return builder.reverse().toString();
        };

        System.out.println("Передаем один метод внутрь другого метода.");
        Utils.callMethod("Hello", 4, operation);

    }
}
