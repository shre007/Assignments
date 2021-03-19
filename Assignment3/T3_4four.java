package task_3;
import java.util.Scanner;
public class T3_4four {

	public static void main(String[] args)

	{
	   int i;
	   int n;
	   int sum=0;
	   {
	   Scanner in = new Scanner(System.in);  
	        System.out.print("Enter number: ");  
	         n = in.nextInt();
	}
	  System.out.println("The first n natural numbers are : "+n);
	  
	 for(i=1;i<=n;i++)
	   {
	     System.out.println(i);
	     sum=sum+i;
	   }
	System.out.println("The sum of natural numbers upto "+n+ " terms : " +sum);

	}
	}