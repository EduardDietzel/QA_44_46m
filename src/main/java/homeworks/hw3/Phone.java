package homeworks.hw3;

//Создайте класс Phone, который содержит переменные number, model и weight.
//Создайте три экземпляра этого класса.
//Выведите на консоль значения их переменных.
//Добавить в класс Phone методы: receiveCall, имеет один параметр – имя звонящего.
//Выводит на консоль сообщение “Звонит {name}”. Метод getNumber – возвращает номер телефона.
//Вызвать эти методы для каждого из объектов.

public class Phone {

    private String number;
    private String model;
    private int weight;

    public Phone(String number, String model, int weight) {
        this.number = number;
        this.model = model;
        this.weight = weight;
    }

    public String getNumber() {
        return number;
    }

    public void receiveCall(String name){
        System.out.println("Звонит " + name);
    }

    public static void main(String[] args) {

        Phone phone1 = new Phone("+9877367565", "Motorola", 120);
        Phone phone2 = new Phone("+65764677575", "Samsung", 110);
        Phone phone3 = new Phone("+8957678378", "Nokia", 100);

        System.out.println("Phone 1: " + phone1.number + ", " + phone1.model + ", " + phone1.weight + "gr.");
        System.out.println("Phone 2: " + phone2.number + ", " + phone2.model + ", " + phone2.weight + "gr.");
        System.out.println("Phone 3: " + phone3.number + ", " + phone3.model + ", " + phone3.weight + "gr.");

        System.out.println();
        System.out.println(phone1.getNumber());
        System.out.println(phone2.getNumber());
        System.out.println(phone3.getNumber());

        System.out.println();
        phone1.receiveCall("John");
        phone2.receiveCall("Smitt");
        phone3.receiveCall("Eugen");
    }

}
