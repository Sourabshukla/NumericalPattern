package NumericalPattern;
import java.util.*;
public class Swapping2 {
	static void swap(int a,int b) {
		a=a^b;
		b=a^b;
		a=a^b;
		System.out.print("a="+a+"b="+b);
		
	}
	public static void main(String[] args) {
		int a,b;
		Scanner s=new Scanner(System.in);
		System.out.print("Enter a first number");
		a=s.nextInt();
		System.out.print("Enter a second number");
		b=s.nextInt();
		System.out.println("by using bitwise operator");
		swap(a,b);
		
	}


}
