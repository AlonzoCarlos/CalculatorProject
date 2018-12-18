/*
    This program will ask the user for two numbers.
    Once the two numbers are entered the program
    will then ask the user if they want Add, Subtract
    Multiply or divide.
 */
import java.util.Scanner;

public class Calculator_Skeleton {
    public static void  main(String[] args){
        //Scanner object for the user's numbers
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter your numbers.");

        // Variables used to store users numbers and solution.
        int z;
        double x, y;


        //get users first number
        System.out.print("First Number: ");
        x = input.nextDouble();
        //System.out.print("\n");

        //get users Second number number
        System.out.print("Second Number: ");
        y = input.nextDouble();
        System.out.print("\n");

        System.out.println("Add \t\t 1" + "\n" +
                "Subtract \t 2" + "\n" +
                "Multiply \t 3" + "\n" +
                "Divide   \t 4" + "\n");

        System.out.print("Arithmetic: ");
        z = input.nextInt();
        System.out.print("\n");

        while(z < 1 || z > 4){
            System.out.println("Im sorry that is an invalid option.\n" +
                    "Please choose a valid option.");
            System.out.print("Arithmetic: ");
            z = input.nextInt();
            System.out.print("\n");
        }

        if(z == 1)
            x = x + y;
        else if(z == 2)
            x = x - y;
        else if(z == 3)
            x = x * y;
        else if(z == 4)
            x = x / y;

        System.out.print("Answer: " +x);

    }
}
/*
Creators:
        Sexy Carlos
        Sexy Pablo
        and maybe sexy Jessie xD
 */