//Question 6
//Write a program that prints all the numbers from 0 to 6 except 3 and 6.Expected output: 0 1 2 4 5

package task_2;

public class T2_6six {


public static void main(String args[]) {
	System.out.println("\nExpected Output: ");		
	for (int i=0; i<=6; i++) {
		if (i%3!=0||i==0) 
		System.out.print(i);			
	}		
	
}
}