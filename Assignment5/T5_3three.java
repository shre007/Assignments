//Question 3
//Write a JAVA method to remove all the spaces from the String and return the resultant.


package task_5;

public class T5_3three {
	public static void main(String[] args) {
        String input = "Hello World";
        String output = removeSpaces(input);
        System.out.println(input);
        System.out.println(output);
    }
 
    // Remove all space characters
    private static String removeSpaces(String input) {
        return input.replaceAll(" ", "");
    }
}
