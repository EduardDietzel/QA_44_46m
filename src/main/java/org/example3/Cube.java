package org.example3;

public class Cube extends  DrawObj {

    private static final double PI_QWERTY = 3.14; // в константе используются большие буквы и _ между слов
    // final используется для определения переменной, которую нельзя изменить
    // можно финализировать класс. Тогда от него нельзя наследоваться
    // можно финализировать метод. Тогда его невозможно будет переопределить
    @Override
    public void draw() {

        System.out.println("drawing cube");
    }
}
