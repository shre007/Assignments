//Question 10
//Write a Java program to find the two elements from a given array of positive and negative numbers
//such that their sum is closest to zero

package task_4;
public class T4_10ten {
	
	   public static void main (String[] args) 
	    {
	      int arr[] = {1, 9, -9, 7, 2, -11};
	      int size = arr.length;
	      int l;
	      int r; 
	      int min_sum; 
	      int sum; 
	      int min_l; 
	      int min_r;
	    
	      if(size < 2)
	      {
	        System.out.println("Invalid Input");
	        return;
	      }
	      
	      min_l = 0;
	      min_r = 1;
	      min_sum = arr[0] + arr[1];
	      
	      for(l = 0; l < size - 1; l++)
	      {
	        for(r = l+1; r < size; r++)
	        {
	        	
	        	sum = arr[l] + arr[r];
	            if(Math.abs(min_sum) > Math.abs(sum))
	            {
	              min_sum = sum;
	              min_l = l;
	              min_r = r;
	            }
	          }
	        }
	        
	        System.out.println("Two elements whose sum is minimum are "+
	                          arr[min_l]+ " and "+arr[min_r]);
	      }
	  }
