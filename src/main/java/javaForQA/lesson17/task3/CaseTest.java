package javaForQA.lesson17.task3;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CaseTest {

    public static void main(String[] args) {

        String source = "Apple Banana Orange";
//        String regEx = "a|b";
        String regEx = "[ab]";
        Pattern pattern = Pattern.compile(regEx, Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(source);

        while (matcher.find()) {
            System.out.println(matcher.start());
        }
    }
}
