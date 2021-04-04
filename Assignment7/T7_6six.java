//Question 6
//Program to check the number is Armstrong number

package task_7;

public class T7_6six {
	public static void main(String[] args) {

        int given_num = 153;
        int number; 
        int temp; 
        int sum = 0;

        number = given_num;
        while (number!=0)
        {
            temp = number % 10;
            sum = sum + temp*temp*temp;
            number = number/10;
        }

        if(sum == given_num)
            System.out.println(given_num + " is an Armstrong number");
        else
            System.out.println(given_num + " is not an Armstrong number");
    }
}