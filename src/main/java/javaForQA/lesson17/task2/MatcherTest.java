package javaForQA.lesson17.task2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MatcherTest {

    public static void main(String[] args) {

        String source = "http://www.example.www.com";
        String regEx = "[^0-9]www\\.";
        Pattern pattern = Pattern.compile(regEx);

        Matcher matcher = pattern.matcher(source);
        System.out.println(matcher.matches());

        System.out.println(matcher.find());

        while (matcher.find()) {
            System.out.printf("Результат работы метода start - %d, end - %d\n", matcher.start(), matcher.end());
        }
    }
}
