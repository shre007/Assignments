//Question 5
//Write a Java program to move all 0's to the end of an array. Maintain the relative order of the other
//(non-zero) array elements.
package task_4;

public class T4_5five {

	public static void main(String[] args) throws Exception {
        int[] arr_nums = {0,0,0,0,3,0,9,3,6};
         int i = 0;
		System.out.print("The given array is: \n");
		for(int n : arr_nums)
            System.out.print(n+"  ");
		
        for(int j=0,l=arr_nums.length;j<l;) {
            if(arr_nums[j] == 0)
                j++;
            else {
                int temp = arr_nums[i];
                arr_nums[i] = arr_nums[j];
                arr_nums[j] = temp;
                i++;
                j++;
            }
        }
        while(i<arr_nums.length)
            arr_nums[i++] = 0;
		System.out.print("After moving 0's to the end of the array: \n");
        for (int n : arr_nums)
            System.out.print(n+"  ");
    }
}
