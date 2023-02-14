package javaLessonsRoman.lesson3;

public class PolymorphismExamples {
    public static void main(String[] args) {
//        CalculatorParent calculatorParent = new CalculatorParent();

//        System.out.println(calculatorParent.sum(1.5,2));          // посмотреть переменные в скобках: Ctrl+p
//        System.out.println(calculatorParent.sum(3.14, 2.7));

        Person person = new Person();
        person.setAllVariables("Bob", "Marley");

        CalculatorParent calculatorParent = new CalculatorParent();
        System.out.println(calculatorParent.sum(10,20));

        CalculatorChild calculatorChild = new CalculatorChild();
        System.out.println(calculatorChild.sum(10,20));
        // получим результат, определенный в дочернем классе

    }
}

class CalculatorChild extends CalculatorParent {

    @Override
    int sum(int a, int b) { return a + b + 100; }
}

class CalculatorParent {
    int sum(int a, int b) { return a + b; }
    double sum(double a, double b) { return a + b; }
    double sum(int a) { return a + 5.14; }
}

class Person {
    private String name, surname;

    void setAllVariables(String name, String surname) {
        this.name = name;
        this.surname = surname;

        System.out.println("name: " + name + ", surname: " + surname);
    }
}