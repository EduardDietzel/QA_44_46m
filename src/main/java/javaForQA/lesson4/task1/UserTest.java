package javaForQA.lesson4.task1;

public class UserTest {
    public static void main(String[] args) {

        User user1 = new User();
        User user2 = user1;
        // так мы по сути создадим один объект и даем ссылки на него двум переменным

//        User user1 = new User();
//        User user2 = new User();
//        так мы создадим два разных объекта

        System.out.println(user1.getName());
        System.out.println(user2.getName());

        user2.setName("Jack");
        System.out.println();
        System.out.println(user1.getName());
        System.out.println(user2.getName());

    }
}
