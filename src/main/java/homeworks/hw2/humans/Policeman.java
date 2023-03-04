package homeworks.hw2.humans;

public class Policeman extends Worker {

    public Policeman(){

    }
    @Override
    public void work() {
        System.out.println("Полицейский охраняет правопорядок");
    }

    public void work(String name) {
        System.out.println("Полицейский " + name + " охраняет правопорядок");
    }
}
