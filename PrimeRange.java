package NumericalPattern;
import java.util.*;
public class PrimeRange {
	static boolean IsPrime(int n) {
		if(n==1) {
			return false;
		}
		int c=2;
		while(c*c<=n) {
			if(n%c==0) {
				return false;
			}
			c++;
		}
		 return true;
	}
	
	public static void main(String[] args) {
		int sp,ep,i;
		Scanner s=new Scanner(System.in);
		System.out.print("Enter a start number");
		sp=s.nextInt();
		System.out.print("Enter a Lastt number");
		ep=s.nextInt();
		for(i=sp;i<=ep;i++) {
			if(IsPrime(i)) {
				System.out.print(i+" ");
			}
	
		}
		//alternate by using while loop
		
		System.out.print("\n___________");
				i=sp;
				while(i<=ep) {
					if(IsPrime(i)) {
						System.out.print(i+ " ");
					}
					i++;
				}
			
	}

}
