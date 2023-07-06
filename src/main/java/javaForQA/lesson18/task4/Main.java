package javaForQA.lesson18.task4;

public class Main {
    public static void main(String[] args) {

        Pair<Integer, String> pair1 = new Pair<>(5, "Hallo");
        Pair<Double, Double> pair2 = new Pair<>(6.12, 7.0);

        System.out.println(pair1.getSecond());
        System.out.println(pair2.getFirst());
    }
}
