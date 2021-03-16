//Question 1
//Write a program in JAVA to perform the following operation:
//If a number is divisible by 3 it should print “Consultadd” as a string
//If a number is divisible by 5 it should print “JAVA Training” as a string
//If a number is divisible by both 3 and 5 its should print “Consultadd JAVA Training” as astring

package task_2;
import java.util.Scanner;

public class T2_1one {


public static void main (String[] args){
//		
	        int i;
//	//Scanner class to read value
	            Scanner sc=new Scanner(System.in);
//
	            System.out.print("Enter value of i: ");
            i=sc.nextInt();
//		        
//	            
            if(i % 3 == 0 && i % 5 == 0){
                System.out.println("Consultadd JAVA Training");
            }
            //Check for divisibility by 3 and print "Fizz" if true
            else if(i % 3 == 0){
	               System.out.println("Consultadd");
          }
//	            //Check for divisibility by 5 and print "Buzz" if true
            else if(i % 5 == 0){
//	                System.out.println("Java Training");
	            }
//	            //If a number is not divisible by 3 or 5, print it normally
	            else{
	                System.out.println(i);
            }
//	 
     }
//	  
}
	
