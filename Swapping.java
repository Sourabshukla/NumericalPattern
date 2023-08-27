package NumericalPattern;
import java.util.*;
public class Swapping {
	static void swap(int a,int b) {
		int temp=0;
		System.out.println("temp="+temp);
		temp=a;
		a=b;
		b=temp;
		System.out.println("a= "+a +" b= "+b );
		System.out.println("temp= "+temp);
	}
	public static void main(String[] args) {
		int a,b;
		Scanner s=new Scanner(System.in);
		System.out.print("Enter a first number");
		a=s.nextInt();
		System.out.print("Enter a second number");
		b=s.nextInt();
		System.out.println("with using third variable");
		swap(a,b);
		
	}

}
