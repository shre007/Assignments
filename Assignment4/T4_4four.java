//Question 4
//Write a Java program to add two matrices of the same size

package task_4;
import java.util.Scanner;
public class T4_4four {

	public static void main(String args[])
	   {
	      int a;
	      int b; 
	      int c; 
	      int d;
	      Scanner in = new Scanner(System.in);
	 
	      System.out.println("Enter number of rows");
	      a = in.nextInt();
	      System.out.println("Enter number of columns");
	      b  = in.nextInt();
	 
	      int arr1[][] = new int[a][b];
	      int arr2[][] = new int[a][b];
	      int sum[][] = new int[a][b];
	 
	      System.out.println("Enter elements of first matrix");
	 
	      for(c=0;c<a;c++)
	         for(d=0;d<b;d++)
	            arr1[c][d] = in.nextInt();
	 
	      System.out.println("Enter elements of second matrix");
	 
	      for(c=0;c<a;c++)
	    	  for (d=0;d<b;d++)
	              arr2[c][d] = in.nextInt();
	   
	        for(c=0;c<a;c++)
	           for (d=0;d<b;d++)
	               sum[c][d] = arr1[c][d] + arr2[c][d]; 
	   
	        System.out.println("Sum of the matrices:");
	   
	        for(c=0;c<a;c++)
	        {
	           for(d=0;d<b;d++)
	              System.out.print(sum[c][d]+"\t");
	   
	           System.out.println();
	        }
	     }
	  }
