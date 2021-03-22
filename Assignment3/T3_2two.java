//Question 2

//Write a program in which:
//Take 10 values input from the user using a loop.
//A print sum of all the numbers provided
//Print the average of those 10 values

package task_3;
import java.util.*;
public class T3_2two { 
	    public static void main(String args[]) {
	        int a, b,c,d,e,f,g,h,i,j, sum;
	        float avg;

	        Scanner in = new Scanner(System.in);

	        System.out.print("Enter first number : ");
	        a = in.nextInt();

	        System.out.print("Enter second number : ");
	        b = in.nextInt();
	        
	        System.out.print("Enter third number : ");
	        c = in.nextInt();

	        System.out.print("Enter fourth number : ");
	        d = in.nextInt();
	        
	        System.out.print("Enter fifth number : ");
	        e = in.nextInt();

	        System.out.print("Enter sixth number : ");
	        f = in.nextInt();
	        
	        System.out.print("Enter seventh number : ");
	        g = in.nextInt();

	        System.out.print("Enter eighth number : ");
	        h = in.nextInt();

	        System.out.print("Enter ninth number : ");
	        i = in.nextInt();

	        System.out.print("Enter tenth number : ");
	        j = in.nextInt();
	        
	        sum = a + b + c + d + e + f + g + h + i + j;
	        avg = (float)((a + b + c + d + e + f + g + h + i + j) / 10);

	        System.out.print("Sum : " + sum + "\nAverage : " + avg);
	    }
	}