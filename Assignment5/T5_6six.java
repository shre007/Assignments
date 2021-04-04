//Question 6
//Write a JAVA program that takes out the even from the odds and odd from the list of even numbers,
//eg, => {23,25,75,87,47,1,91,51,2} //Output for this case =>2
//=> {22,44,64,76,98,12,43,54,90} // Output for this case =>43.


package task_5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class T5_6six {
	    public static void main (String [] args) {
	        ArrayList <Integer> mylist = new ArrayList<>(Arrays.asList(1, 2, 4, 6, 7));
	        ArrayList <Integer> mylist1 = new ArrayList<>(Arrays.asList(1, 3, 5, 6, 7));
	        System.out.println(odd(mylist));
	        System.out.println(even(mylist1));
	    }

	    public static List<Integer> odd(ArrayList<Integer> list) {
	        if (list.isEmpty()) { throw new Error(); }
	        List<Integer> toRemove = new ArrayList<>();

	        for (int si : list) {
	            if (si % 2 != 0) { toRemove.add(si); }
	        }

	        list.removeAll(toRemove);
	        return list;//return list, not int
	    }
	    public static List<Integer> even(ArrayList<Integer> list) {
	        if (list.isEmpty()) { throw new Error(); }
	        List<Integer> toRemove = new ArrayList<>();

	        for (int si : list) {
	            if (si % 2 == 0) { toRemove.add(si); }
	        }

	        list.removeAll(toRemove);
	        return list;//return list, not int
	    }
	}
