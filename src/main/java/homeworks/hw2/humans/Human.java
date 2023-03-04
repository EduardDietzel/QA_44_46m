package homeworks.hw2.humans;

public abstract class Human {

    public boolean canWork;

    public Human() {
        canWork = true;
    }

    public String name = "Человек";

    public void printInfo() {
        System.out.println("Это " + name);
    }

    public String getName() {
        return name;
    }

    public abstract void work();

}
