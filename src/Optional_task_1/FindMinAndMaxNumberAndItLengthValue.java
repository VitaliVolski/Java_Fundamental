package Optional_task_1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class FindMinAndMaxNumberAndItLengthValue {

    public static void main(String[] args) {

        System.out.println("Enter numbers using space");
        Scanner scanner = new Scanner(System.in);
        String numbers = scanner.nextLine();
        System.out.println("Input numbers: " + numbers);

        String shortNumber = numbers;
        String longNumber = "";

        for (String number : numbers.split(" ")){
            if (number.length () < shortNumber.length())
                shortNumber = number;
            if (number.length() > longNumber.length())
                longNumber = number;
        }
        System.out.println("Number with minimum size: " + shortNumber
                + "; It's length = " + shortNumber.length());
        System.out.println("Number with maximum size: " + longNumber
                + "; It's length = " + longNumber.length());
    }
}

