//Question 6
//
//Input first number: 1524
//Input second number: 2345
//Input third number: 3321
//6. Write a program that accepts three numbers from the user and prints "INCREASING" if the numbers
//are in increasing order, "DECREASING" if the numbers are in decreasing order, and "Neither increasing
//nor decreasing order" otherwise.



package task_3;
import java.util.Scanner;
public class T3_6six {

	public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter first number: ");
        double a = in.nextDouble();
        System.out.print("Enter second number: ");
        double b = in.nextDouble();
       System.out.print("Enter third number: ");
        double c = in.nextDouble();
        if (a < b && b < c)
        {
            System.out.println("Increasing order");
        }
        else if (a > b && b > c)
        {
            System.out.println("Decreasing order");
        }
        else
        {
            System.out.println("Neither increasing or decreasing order");
        }
    }
}
