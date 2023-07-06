package javaForQA.lesson18.task6;

import java.util.List;

public class NumberUtils {

    public void printIntegers(List list){
        for (Object current : list) {
            System.out.println(((Number) current).intValue());
        }
    }
}
