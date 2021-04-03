//Question 1
//Write a JAVA program that takes a given String of words and returns the length of the shortest word.


package task_5;

import java.util.Scanner;

public class T5_1one {
	
public static void findWords(String input) {
	if(input==null)
		return;
	String words[]=input.split(" ");
	int smallestWordlen = Integer.MAX_VALUE;
	String smallestWord="";
	for(int i=0;i<words.length;i++) {
		String word=words[i];
		int len=word.length();
		if(len<smallestWordlen) {
			smallestWordlen=len;
			smallestWord=word;
		}
	}
	System.out.println("Input String: "+ input);
	System.out.println("Smallest Word is: "+ smallestWord);
	System.out.println("Length of smallest Word is: " + smallestWord.length());
}

public static void main(String[] args) {
	System.out.println("Enter the string: ");
	Scanner in=new Scanner(System.in);
	String input=in.nextLine();
	findWords(input);
	in.close();
}
}

