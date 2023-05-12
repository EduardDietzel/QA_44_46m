package javaForQA.lesson10_Coparing.task2;

import java.util.Objects;

public class Cat implements Comparable<Cat>{
    private String name;
    private int age;
    private double weight;

    public Cat(String name, int age, double weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    public Cat(int age, double weight) {
        this.age = age;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getWeight() {
        return weight;
    }

    @Override
    public boolean equals(Object obj) {

        if (this == obj) {
            return true;
        }
        if (obj == null){
            return false;
        }
        // проверяем сравнение классов объектов
        if (obj.getClass() != this.getClass()) {
            return false;
        }

        Cat cat = (Cat) obj;
        // this (кот, у которого вызван метод, текущий объект - "boolean result = cat1.equals(cat2);" - это cat1)
        // cat - тот кот, которого мы передали в метод для сравнения с текущим котом

        // return this.age == cat.age && this.weight == cat.weight && this.name == cat.name;
        return this.age == cat.age && this.weight == cat.weight && Objects.equals(name, cat.name);
    }

    // @Override hashCode всегда делаем вместе с equals
    @Override
    public int hashCode() {
        return Objects.hash(name, age, weight);
    }

    // метод toString() нужен для наглядной визуализации вывода данных в консоль
    @Override
    public String toString() {
        return String.format("Кот: имя - %s, возраст - %d, вес - %.2f", name, age, weight);
    }

    @Override
    public int compareTo(Cat cat) {
        // this (кот, у которого вызван метод, текущий объект - "boolean result = cat1.equals(cat2);" - это cat1)
        // cat - тот кот, которого мы передали в метод для сравнения с текущим котом
        // записываем сортировку по умолчанию
        return Double.compare(cat.weight, weight);
    }
}
