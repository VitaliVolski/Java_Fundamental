package Main_task;

public class ReverseCommandLineArguments {
    public static void main (String [] args){

        System.out.println("Reverse arguments :");
        for( int i = args.length - 1 ; i >= 0 ; i--)
            System.out.println(args[i]);
    }
}
