//Question 2
//Program to find the first non-repeated character in the String


package task_7;

public class T7_2two {


	public static void main(String[] args) {
	  String str1 = "hhhutyy";
	  System.out.println("The given string is: " + str1);
	  for (int i = 0; i < str1.length(); i++) {
	   boolean flag = true;
	   for (int j = 0; j < str1.length(); j++) {
	    if (i != j && str1.charAt(i) == str1.charAt(j)) {
	     flag = false;
	     break;
	    }
	   }
	   if (flag) {
	    System.out.println("The first non repeated character in String is: " + str1.charAt(i));
	    break;
	   }
	  }
	 }
	}
