package NumericalPattern;
import java.util.*;
public class Swapping1 {
	//swap the number without using third var
	static void swap(int a,int b) {
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.print("a="+a+"b="+b);
		
	}
	public static void main(String[] args) {
		int a,b;
		Scanner s=new Scanner(System.in);
		System.out.print("Enter a first number");
		a=s.nextInt();
		System.out.print("Enter a second number");
		b=s.nextInt();
		System.out.println("without using third variable we used addition method");
		swap(a,b);
		System.out.println("result is printed");		
	}

}
