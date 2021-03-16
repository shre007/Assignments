//Question 7
//Given an integer, perform the following conditional actions:
//Ifis odd, print NEW
//Ifis even and in the inclusive range of 2 to 5, print OLD
//Ifis even and in the inclusive range of 6 to 30, print NEW
//Ifis even and greater than 30, print OLD


package task_2;
import java.util.Scanner;

public class T2_7seven {


public static void main(String[] args) {
//
    Scanner sc=new Scanner(System.in);
System.out.print("Enter value  :");
    int n=sc.nextInt();            
   String ans="";
    if(n%2==1||n%2==0&& n>5 && n<31){
      ans = "NEW";
    }
    else{

       if(n%2==0&& n>1 && n<6||n>30){
      ans = "OLD";
    }

    }
    System.out.println(ans);

}
}
//