//Question 10
//Find all possible combinations of String? (using recursion)

package task_7;

public class T7_10ten {

		static public void StringCombination(String input) {
			System.out.println("Combination of String:" +input);
			StringCombination("",input);
		}

		private static void StringCombination(String combination, String input) {
			if(input.length()==0) {
				System.out.println(combination);

			}
			else {
				for(int i=0;i<input.length();i++) {
					StringCombination(combination+input.charAt(i),
							input.substring(0,i)+input.substring(i+1,input.length()));
					
				}
			}
		}

		public static void main(String[] args) {
			StringCombination("Abcd");
		}
		}