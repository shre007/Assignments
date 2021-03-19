//Question 1
//
//Write a simple program to print a multiplication table of a certain number taken from the user,
//For eg. 2 X 1 = 2
//2 X 2 = 4
//and so on
package task_3;
public class T3_1one {

	public static void main(String[] args) {

        int number = 3;
        for(int a = 1; a <= 10; ++a)
        {
            System.out.printf("%d * %d = %d \n", number, a, number * a);
        }
    }
}
