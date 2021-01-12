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

        String minLength = numbers;
        String maxLength = "";

        for (String temp : numbers.split(" ")){
            if (temp.length () < minLength.length())
                minLength = temp;
            if (temp.length() > maxLength.length())
                maxLength = temp;
        }
        System.out.println("Number with minimum size: " + minLength
                + "; It's length = " + minLength.length());
        System.out.println("Number with maximum size: " + maxLength
                + "; It's length = " + maxLength.length());
    }
}

