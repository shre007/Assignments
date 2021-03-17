//Question 9
//If the character is from r, a, n, d, o, m (consider both upper and lower cases), then print FOUND
//Print NOT FOUND for all the other alphabets

package task_2;
import java.util.Scanner;

public class T2_9nine {
    	    public static void main(String[] args)
    	    {
//    	        char ch;
//    	        int temp;
//    	        Scanner scan = new Scanner(System.in);
//    	        
//    	        System.out.print("Enter a Character in Lowercase : ");
//    	        ch = scan.next().charAt(0);
//    			
//    	        temp = (int) ch;
//    	        temp = temp - 32;
//    	        ch = (char) temp;
//    			
//    	        System.out.print("Equivalent Character in Uppercase = " +ch);
//    	    }
//    	    {

    
      // Create char primitives.  
    	    	Scanner sc = new Scanner(System.in);   
    	    	System.out.print("Input a character: ");  
    	    	// reading a character   
    	    	char c = sc.next().charAt(0);   
//        char ch1, ch2, ch3, ch4, ch5, ch6, ch7, ch8, ch9, ch10, ch11, ch12;  
      // Assign the values  
//      ch1 = 'r';  
//      ch2 = 'a';
//      ch3 = 'n';  
//      ch4 = 'd';
//      ch5 = 'o';  
//      ch6 = 'm';  
//        
//      ch7 = Character.toUpperCase(ch1);  
//      ch8 = Character.toUpperCase(ch2); 
//      ch9 = Character.toUpperCase(ch3);  
//      ch10 = Character.toUpperCase(ch4); 
//      ch11 = Character.toUpperCase(ch5);  
//      ch12 = Character.toUpperCase(ch6);
      if((c == 'r'))
      {
    	  System.out.println("FOUND");
      }
      
      else if((c == 'a'))
      {
    	  System.out.println("FOUND");
      }
      
      else if((c == 'n'))
      {
    	  System.out.println("FOUND");
      }
      
      else if((c == 'd'))
      {
    	  System.out.println("FOUND");
      }
      
      else if((c == 'o'))
      {
    	  System.out.println("FOUND");
      }
      else if((c == 'm'))
      {
    	  System.out.println("FOUND");
      }
      
      else if((c == 'R'))
      {
    	  System.out.println("FOUND");
      }
      
      else if((c == 'A'))
      {
    	  System.out.println("FOUND");
      }
      
      else if((c == 'N'))
      {
    	  System.out.println("FOUND");
      }
      
      else if((c == 'D'))
      {
    	  System.out.println("FOUND");
      }
      
      else if((c == 'O'))
      {
    	  System.out.println("FOUND");
      }
      
      else  if((c == 'M'))
      {
    	  System.out.println("FOUND");
      }
      
      else {
    	  System.out.println("NOT FOUND");
      }
      
     
   }  
}  