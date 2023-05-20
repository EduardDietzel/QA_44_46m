package javaForQA.lesson11Stack.task1;

import java.util.Stack;

public class StackTest {
    public static void main(String[] args) {

        // stack класс, в котором элементы добавляются и удаляются по принципу "последний пришел - первый вышел"

        Stack<String> stack = new Stack<>();

        // System.out.println(stack.pop());
        // будет выдана ошибка, так как Стэк еще пустой. То же самое будет и с методом пиик
        // System.out.println(stack.peek());

        // добавляем элементы в Стэк
        stack.push("Hello");
        stack.push("World");
        stack.push("I");
        stack.push("study");
        stack.push("Java");

        System.out.println(stack);

        // достанем элемент из Стэка методом pop.
        // будет вытащен последний элемент и возвращен
        // System.out.println(stack.pop());

        // вынесем последний элемент в переменную (с вершины Стэка)
        String element = stack.pop();
        System.out.println(element);

        System.out.println(stack);

        element = stack.peek();
        // метод peek выдает нам последний элемент (первый на выход), но не удаляет его из Листа
        System.out.println("Peek:");
        System.out.println(element);
        System.out.println(stack);

        // выведем результат работы метода empty
        System.out.println("Empty: " + stack.empty());

        // метод get выдает нам элемент по индексу и не удаляет его из Листа
        System.out.println("Get: " + stack.get(1));
        System.out.println(stack);

        System.out.println("Search: " + stack.search("Java"));
        System.out.println("Search: " + stack.search("study"));
        System.out.println("Search: " + stack.search("I"));

        // метод search ищет элементы с конца списка (с вершины), начиная с номера1

    }
}
