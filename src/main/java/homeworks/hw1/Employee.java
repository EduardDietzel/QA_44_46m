package homeworks.hw1;

import javaPro.lesson2HWObzor.Department;

/*
Сотрудник (с полями ФИО, Должность, Оклад, Отдел).
Предположим, что все сотрудники делятся на два типа: Штатный сотрудник и Сотрудник по контракту.
Реализовать этот пункт с помощью наследования.
 */
public class Employee extends Department1 {
    private String fullName;
    private String position;
    private int salary;
    private Department1 department;

    public Employee(String fullName, String position, int salary, Department1 department) {
        this.fullName = fullName;
        this.position = position;
        this.salary = salary;
        this.department = department;
    }

    public Department1 getDepartment1() {
        return department;
    }

    public void setDepartment1(Department1 department) {
        this.department = department;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
