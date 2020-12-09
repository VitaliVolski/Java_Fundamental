package Main_task;

import java.util.Arrays;
import java.util.Random;


public class RandomListNumbers {

    public static void main(String[] args) {

        Random random = new Random();
        int[] array = new int[5];

        System.out.println("Numbers with a new line");
        for (int i = 0; i < array.length; i++) {
            array [i] = random.nextInt(10);
            System.out.println(array [i]);}

        System.out.println("Numbers in line");
        for (int i = 0; i < array.length; i++) {
            array [i] = random.nextInt(10);
            System.out.print(array [i] + "  ");
        }
    }
}