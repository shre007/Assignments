//Question 9
//Write a Java program to find the sum of the two elements of a given array which is equal to a given
//integer.
//Sample array: [1,2,4,5,6]
//Target value: 6.

package task_4;
import java.util.*;

public class T4_9nine {

        public static ArrayList<Integer> two_sum(final List<Integer> a, int b) {
        
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        ArrayList<Integer> result = new ArrayList<Integer>();
        result.add(0);
        result.add(1);
        for(int i=0;i<a.size();i++){
            if(map.containsKey(a.get(i))){
                int index = map.get(a.get(i));
                result.set(0, index );
                result.set(1, i );
                break;
            }
            else{
                map.put(b - a.get(i), i);
            }
        }
        
        return result;
    }
        
        public static void main(String[] args){
            ArrayList<Integer> array = new ArrayList<Integer>();
            array.add(1);
            array.add(2);
            array.add(4);
            array.add(5);
    		array.add(6);
    		int target = 6;
            ArrayList<Integer> result = two_sum(array, target);
            for(int i:result)
                System.out.print("Index: "+i + " ");
        }
    }
	
	
	    
	   