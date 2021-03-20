//Question 11:
//Write a Java program to sort an array of positive integers of a given array, in the sorted array the
//value of the first element should be maximum, the second value should be the minimum value, the
//third should be the second maximum, the fourth second be the second minimum and so on

package task_4;
import java.util.Arrays;

public class T4_11eleven {

	     static int[] shift(int[] new_array, int n)
	    {
	        int temp[] = new int[n];
	     
	         int small_number = 0; 
	        int large_number = n-1;
	         boolean flag = true;
	     
	        for(int i=0;i<n;i++)
	        {
	            if (flag)
	                temp[i] = new_array[large_number--];
	            else
	                temp[i] = new_array[small_number++];
	     
	            flag = !flag;
	        }
	        return temp;
	    }
	 
	    public static void main(String[] args) 
	    {
	        int nums[] = new int[]{10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
	        int result[];
	         
	        System.out.println("Given array is: ");
	        System.out.println(Arrays.toString(nums));
	         
	        result = shift(nums,nums.length);
	         
	        System.out.println("New array is: ");
	        System.out.println(Arrays.toString(result));
	     
	    }
	}

