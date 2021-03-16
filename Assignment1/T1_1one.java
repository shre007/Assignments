//Question 1
//Swap two numbers using the third variable as a result name and do the same task without usingany third variable.
package task_1;
//package task_1;
import java.util.*;
import java.util.Scanner;
class T1_1one {
///FIRST RUN QUESTION 1A, THEN COMMENT IT AND RUN 1B
//Question 1a
	public static void main(String []s)
		{
		int a,b;
//			//Scanner class to read value
			Scanner sc=new Scanner(System.in);

			System.out.print("Enter value of a: ");
			a=sc.nextInt();
			System.out.print("Enter value of a: ");
			b=sc.nextInt();

			System.out.println("Before swapping - a: "+ a +", b: " + b);
//			////without using third variable
			a=a+b;
			b=a-b;
			a=a-b;
//			//////////////////////
			System.out.println("After swapping  - a: "+ a +", b: " + b);
		}
	}
//Question 1b
	public static void main(String []s)
	{
/		int a,b;
////		//Scanner class to read value
		Scanner sc=new Scanner(System.in);
///
		System.out.print("Enter value of a: ");
		a=sc.nextInt();
		System.out.print("Enter value of a: ");
		b=sc.nextInt();
////
		System.out.println("Before swapping - a: "+ a +", b: " + b);
////		////without using third variable
		a=a+b;
		b=a-b;
		a=a-b;
		//////////////////////
		System.out.println("After swapping  - a: "+ a +", b: " + b);
	}
}
