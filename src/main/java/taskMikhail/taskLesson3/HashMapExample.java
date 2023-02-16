package taskMikhail.taskLesson3;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {
    public static void main(String[] args) {

        Map<Integer, String> map = new HashMap<>();

        map.put(1, "Juri");
        map.put(2, "Anita");
        map.put(3, "Eduard");
        map.put(4, "Stepan");
        map.put(5, "Karina");
        map.put(6, "Irina");
        System.out.println(map.hashCode());

    }
}
// TODO: 16/02/2023 Collection
