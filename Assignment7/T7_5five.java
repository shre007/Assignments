//Question 5
//Program to Count the number of words in the String

package task_7;
import java.util.Scanner;

public class T7_5five {
	    public static void main(String args[])
	    {
	    	int word_count=0;
	    	String text;
	        
	         
	        Scanner sc=new Scanner(System.in);
	        System.out.print("Enter string: ");
	        text=sc.nextLine();
	         
	        for(int i=0; i<text.length()-1; i++)
	        {
	            if(text.charAt(i)==' ' && text.charAt(i+1)!=' ')
	                word_count++;
	        }
	         
	        System.out.println("Total number of words in string are: "+ (word_count+1));
	        
	                     
	    }
	}
