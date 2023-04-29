package javaForQA.lesson8linkedlist;

import javax.swing.text.html.HTMLDocument;
import java.util.Iterator;

public class MyLinkedList implements Iterable<String>{
    // делаем односвязный список, где связь есть только на последующий элемент, без предыдущего
    // элементы добавляются только впереди списка
    private int size = 0; // начальный размер листа
    private Node head; // Нод - голова

    public void add(String value){
        // начинаем добавлять элементы в лист
        if (size == 0) {
            head = new Node(value, null);
        } else {
            Node newNode = new Node(value, head);
            head = newNode;
        }
        size++;  // увеличиваем размер листа
    }

    public int size() {
        return size;
    }

    public void add(int index, String value) {
        // отдаем индекс и значение
        if (index < 0 || index >= size) {
            return;
        }
        if (index == 0) {
            add(value);
            return;
        }
        Node current = head;
        Node previous = null;
        int counter = 0;
        while (counter < index){
            previous = current;
            current = current.getNext();
            counter++;
        }
        Node newNode = new Node(value, current);
        previous.setNext(newNode);
        size++;
    }

    public void addToTail(String value){
        // добавляем элементы в конец списка
        // current - это текущий
        Node current = head;
        while (current.getNext() != null) {
            current = current.getNext();
        }
        Node newNode = new Node(value, null);
        current.setNext(newNode);
        size++;
    }

    @Override
    public String toString() {
        // [java, world, hello]
        StringBuilder result = new StringBuilder("[");
        Node current = head;
        while (current != null) {
            result.append(current.getValue()).append(", ");
            current = current.getNext();
        }
        result.setLength(result.length() - 2);
        result.append("]");
        return result.toString();
    }

    public MyIterator iterator() {
        return new MyIterator();
    }
    // добавляем итератор
    public class MyIterator implements Iterator {

        // делаем счетчик итератора
        private int index;
        private Node current = head;

        @Override
        public boolean hasNext() {
//            if (current == null) {
//                return false;
//            } else {
//                return true;
//            }
            // то же самое только другим способом - короче:
            return current != null;
        }

        @Override
        public Object next() {
            String value = current.getValue();
            current = current.getNext();
            return value;
        }
    }

    // надо создать внутри класса еще один класс, класс узла (Нода)
    private class Node{

        private String value;
        private Node next;

        public Node(String value, Node next) {
            this.value = value;
            this.next = next;
        }

        public String getValue() {
            return value;
        }

        public void setValue(String value) {
            this.value = value;
        }

        public Node getNext() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }
    }
}
