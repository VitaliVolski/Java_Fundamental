package Optional_task_1;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;


public class IncreaseDecreaseNumbersByLength {

    public static void main(String[] args) {

        System.out.println("Enter numbers using space");
        Scanner scanner = new Scanner(System.in);
        String numbers = scanner.nextLine();
        System.out.println("Input numbers: " + numbers);

        String[] numberToSort = numbers.split(" ");
        for (int i = numberToSort.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (numberToSort[j].length() > numberToSort[j + 1].length()) {
                    String temp = numberToSort[j];
                    numberToSort[j] = numberToSort[j + 1];
                    numberToSort[j + 1] = temp;
                }
            }
        }
        System.out.print("Increase length numbers:" + Arrays.toString(numberToSort));

        for (int i = numberToSort.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++)
                if (numberToSort[j].length() < numberToSort[j + 1].length()) {
                    String temp = numberToSort[j];
                    numberToSort[j] = numberToSort[j + 1];
                    numberToSort[j + 1] = temp;
                }
        }
        System.out.print("; Decrease length numbers:" + Arrays.toString(numberToSort));
    }
}

