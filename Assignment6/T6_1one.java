//Question 1
//Print the sum, difference, and product of two complex numbers by creating a class named
//'Complex' with separate methods for each operation whose real and imaginary parts are entered by
//the user.

package task_6;
public class T6_1one {
	int real, imaginary;
	T6_1one(){}
	
	T6_1one(int tempReal, int tempImaginary)
	{
		real=tempReal;
		imaginary=tempImaginary;
	}
	
	T6_1one addComp(T6_1one C1, T6_1one C2)
	{
		T6_1one temp =  new T6_1one();
		temp.real = C1.real + C2.real;
		temp.imaginary = C1.imaginary + C2.imaginary;
		return temp;
	}
	
	T6_1one subtractComp(T6_1one C1,T6_1one C2)
	{
		T6_1one temp = new T6_1one();
		temp.real = C1.real-C2.real;
		temp.imaginary=(C1.imaginary-C2.imaginary);
		return temp;
	}
	
	T6_1one multiplicationComp(T6_1one C1,T6_1one C2)
	{
		T6_1one temp=new T6_1one();
		temp.real=C1.real*C2.real;
		temp.imaginary=(C1.imaginary*C2.imaginary);
		return temp;
	}
		
		public static void main(String[] args)
		{
			T6_1one C1 = new T6_1one(5,4);
			T6_1one C2 = new T6_1one(1,2);
			
			System.out.println("Complex number 1 : "+ C1.real + " + i"+ C1.imaginary); 
			System.out.println("Complex number 2 : "+ C2.real + " + i"+ C2.imaginary);
			T6_1one C3 = new T6_1one();
			
			C3=C3.addComp(C1,C2);
			System.out.println("Addition of complex number : "+ C3.real + " + i"+ C3.imaginary);
			C3 = C3.subtractComp(C1, C2); 
			System.out.println("Subtraction of complex number : ("+ C3.real + ") - i("+ C3.imaginary+")");
			C3 = C3.multiplicationComp(C1, C2);
			System.out.println("Multiplication of complex number : ("+ C3.real + ") * i("+C3.imaginary+")");  
			
		}
		}

