package javaForQA.lesson1;

import org.example2.D;

public class Main {
    public static void main(String[] args) {

        int i;
        Dog dog;
        System.out.println();
        System.out.println("До создания объекта");
        dog = new Dog();
        System.out.println("После создания объекта");

        Dog dog1 = new Dog();

        Dog dog2 = new Dog("Barbos", 3, "pudel", "black");

        Dog sharik = new Dog("Sharik");

        Dog dog3 = new Dog(3);

        Dog dog4 = new Dog(7, "Black");

//        System.out.println(dog2.name);
//        System.out.println(dog4.age);
//        System.out.println(sharik.name);

        sharik.bark();
        dog2.bark();
        dog.bark();
        // Здесь мы вызвали метод, где Шарик лает. Мы можем вызвать этот метод с любым объектом.

        System.out.println(dog2.getName());
        System.out.println(sharik.getName());

        sharik.setAge(-7);
        System.out.println(sharik.getAge());

        System.out.println(dog2.getName() + " " + dog2.getAge());

        System.out.println("Имя: " + dog2.getName() + ", возраст: " + dog2.getAge() + ", порода: " + dog2.getBreed() + ", цвет: " + dog2.getColor());
    }
}

// " " - пустая строка
// null - вообще отсутствуют какие-либо данные
// 0 - ноль

// Если в классе создается объект другого класса из этого же пакета, это делается без импорта.
// Если используется объект другого класса из другого пакета, то используется импорт (автоматически Джава делает это)
