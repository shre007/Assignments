//Question 4
//Write a program in Java to break and continue if the following cases occurs:
//If user enters a negative number just break the loop and print “It’s Over”
//If user enters a positive number just continue in the loop and print “Good Going”

package task_2;
import java.util.Scanner;

public class T2_4four {
	
	public static void main(String[] args){
		int i;
		Scanner scanner;
        scanner = new Scanner(System.in);
        System.out.println("Enter value of i");
        i = scanner.nextInt();
		while(i < 1000) {
//			System.out.println(i);
//			i--;
//			i++;
			if(i<0) {
				System.out.println("It's Over");
				break;
			}
//			
			else if(i>0) {
				System.out.println("Good Going");
				continue;
			}
				
			}
	}
}
				
	
		
		
//		    if(x < 0) {
//		    	System.out.println("It's Over");
//		        break;
//		    }
//		    else if (x > 0) {
//		        
//		        continue;
//		    }
//		}
//	}
//}
//        int x;
//        int option;
//        Scanner scanner;
//        scanner = new Scanner(System.in);
//        x = scanner.nextInt();
// 
//        System.out.println("Enter a number");
//        option = scanner.nextInt();
//        switch (option) {
//        case 1:
//        	if((x)<0) {
//            	break;
//            }
//            System.out.println("It's Over");
//            
//            	
//            
//        
//        case 2:
//        	while((x)>0) {
//        		continue;
//        	}
//        	System.out.println("Good Going");
//        	
//        default:
//        	System.out.println("ERROR: Unsupported Operation");
//        }
//	}
//}
//        	
//        

        


//	
//        while (x < 0) {
//        	
//        	break;
//        }
//          System.out.println("It's Over");
//            
//        }
//	{
//	int x = 0;
//	while(x > 0) {
//		continue;
//		
//	}
//	System.out.println("Good Going");
//	
//}
//}
	
	
        
        
        




//public static void main(String[] args) {  
//	Scanner in = new Scanner(System.in);
//    System.out.print("Input value: ");
//    int input = in.nextInt();
//    //using for loop  
//    for(int i=1;i<=1000;i++){  
//       if(i<0){  
//           //breaking the loop  
//           break;  
//        }  
//       System.out.println("It's over");  
//    }
//     {
//    	continue;
//    	System.out.println("Good Going"); 
//    }
//}  
//
//}