//Question 8
//Write a Java program that takes a year from the user and prints whether that year is a leap year or
//not.
package task_3;
import java.util.Scanner;
public class T3_8eight {
	public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the year: ");
        int year = in.nextInt();

        boolean a = (year % 4) == 0;
        boolean b = (year % 100) != 0;
        boolean c = ((year % 100 == 0) && (year % 400 == 0));

        if (a && (b || c))
        {
            System.out.println(year + " is a leap year");
        }
        else
        {
            System.out.println(year + " is not a leap year");
        }
    }
}

