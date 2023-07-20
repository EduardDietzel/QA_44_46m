package javaForQA.lesson17.task1;

import java.util.regex.Pattern;

public class PatternTest {

    public static void main(String[] args) {

//        String address = "http://www.example.com";
//        checkAddress(address);
//
//        checkAddress("http://www.example.com");
//        checkAddress("http://example.com");
//        checkAddress("http://ww.example.com");
//        checkAddress("www.example.com");
//        checkAddress("http://www");
//        checkAddress("www");
//        checkAddress("fwww");
//        checkAddress("fwwwg");
//        checkAddress("wwwg");

        checkAddress("http://www.A");
        checkAddress("http://www.B");
        checkAddress("http://www.C");
        checkAddress("http://www.D");
        checkAddress("http://www.AA");
        checkAddress("http://www.ABC");
        checkAddress("http://www.CCABCA");
        checkAddress("http://www.CCABCAf");
        checkAddress("http://www.CCAB6CAf");
        checkAddress("http://www.CCAB%CAf");
        checkAddress("http://www.345");
    }

    public static void checkAddress(String address) {
//        String regEx = ".*www.*";
//        String regEx = ".+www.+";
//        String regEx = ".?www.?";
//        String regEx = ".{5,7}www.{9,}";
//        String regEx = ".*www\\.[A-Za-z]*";
        String regEx = ".*www\\.[^2-7B-Xf-y]*";
        Pattern pattern = Pattern.compile(regEx);
        boolean result = pattern.matcher(address).matches();
        System.out.println(address + " " + result);
    }
}
