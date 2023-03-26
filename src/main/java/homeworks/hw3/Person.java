package homeworks.hw3;

public class Person {

    private static String fullName;
    private static int age;

    public Person() {
    }

    public Person(String fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }

    public void move() {
        System.out.println("Person can moving");
    }

    public void talk() {
        System.out.println("Person can talking");
    }



    public static void main(String[] args) {

        Person person1 = new Person();
        Person person2 = new Person("Eduard", 50);

        person1.move();
        person1.talk();

        System.out.println("Person:");
        System.out.println("Name:" + fullName);
        System.out.println("Age:" + age);
    }


}
