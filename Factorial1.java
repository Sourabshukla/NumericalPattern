package NumericalPattern;
import java.util.*;
public class Factorial1 {
	static int fact(int n) {
		int fact=1,i;
		for(i=1;i<=n;i++) {
			fact=fact*i;
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
