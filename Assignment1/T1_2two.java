
//Question 2
//Write a program to print the value given by the user.

package task_1;
import java.util.*;
import java.util.Scanner;
public class T1_2two {

public static void main(String[] args) {
		////
////		    // Creates a reader instance which takes
////		    // input from standard input - keyboard
	    Scanner reader = new Scanner(System.in);
	    System.out.print("Enter a number: ");
		////
//	    nextInt() reads the next integer from the keyboard
		int number = reader.nextInt();
		////
////		    // println() prints the following line to the output screen
		 System.out.println("You entered: " + number);
		}
}