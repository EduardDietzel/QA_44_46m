package homeworks.hw2.humans;

public class Doctor extends Worker {

    public Doctor(){

    }
    @Override
    public void work() {
        System.out.println("Доктор лечит людей");
    }

    public void work(String name) {
        System.out.println("Доктор " + name + " лечит людей");
    }
}
