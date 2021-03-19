//Question 9
//
//Write a program in Java to display the pattern like a right angle triangle with a number.
//Test Data
//Input number of rows : 3
//Expected Output :
//1 
//12 
//123

package task_3;
import java.util.Scanner;
public class T3_9nine {

	public static void main(String[] args)

	{
	   int a;
	   int b;
	   int n;
	   System.out.print("Enter the number of rows : ");
	   Scanner in = new Scanner(System.in);
	   n = in.nextInt();

	   for(a=1;a<=n;a++)
	   {
		for(b=1;b<=a;b++)
		  System.out.print(b);

	    System.out.println("");
	    }
	}
	}
