//Question 4
//Find the Average value in a list of Integers using stream?

package task_8;

import java.util.Arrays;
import java.util.List;

public class T8_4four {
	public static void main(final String[] args) {
List<Integer> list = Arrays.asList(1,2,3,4,5);

System.out.println("average by using Stream : " + list.stream().mapToInt(Integer::intValue).average());

}
}