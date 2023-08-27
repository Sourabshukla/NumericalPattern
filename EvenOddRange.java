package NumericalPattern;
import java.util.*;
public class EvenOddRange {
	static boolean evenodd (int n) {
		if(n%2==0) {
			return true;
		}
		return false;
	}
	public static void main(String[] args) {
		int sp,ep,i;
		Scanner s=new Scanner(System.in);
		System.out.print("Enter a start number");
		sp=s.nextInt();
		System.out.print("Enter a Lastt number");
		ep=s.nextInt();
		for(i=sp;i<=ep;i++) {
			boolean b=evenodd(i);
			if(b==true) {
				if(sp==ep) {
					System.out.print(i+ " is an even number");
				}
				else {
					System.out.print(i+" ");
				}
			}
			else if(sp==ep && b==false) {
				
				System.out.print("enter variable range ");
			}
		}
		
	}

}
