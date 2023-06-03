package javaForQA.lesson13Func.Task2;

public class StringOperation implements Operation {

    @Override
    public String operation(String word, int count) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < count; i++) {
            builder.append(word).append(" ");
        }
        return builder.toString();
    }
}
