//Write a program in JAVA to perform the following operator based task:
//Ask the user to choose the following option first
//Question 2
//If User Enter 1 - Addition
//If User Enter 2 - Subtraction
//If User Enter 3 - Division
//If User Enter 4 - Multiplication
//If User Enter 5 - Average
//Ask the user to enter the 2 numbers in a variable 
//for first and second (first and second are variablenames) 
//for the first 4 options mentioned above and print the result
//Ask the user to enter two more numbers as first1 and second2 
//for calculating the average as soonas the user chooses an option 5In the end, 
//if the answer of any operation is Negative print a statement saying
//“Oops optionX(1/2/3/4/5/) is returning the negative number
//”NOTE: At a time users can perform one action at a time

package task_2;
import java.util.Scanner;

public class T2_2two {

	public static void main(String[] args){
        int x, y;
        int option;
 
        Scanner scanner;
        scanner = new Scanner(System.in);
        System.out.println("Enter Two Integers");
        x = scanner.nextInt();
        y = scanner.nextInt();
 
        System.out.println("Enter a number");
        option = scanner.nextInt();
        switch (option) {
        case 1:
            System.out.format("%d + %d = %d\n", x, y, x + y);
            if((x+y)<0) {
            	System.out.println("Oops option 1/2/3/4/5 is returning negative number");
            }
            break;
        case 2:
            System.out.format("%d - %d = %d\n", x, y, x - y);
            if((x-y)<0) {
            	System.out.println("Oops option 1/2/3/4/5 is returning negative number");
            }
            break;
        case 3:
            System.out.format("%d / %d = %d\n", x, y, x / y);
            if((x/y)<0) {
            	System.out.println("Oops option 1/2/3/4/5 is returning negative number");
            }
            	
            break;
        case 4:
            System.out.format("%d * %d = %d\n", x, y, x * y);
            if((x*y)<0) {
            	System.out.println("Oops option 1/2/3/4/5 is returning negative number");
            }
            break;
        
        case 5:
        	double a, b;
            int op;
     
            Scanner scanner1;
            scanner1 = new Scanner(System.in);
            System.out.println("Enter Two Integers");
            a = scanner1.nextDouble();
            b = scanner1.nextDouble();
        	    
        	   
        	    double sum = 0.0;
        	    double avg = 0.0;

        	    // calculate the sum value
        	    sum = (a + b);
        	    // calculate the average value
        	    avg = sum/2;

        	    // display result
        	    System.out.println("Average: " + avg );
        	    if((avg)<0.0){
                	System.out.println("Oops option 1/2/3/4/5 is returning negative number");
                }
        
//            
            break;
        
        
            
        	
        default:
            System.out.println("ERROR: Unsupported Operation");
        }
    }
}
