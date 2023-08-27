package NumericalPattern;
import java.util.*;
public class Factorial {
	static int fact(int n) {
		int fact=1;
		while(n!=1) {
			fact=fact*n;
			n--;
		}
		return fact;
	}
	
	
	public static void main(String[]args) {
		int n;
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		System.out.print(fact(n));
	}

}
