package javaForQA.lesson17.task4;

import java.util.regex.Pattern;

public class SplitTest {

    public static void main(String[] args) {

        String source = "Hello7World45I987study3Java";
        String regEx = "[0-9]{1,}";
        Pattern pattern = Pattern.compile(regEx);

        String[] words = pattern.split(source);

        for (String word : words) {
            System.out.print(word + " ");
        }
    }
}
