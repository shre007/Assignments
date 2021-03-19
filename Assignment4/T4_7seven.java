//Question 7
//Write a Java program to get the difference between the largest and smallest values in an array of
//integers. The length of the array must be 1 and above
package task_4;
import java.util.Arrays;
public class T4_7seven {
	
	public static void main(String[] args)
	 {
	    int[] arr_num = {8, 5, 0, 1, 2,3};
		System.out.println("The given array is: "+Arrays.toString(arr_num)); 
		int max_val = arr_num[0];
		int min_val = arr_num[0];
		for(int i = 1; i < arr_num.length; i++)
		{
			if(arr_num[i] > max_val)
				max_val = arr_num[i];
			else if(arr_num[i] < min_val)
				min_val = arr_num[i];
		}
		System.out.println("Difference between the largest and smallest values of given array: "+(max_val-min_val));	
	 }
	}


