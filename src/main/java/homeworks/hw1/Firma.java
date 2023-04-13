package homeworks.hw1;

/*
Создать три класса:
а) Фирма (с полем Название).
б) Отдел (с полями Название, Количество сотрудников, Фирма)
в) Сотрудник (с полями ФИО, Должность, Оклад, Отдел).
В этом пункте Вам необходимо придумать логичные и правильные
(с точки зрения именования классов и переменных в Java) названия классов, всех полей.
Подберите правильные, на Ваш взгляд, типы данных. Расставьте нужные модификаторы доступа.
Создайте сеттеры и геттеры, конструкторы.
 */

public class Firma {
    private String firmaName;

    public Firma(String firmaName){
        this.firmaName = firmaName;
    }

    public Firma() {
    }

    public String getFirmaName() {
        return firmaName;
    }

    public void setFirmaName(String firmaName) {
        this.firmaName = firmaName;
    }
}
