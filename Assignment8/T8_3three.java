//Question 3
//Find the maximum value in Array using Streams?
package task_8;
import java.util.*;

public class T8_3three {  
   
    public static void main(String[] args)
    {
  
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
  
        System.out.print("The maximum value is : ");
        Integer var = list.stream().max(Integer::compare).get();
  
        System.out.print(var);
    }
}
