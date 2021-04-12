//Question 5
//Convert the string in upper case using stream?


package task_8;
import java.util.*;
public class T8_5five {

  public static void main(final String[] args) {
    List<String> fruits = Arrays.asList("Grapes", "Banana", "Watermelon",
        "Apples", "Oranges", "Figs");

    fruits.stream().map(name -> name.toUpperCase())
        .forEach(name -> System.out.print(name + " "));

  }

}
