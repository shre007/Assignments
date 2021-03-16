//Question 5
//Write a program in Java which will find all such numbers which are divisibleby 7 but are not amultiple of 5, 
//between 2000 and 3200.

package task_2;

public class T2_5five {

	
	public static void main(String args[]) {
				
		for (int i=2000; i<3200; i++) {
			if (i%7==0&&i%5!=0) 
			System.out.print(i +", ");			
		}			
				
		
  }
}

