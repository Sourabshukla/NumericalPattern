package NumericalPattern;
import java.util.*;
public class EvenOdd1 {
	public static void evenodd(int n) {
		if(n%2==0) {
			System.out.print(n+"= number is even");
		}
		else {
			System.out.print(n+ "= number is odd");
		}
	}
	public static void main(String[] args) {
		System.out.println("Check wether the Number is even or odd ");
		System.out.print("please Enter a Number ");
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		evenodd(n);
		
	}

}
