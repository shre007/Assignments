//Question 3
//Write a JAVA program that takes user input from 1 to 12 for months, and displays the number of
//days of a particular month. (Shows “Invalid Details“ if incorrect month number will be provided).


package task_3;
import java.util.Scanner;
public class T3_3three {
	public static void main(String[] args)
	
	{
	    int month;
	 Scanner a=new Scanner(System.in);

	    System.out.print("Enter month number from 1 to 12: ");
	    month=a.nextInt();
	    if(month == 1)
	    {
	        System.out.println("January:31 days");
	    }
	    else if(month == 2)
	    {
	        System.out.println("February:28 or 29 days");
	    }
	    else if(month == 3)
	    {
	        System.out.println("March:31 days");
	    }
	else if(month == 4)
	    {
	        System.out.println("April:30 days");
	    }
	    else if(month == 5)
	    {
	        System.out.println("May:31 days");
	    }
	    else if(month == 6)
	    {
	        System.out.println("June:30 days");
	    }
	    else if(month == 7)
	    {
	        System.out.println("July:31 days");
	    }
	    else if(month == 8)
	    {
	        System.out.println("August:31 days");
	    }
	    else if(month == 9)
	    {
	       System.out.println("September:30 days");
	    }
	else if(month == 10)
	    {
	        System.out.println("October:31 days");
	    }
	    else if(month == 11)
	    {
	        System.out.println("November:30 days");
	    }
	    else if(month == 12)
	    {
	        System.out.println("December:31 days");
	    }
	    else
	    {
	        System.out.println("Invalid input! Please enter a month number between 1 to 12!");
	    }

	}
	}

