package javaForQA.lesson4.task2;

public class Main {

    public static void main(String[] args) {

        int test = 7;
        Person testPerson = new Person(7);

        System.out.println("До вызова методов:");
        System.out.println("Переменная: " + test);
        System.out.println("Возраст: " + testPerson.getAge());

        changeInt(test);
        changePerson(testPerson);

        System.out.println("После вызова методов:");
        System.out.println("Переменная: " + test);
        System.out.println("Возраст: " + testPerson.getAge());

//        Person person = new Person(3);
//        System.out.println(person.getAge());
//        person.test();
//        System.out.println(person.getAge());
//
//        person.setAge(8);
//        System.out.println(person.getAge());
    }

    public static void changePerson(Person person) {
        person.setAge(person.getAge() + 1);
    }

    public static void changeInt(int i) {
        i++;
    }
}
