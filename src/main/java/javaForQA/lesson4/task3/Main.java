package javaForQA.lesson4.task3;

public class Main {
    public static void main(String[] args) {

        boolean b = true;
        char c = 'f';
        byte b1 = 3;
        short s = 5;
        int i = 15;
        long l = 45;
        float f = 12.4f;
        double d = 8.6;

        Boolean bool = false;
        Character character = 'e';
        Byte b2 = 3;
        Short sh = 6;
        Integer integer = 9;
        Long l2 = 67L;
        Float f1 = 4.5f;
        Double d7 = 7.4;

        int[] array = new int[5];
        array[2] = i;

        Number[] numbers = new Number[15];
        numbers[4] = new Integer(7);
        numbers[7] = new Double(4.5);
        // numbers[1] = new Character('e');
        // мы не можем занести такой тип данных в numbers

        for (Number number : numbers) {
            System.out.println(number);
        }
        // после : ставим массив, по которому хотим пройтись
        // до : ставим переменную, в которую по очереди поместим все элементы массива при работе цикла


    }
}
