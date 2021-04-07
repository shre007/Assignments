//Question 4
//Program to find if String has all Unique Characters?

package task_7;

public class T7_4four {

		  public static void main(String[] args) {
		    System.out.println(hasUniqueCharacters("shreyas"));
		    
		  }
		  
		  private static boolean hasUniqueCharacters(String string){
		    for(char character : string.toCharArray()){
		      if(string.indexOf(character) == string.lastIndexOf(character))
		        continue;
		      else
		        return false;
		    }
		    return true;
		  }

		}