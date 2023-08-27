package NumericalPattern;
import java.util.*;
public class EvenOdd2 {
	static int evenodd (int n) {
		if(n%2==0) {
			return 1;
		}
		return 0;
	}
	public static void main(String[]args) {
		int n;
		System.out.println("Enter a  number");
		Scanner s =new Scanner(System.in);
		n=s.nextInt();
		int b=evenodd(n);
		if(b==1) {
			System.out.println(n+" is a even number");
		}
		else {
			System.out.println(n+" is a odd number");
		}
	}	

}
