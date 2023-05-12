package javaForQA.lesson9_Set.task6;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class ArrayToSet {
    public static void main(String[] args) {

        Integer[] array = {1, 5, 8, 7, 2, 9, 2, 1, 5};
        // Integer[] array = {1, 5, 8, 7, 2, 9};

        Set<Integer> integerSet1 = new HashSet<>();

        for (Integer integer : array) {
            integerSet1.add(integer);
        }

        System.out.println("Array: " + Arrays.toString(array));
        System.out.println("Set 1: " + integerSet1);

        // другой способ, короче, чем первый, но забирает больше памяти
        Set<Integer> integerSet2 = new HashSet<>(Arrays.asList(array));
        System.out.println("Set 2: " + integerSet2);

        // рассмотрим 3-й способ
        Set<Integer> integerSet3 = new HashSet<>();
        Collections.addAll(integerSet3, array);
        System.out.println("Set 3: " + integerSet3);

        Set<Integer> integerSet4 = Arrays.stream(array).collect(Collectors.toSet());
        System.out.println("Set 4: " + integerSet4);

        // этот способ сработает, если в списке нет дубликатов
        Set<Integer> integerSet5 = new HashSet<>(Set.of(array));
        System.out.println("Set 5: " + integerSet5);

    }
}
