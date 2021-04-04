//Question 5
//Write a JAVA program that reverses the words of a sentence.
//For eg, => “Be Happy and Stay Motivated” => “eB yppah dna yatS detavitoM”.


package task_5;

import java.util.Scanner;

public class T5_5five {

		public static void main(String[] args) {
		String string = "My name is Shreyas";
		System.out.println("The original string is: " + string);
		String strWords[] = string.split("\\s");
		String rev = "";
		for(String swords : strWords) {
		StringBuilder sb = new StringBuilder(swords);
		sb.reverse();
		rev += sb.toString() + " ";
		}
		System.out.println("The modified string is: " + rev.trim());
		}
		}