package javaForQA.lesson14_PracticFunc.task5;

import java.util.HashSet;
import java.util.Set;
import java.util.function.Function;

public class IdentityMethodTest {
    public static void main(String[] args) {

        String[] array = {"AAA", "BBB", "CCC", "BBB"};
        Set<String> set = getSetFromArray(array, x -> x + x); // функция берет параметр х и складывает его с самим же собой
        System.out.println(set);

        Set<String> set1 = getSetFromArray(array, x -> "Hello " + x);
        System.out.println(set1);

        Set<String> set2 = getSetFromArray(array, Function.identity());
        System.out.println(set2);
    }

    public static Set<String> getSetFromArray(String[] source, Function<String, String> function){
        Set<String> result = new HashSet<>();

        for (String word : source) {
            String processedWord = function.apply(word);
            result.add(processedWord);
        }
        return result;
    }
}
