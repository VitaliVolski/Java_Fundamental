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

        String minNumberSize = numbers;
        String maxNumberSize = "";

        for (String i : numbers.split(" ")){
            if (i.length () < minNumberSize.length())
                minNumberSize = i;
            if (i.length() > maxNumberSize.length())
                maxNumberSize = i;
        }
        System.out.println("Number with minimum size: " + minNumberSize
                + "; It's length = " + minNumberSize.length());
        System.out.println("Number with maximum size: " + maxNumberSize
                + "; It's length = " + maxNumberSize.length());
    }
}

