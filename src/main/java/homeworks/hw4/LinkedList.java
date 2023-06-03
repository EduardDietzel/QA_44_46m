package homeworks.hw4;

/*
Изменить MyLinkedList на двусвязный список с соответствующей реализацией методов.
Изменить интерфейс MyIterator с Iterator на ListIterator, реализовать
соответствующие методы.
 */
public class LinkedList {

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
