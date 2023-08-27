package NumericalPattern;
import java.util.*;
public class CountDigit {
	static int CountDigit(int n) {
		int count=0;
		while(n!=0) {
			n=n/10;
			count++;
		}
		
		return count;
	}
	public static void main(String[] args) {
		int n; 
		Scanner s=new Scanner(System.in);
		System.out.print("Enter a number: ");
		n=s.nextInt();
		System.out.print(CountDigit(n));
	}

}
