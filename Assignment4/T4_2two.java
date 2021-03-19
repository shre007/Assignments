package task_4;

public class T4_2two {

	public static void main(String args[]){
	      int temp;
	      int size;
	      
	      int array[] = {10, 20, 25, 63, 96, 57};
	      size = array.length;

	      for(int a = 0; a<size; a++ ){
	         for(int b = a+1; b<size; b++){

	            if(array[a]>array[b]){
	               temp = array[a];
	               array[a] = array[b];
	               array[b] = temp;
	            }
	         }
	      }
	      System.out.println("The second largest number is: "+array[size-2]);
	   }
	}
