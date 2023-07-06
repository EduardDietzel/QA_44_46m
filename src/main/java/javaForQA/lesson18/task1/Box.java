package javaForQA.lesson18.task1;


import java.util.ArrayList;
import java.util.List;

public class Box {

    private List list = new ArrayList();

    public void putItem(Object item){
        list.add(item);
    }

    public Object getItem(){
        return list.remove(0);
    }
}
