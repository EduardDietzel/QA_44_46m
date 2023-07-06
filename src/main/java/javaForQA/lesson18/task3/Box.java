package javaForQA.lesson18.task3;

import java.util.ArrayList;
import java.util.List;

public class Box<T> {
    // Box<T> - можно указать любую заглавную латинскую букву. Это Дженерик. Типизация класса.

    List<T> items = new ArrayList<>();

    public void putItem(T item){
        items.add(item);
    }

    public T getItem(){
        return items.remove(0);
    }
}
