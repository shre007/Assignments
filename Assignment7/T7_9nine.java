//Question 9
//Find the maximum value in Array without using Collection?

package task_7;

import java.util.Arrays;

public class T7_9nine {

		  public static void main(String[] args) {
		    int arr[] = {8, 9, 7, 555, 7, 2, -9};
		    Arrays.sort(arr);

		    System.out.println("Maximum number = " 
		         + arr[arr.length - 1]);		
		  }
		}