package Main_task;


public class SumCompositionNumbers {

    public static void main(String[] args) {

        int sum = 0;
        int composition = 1;

        for (int i = 0; i < args.length; i++) {

            sum = sum + Integer.parseInt(args[i]);
            composition = composition * Integer.parseInt(args[i]);
        }

        System.out.println("sum is - " + sum);
        System.out.println("composition is - " + composition);
    }
}
