package NumericalPattern;
import java.util.*;
public class PrimeNumber{
	static boolean IsPrime(int n) {
		if(n==1) {
			return false;
		}
		int c=2;
		while(c*c<=n) {
			if(n%2==0) {
				return false;
			}
			c++;
		}
		 return true;
	}
	public static void main(String[] args) {
		int n;
		Scanner s= new Scanner(System.in);
		n=s.nextInt();
		boolean b=IsPrime(n);//it return boolean value
		if(IsPrime(n)) {
			System.out.print(n+" is a prime num");
		}
		else {
			System.out.print(n+" is not a prime num");
		}
		
	}
}
