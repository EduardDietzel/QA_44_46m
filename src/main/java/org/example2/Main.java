package org.example2;

public class Main {
    public static void main(String[] args) {

        A a = new A();
        B b = new B();
        C c = new C();

        a.method();
        b.method();
        c.method();

        A r;       // получить ссылку на объект типа А

        r = a;     // слева и справа совпадают типы объектов. Переменная r ссылается на объект типа А
        r.method();

        r = b;     // нет ошибки, так как объект b класса В, который наследует класс А
        r.method();

        r = c;     // переменная r ссылается на объект типа С, который тоже наследует класс А
        r.method();

        D d = new D();
//        r = d;     // слева и справа объекты разного типа А и Д. Д никак не связаны между собой. Несоответствие типа!!! Нет наследования

        demo(a);
        demo(b);
        demo(c);
        // можем вызывать все методы, так как они все ссылаются на супер-метод А

        int[] array = {1, 2, 3};
//        C[] arrayC = {a, b, c};    // ошибка
        A[] arrayA = {a, b, c};
        for (int i = 0; i < arrayA.length; i++) {
            arrayA[i].method();
        }

    }

    private static void demo(A a){
        a.method();
    }


}
