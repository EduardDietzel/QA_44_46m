package homeworks.hw2.humans;

import org.example2.D;

public class Main {
    public static void main(String[] args) {

        Fireman fireman = new Fireman();

        Policeman policeman = new Policeman();

        Doctor doctor = new Doctor();

        fireman.work();
        policeman.work();
        doctor.work();

        Worker worker1 = new Fireman();
        Worker worker2 = new Policeman();
        Worker worker3 = new Doctor();

        worker1.work();
        worker2.work();
        worker3.work();

        fireman.work("John");
        policeman.work("Stiv");
        doctor.work("Mat");

    }
}
