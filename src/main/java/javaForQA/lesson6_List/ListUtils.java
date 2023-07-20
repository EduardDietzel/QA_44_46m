package javaForQA.lesson6_List;

import java.util.ArrayList;
import java.util.List;

// Объединить два списка (Листа) в один список (Лист)
public class ListUtils {
    //
    public static List<String> joinLists(List<String> first, List<String> second) {
        List<String> result = new ArrayList<>();

        result.addAll(first);
        result.addAll(second);

        return result;
    }

    public static List<String> joinWithoutDuplicates(List<String> first, List<String> second){
        // A B C D E
        // D E F G
        // A B C D E F G
        List<String> result = new ArrayList<>();
        result.addAll(first);
        for (String current : second) {
            if (!result.contains(current)) {
                result.add(current);
            }
        }
        return result;
    }

    public static List<String> difference(List<String> first, List<String> second){
        // A B C D E
        // D E F G
        // A B C F G
        List<String> result = new ArrayList<>();

//        result.addAll(first);
//        // делаем цикл, где при проверке второго списка удаляем элементы, которые одинаковые
//        for (String current : second) {
//            if (result.contains(current)) {
//                result.remove(current);
//            } else {
//                result.add(current);
//            }
//        }

        // надо добавить элементы так, чтобы они не дублировались
        for (String current : first) {
            if (!second.contains(current)){
                result.add(current);
            }
        }
        for (String current : second) {
            if (!first.contains(current)){
                result.add(current);
            }
        }
        return result;
    }
}
