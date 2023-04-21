package javaForQA.lesson7iteator.task4;

public class MyListTest {
    public static void main(String[] args) {

        MyList list = new MyList();
        System.out.println(list.isEmpty());
        System.out.println();
        list.add("Hello");
        list.add("World");
        list.add("jhgjgh");

        System.out.println(list.isEmpty());

        System.out.println(list.size());

        MyList.MyIterator iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
