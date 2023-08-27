package NumericalPattern;
import java.util.*;
public class Multiplication {
	static int Product(int n) {
		int i,prod;
		for(i=1;i<=10;i++) {
			prod=n*i;
			System.out.println(n+"*"+i+"="+prod);
		}
		return n;
	}
	public static void main(String[] args) {
		int n; 
		Scanner s=new Scanner(System.in);
		System.out.print("Enter a number: ");
		n=s.nextInt();
		Product(n);	
	}
}