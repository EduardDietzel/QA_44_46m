package org.example3;

public class Main {
    public static void main(String[] args) {
//        Cube c1 = new Cube();
//        Cube c2 = new Cube();
//        Cube c3 = new Cube();
//
//        c1.draw();
//        c2.draw();
//        c3.draw();

//        Cube[] cubes = {new Cube(), new Cube(), new Cube()};
//        for (int i = 0; i < cubes.length; i++) {
//            cubes[i].draw();
//        }
//        Sphere[] spheres = {new Sphere(), new Sphere()};
//        for (int i = 0; i < cubes.length; i++) {
//            cubes[i].draw();
//        }

        DrawObj[] objects = {new Sphere(), new Sphere(), new Cube(), new Cube()};
        for (int i = 0; i < objects.length; i++) {
            objects[i].draw();
        }


    }
}
