package homeworks.hw2.humans;

public class Fireman extends Worker {

    public String name;
    public Fireman (String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Fireman(){

    }
    @Override
    public void work() {
        System.out.println("Пожарный тушит пожары");
    }

    public void work(String name) {
        System.out.println("Пожарный " + name + " тушит пожары");
    }
}
