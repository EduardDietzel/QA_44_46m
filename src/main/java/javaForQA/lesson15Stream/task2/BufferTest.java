package javaForQA.lesson15Stream.task2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferTest {
    public static void main(String[] args) throws IOException {

        InputStreamReader reader = new InputStreamReader(System.in);
        BufferedReader bufferedReader = new BufferedReader(reader);

        int data = Integer.parseInt(bufferedReader.readLine());

        System.out.println(data);

    }
}
