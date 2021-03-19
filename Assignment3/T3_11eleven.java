//Question 11
//Write a Java program that accepts two floatingpoint numbers and checks whether they are the
//same up to two decimal places.


package task_3;
import java.util.Scanner;
public class T3_11eleven {

	public static void main(String[] args) { 
		 Scanner input = new Scanner(System.in); 
		 System.out.print("Enter first floating­point number: "); 
		 double num1 = input.nextDouble(); 
		 System.out.print("Enter second floating­point number: "); 
		 double num2 = input.nextDouble(); 
		 
		  
		 if (Math.abs(num1 - num2) <= 0.01) { 
		     System.out.println("These numbers are the same."); 
		 } 
		 else { 
		     System.out.println("These numbers are different."); 
		 } 
		    } 
		}
