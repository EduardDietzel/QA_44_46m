package homeworks.hw1;

public class Main {
    public static void main(String[] args) {

        Firma firma = new Firma("Firma");
        Department1 sales = new Department1("Sales", 3, firma);
        Department1 purchase = new Department1("Purchase", 2, firma);


    }
}
