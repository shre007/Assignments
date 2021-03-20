//Question 8
//Write a Java program to remove the duplicate elements of a given array and return the new length
//of the array
package task_4;

public class T4_8eight {

	public static void main(String[] args) {
        int num[] = {0,10,20,30,40,50,60,70};  
		System.out.println("Original length of array: "+num.length);
		System.out.print("The elements are: ");
       for(int i=0;i<num.length;i++)
        {
            System.out.print(num[i]+" ");
        }
		System.out.println("\nThe new length of the array is: "+arr_sort(num));
			
    }
    
    public static int arr_sort(int[] num) {
         int index = 1;
        for (int i = 1; i < num.length; i++) {
            if (num[i] != num[index-1])
                num[index++] = num[i];
        }
	  return index;
    }
}
