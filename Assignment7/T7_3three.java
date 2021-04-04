package task_7;

import java.util.HashSet;
public class T7_3three {
	public static void main(String[] args) {
	          int arr1[] = {2, 3, 4, 5, 6};
		      int arr2[] = {4, 6, 7, 8, 9};
		      HashSet<Integer> set1 = new HashSet();
		       for(int val: arr1){
		        set1.add(val);
		      }
		       for(int val: arr2){
		        if(set1.contains(val)){
		           System.out.println(val);
		        }
		     }
		   }
		 }