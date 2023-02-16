package javaLessonsRoman.lesson4enum;

import java.util.Objects;

public enum EnumExamplesMain {
    MO,
    TU, WE,
    TH, FR,
    SA, SU;

    public static void main(String[] args) {
        EnumExamplesMain d = EnumExamplesMain.SU;
        System.out.println(d);



    }

}