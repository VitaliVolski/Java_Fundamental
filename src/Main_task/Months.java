package Main_task;

import java.time.Month;
import java.util.Scanner;

public class Months {

    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        int number;
        System.out.println("Enter month number:");
        number = num.nextInt();

        while (number < 1 || number > 12) {
            System.out.println("Enter valid month number!");
            number = num.nextInt();
        }
        System.out.println(Month.of(number) + "!");
    }
}

