//Question 3
//Write a Java program to find the second smallest element in an array
package task_4;

public class T4_3three {

	public static void main(String args[]){
	      int temp;
	      int size;
	      int array[] = {10, 20, 30, 40, 50, 60};
	      size = array.length;

	      for(int i = 0; i<size; i++ ){
	         for(int j = i+1; j<size; j++){
	            if(array[i]>array[j]){
	               temp = array[i];
	               array[i] = array[j];
	               array[j] = temp;
	            }
	         }
	      }
	      System.out.println("Second smallest element of the array is: "+array[1]);
	   }
	}
