package javaForQA.lesson10_Coparing.task1;

public class PrimitiveComparing {
    public static void main(String[] args) {

        int num1 = 675;
        int num2 = 87;
        boolean result = num1 == num2;
        System.out.println("Result: " + result);

        int num3 = 23;
        Integer num4 = 23;
        boolean result1 = num3 == num4;
        System.out.println("Result: " + result1);

        Integer num5 = new Integer(54);
        Integer num6 = new Integer(54);
        // boolean result2 = num5 == num6; // в этом случае будет false, так как это два разных объекта
        boolean result2 = num5.equals(num6); // в этом случае будет true, так как сравнивается значения объектов
        System.out.println("Result: " + result2);

    }
}
