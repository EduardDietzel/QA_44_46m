package javaForQA.lesson3_Enum;

public enum Day {

    // все константы п умолчанию public static final
    // помимо самих значений константы могут содержать еще какие-то значения
    SUNDAY("Воскресенье"),
    MONDAY("Понедельник"),
    TUESDAY("Вторник"),
    WEDNESDAY("Среда"),
    THURSDAY("Четверг"),
    FRIDAY("Пятница"),
    SATURDAY("Суббота");

    private String value;

    private Day(String value) {
        this.value = value;
        // System.out.println("Отработал конструктор с параметром " + value);
    }

    // Джава-машина создает все перечисленные объекты
    Day() {
        // System.out.println("Отработал пустой конструктор Day");
    }

    public String getValue() {
        return value;
    }
}
