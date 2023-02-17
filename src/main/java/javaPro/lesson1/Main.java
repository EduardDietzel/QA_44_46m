package javaPro.lesson1;

public class Main {
    public static void main(String[] args) {
        Box b0 = new Box(3.5);

        Box b1 = new Box(1.2, 2.3, 4.7);
        System.out.println(b1);
//        b1.print();
        b1.setWidth(1.5);
        System.out.println(b1);

        Box b2 = new Box(8, 9, 5);
        System.out.println(b2);
        b2.setHeight(10);
        System.out.println(b2);

        // только оператор new создает объект и выделяет под него память!

        Box b3 = b1;
        System.out.println(b3);

//        A a = new A();
//        a.i = 12;
//        System.out.println(a.i);
//
//        B b = new B();
//        b.i = 10;
//        b.j = 20;

        C c = new C();

        A a = new C();
        B b = new C();

    }
}
