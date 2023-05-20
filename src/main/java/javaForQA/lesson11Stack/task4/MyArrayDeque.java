package javaForQA.lesson11Stack.task4;

public class MyArrayDeque implements MyDeque{

    private String[] elements = new String[20];
    private int headIndex;
    private int tailIndex;
    private int size;

    @Override
    public void addToHead(String element) {

    }

    @Override
    public void addToTail(String element) {

    }

    @Override
    public String removeHead() {
        return null;
    }

    @Override
    public String removeTail() {
        return null;
    }

    @Override
    public String peekHead() {
        return null;
    }

    @Override
    public String peekTail() {
        return null;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public String getByIndex(int index) {
        return null;
    }

    @Override
    public boolean contains(String element) {
        return false;
    }

    @Override
    public int size() {
        return 0;
    }

    private void grow() {

    }

    private int calculateNewCapacity(int currentCapacity) {
        return 0;
    }

    private int calculateAdditionalCapacity(int currentCapacity) {
        return 0;
    }

    @Override
    public String toString() {
        // Hello World I study Java -> [Hello, World, I, study, Java]
        return null;
    }
}
