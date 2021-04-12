//Question 2
//Program to Count the number of words in the String using stream?


package task_8;
import java.util.stream.Stream;
public class T8_2two {
    public static void main(String[] args) 
    {
        long count = Stream.of("I","know","what","you","did")
                    .count();
        System.out.printf("There are %d words in the string %n", count);
    }
}