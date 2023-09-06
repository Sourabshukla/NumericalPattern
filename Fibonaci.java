package NumericalPattern;
import java.util.*;
public class Fibonaci {
	static void fibo(int count) {
		int n1=0,n2=1,n3=0,i;
		System.out.print(n1+" "+n2+" ");  // we know 1st 2 number will be 0 and 1
		for(i=2;i<count;i++) {
			n3=n1+n2;
			System.out.print(n3+" ");
			n1=n2;
			n2=n3;
		}
	}
	public static void main(String[] args) {
		int count;
		Scanner s=new Scanner(System.in);
		System.out.print("Enter a number");
		count=s.nextInt();
		fibo(count);
	}

}
