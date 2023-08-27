package NumericalPattern;
import java.util.*;
//called method
public class EvenOdd {    
	static boolean evenodd (int n) {
		if(n%2==0) {
			return true;
		}
		return false;
	}
	//calling method
	public static void main(String[]args) {
		int n;
		System.out.println("Enter a  number");
		Scanner s =new Scanner(System.in);
		n=s.nextInt();
		boolean b=evenodd(n);
		if(b==true) {
			System.out.println(n+" is a even number");
		}
		else {
			System.out.println(n+" is a odd number");
		}
	}	
}