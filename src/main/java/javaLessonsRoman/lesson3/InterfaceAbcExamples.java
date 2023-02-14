package javaLessonsRoman.lesson3;

public class InterfaceAbcExamples {
    public static void main(String[] args) {
        Calculator calculator = new Calculator(10,20);
        System.out.println(calculator.sum());
    }
}

class Calculator extends AbsCalculator {

    Calculator(int a, int b) {
        super(a, b);
    }

    // если мы захотим переопределить метод из родительского класса, то следующие дочерние классы наследуют уже новый класс отсюда, например
//    @Override
//    int sum(int a, int b) {
//        return a + b + 1;
//    }

    @Override
    int mult() { return getA() * getB(); }

    @Override
    int subt() { return getA() - getB(); }

    @Override
    int div() { return getA() / getB(); }
}
abstract class AbsCalculator {

    private final int a;
    private final int b;

    AbsCalculator(int a, int b) {
        this.a = a;
        this.b = b;
    }

    int sum(){ return a + b; }
//    abstract int mult(int a, int b);
//    abstract int subt(int a, int b);
//    abstract int div(int a, int b);

    abstract int mult();
    abstract int subt();
    abstract int div();

    public int getA() { return a; }
    public int getB() { return b; }

}