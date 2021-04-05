//Question 12
//Program to find all the sub-array whose sum is equal to the given number?

package task_7;
import java.util.Arrays;
import java.util.Scanner;

public class T7_12twelve {

	
	   public static void main(String args[]){
	      Scanner input = new Scanner(System.in);
	      System.out.println("Enter the size of the array that is to be created: ");
	      int n = input.nextInt();
	      int[] array = new int[n];
	      System.out.println("Enter the elements of the array: ");
	      for(int i=0; i<n; i++){
	         array[i] = input.nextInt();
	      }
	      System.out.println("Enter the required sum: ");
	      int ans = input.nextInt();
	      System.out.println("The array created is: "+Arrays.toString(array));
	      System.out.println("The sub arrays whose sum is: "+ans);
	      for(int i=0; i<array.length; i++){
	         int sum = 0;
	         for (int j=i; j<array.length; j++){
	            sum = sum + array[j];
	            if(sum == ans){
	               System.out.println(Arrays.toString(Arrays.copyOfRange(array, i, j+1)));
	            }
	         }
	      }
	   }
	}