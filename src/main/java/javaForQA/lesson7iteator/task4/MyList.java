package javaForQA.lesson7iteator.task4;

public class MyList {
    private String[] elements = new String[20];
    private int size = 0;

    public void add(String value) {
        elements[size++] = value;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
//        if (size == 0) {
//            return true;
//        }
//        else { return false; }
        return size == 0;
    }

    public MyIterator iterator() {
        return new MyIterator();
    }

    public class MyIterator{

        private int cursor = 0;

        public boolean hasNext() {
            return cursor < size;
        }

        public String next(){
            return elements[cursor++];
        }
    }
}
