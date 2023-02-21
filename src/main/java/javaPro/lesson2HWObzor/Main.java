package javaPro.lesson2HWObzor;

public class Main {
    public static void main(String[] args) {
        Company apple = new Company("Apple");
        Department security = new Department("Security", apple);
        Department economy = new Department("Economy", apple);
        Employee john = new Employee("John", security);
        apple.setCompanyName("Apple inc");

        System.out.println(john.getDepartment().getCompany().getCompanyName());

        Department develop = new Department("Develop", new Company("IBM"));
        // тут мы создали новый отдел, но в новой компании, которую мы не будем использовать больше как объект

    }
}
// TODO: 17/02/2023 динамическая диспечиризация методов (полиморфизм - многообразие форм) перегрузка, переопределение методов
