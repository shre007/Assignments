//Question 7
//Write a Java program to find the number of days in a month.
//Test Data
//Input a month number: 2
//Input a year: 2016
//Expected Output :
//February 2016 has 29 days


package task_3;
import java.util.Scanner;
public class T3_7seven {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int daysinMonth=0;
        String monthName = "Invalid";

        System.out.println("Enter the number of the month: ");
        int month = sc.nextInt();

        System.out.println("Enter the year: ");
        int year = sc.nextInt();

        if(month==1){
            monthName = "January";
            daysinMonth = 31;
        }
        else if (month==2){
            monthName = "February";
            if((year%400==0) || ((year%100!=0) && (year%4==0))){
                daysinMonth = 29;
            }
            else {
                daysinMonth = 28;
            }
        }
        else if(month==3){
            monthName = "March";
            daysinMonth = 31;
        }
        else if(month==4){
            monthName = "April";
            daysinMonth = 30;
        }
        else if(month==5){
            monthName = "May";
            daysinMonth = 31;
        }else if(month==6){
            monthName = "June";
            daysinMonth = 30;
        }else if(month==7){
            monthName = "July";
            daysinMonth = 31;
        }else if(month==8){
            monthName = "August";
            daysinMonth = 31;
        }else if(month==9){
            monthName = "September";
            daysinMonth = 30;
        }else if(month==10){
            monthName = "October";
            daysinMonth = 31;
        }else if(month==11){
            monthName = "November";
            daysinMonth = 30;
        }else if(month==12){
            monthName = "December";
            daysinMonth = 31;
        }

        System.out.println(monthName+" "+year+" has "+daysinMonth+" days\n");
    }
}
