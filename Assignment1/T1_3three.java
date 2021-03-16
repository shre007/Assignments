package task_1;
import java.util.*;
import java.util.Scanner;

public class T1_3three {
public static void main(String[] args) {
int num1,num2,z, result;
Scanner input =  new Scanner(System.in);
System.out.println("Enter first number between 1 to 10");
num1 = input.nextInt();
System.out.println("Enter second number between 1 to 10");
num2 = input.nextInt();
System.out.println("Enter value of z as 30");
z = input.nextInt();
input.close();
////
result = num1 + num2 + z;
////
System.out.printf("%d + %d + %d = %d", num1,num2,z,result);

}

}

