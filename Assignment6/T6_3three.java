//Question 3
//Write a program to print the names of students by creating a Student class. If no name is passed
//while creating an object of Student class, then the name should be "Unknown", otherwise the name
//should be equal to the String value passed while creating an object of Student class. (Hint: Overloading
//concept)

package task_6;

public class T6_3three{
static class Student{
  String name;
  public Student(String n){
    name = n;
  }
  public Student(){
    name = "Unknown";
  }



  public static void main(String[] args){
    Student n = new Student("shreyas");
    Student a = new Student();

    System.out.println(n.name);
    System.out.println(a.name);
  }
}
}

 

 

  
 



 

 

  
 
 
