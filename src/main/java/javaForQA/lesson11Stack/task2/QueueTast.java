package javaForQA.lesson11Stack.task2;

import java.util.Queue;
import java.util.concurrent.PriorityBlockingQueue;

public class QueueTast {
    public static void main(String[] args) {

        // Queue - очередь. Это интерфейс, который работает по принципу "первый зашел - первый и вышел"
        Queue<Integer> queue = new PriorityBlockingQueue<>();

        queue.add(10);
        queue.add(20);
        queue.add(30);
        queue.add(40);
        queue.add(50);

        System.out.println("Queue: " + queue);

        // // метод peek выдает нам первый элемент (первый зашел, в начале очереди), но не удаляет его из Очереди
        Integer element = queue.peek();
        System.out.println("Peek: " + element);
        System.out.println("Queue: " + queue);

        // метод poll вернул нам элемент, который был в начале очереди, и удаляет его из очереди
        element = queue.poll();
        System.out.println("Poll: " + element);
        System.out.println("Queue: " + queue);

        // метод size выдает размер очереди, количество элементов
        System.out.println("Size: " + queue.size());

    }
}
