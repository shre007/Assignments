//Question 7
//Program to Count occurrences of each character in a string in java

package task_7;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class T7_7seven {

	    public static void main(String[] args) {
	        String input;
	        Scanner sc = new Scanner(System.in);
	        int count;
	        System.out.println("Enter string : ");
	        input = sc.nextLine();
	        HashMap<Character, Integer> map = new HashMap<>();
	        for (char character : input.toCharArray()) {
	            if (map.containsKey(character)) {
	                count = map.get(character);
	                map.put(character, count+1);
	            } else {
	                map.put(character, 1);
	            }
	        }
	        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
	            System.out.println(entry.getKey() + " : " + entry.getValue());
	        }
	    }
	}
