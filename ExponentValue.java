package NumericalPattern;
import java.util.*;
public class ExponentValue{
	static int power(int base,int expo) {
		int m=1;
		while(expo!=0) {
			m=m*base;
			expo--;
		}
		return m;
		
	}
	public static void main(String[] args) 
	{
		int base,expo;
		Scanner s=new Scanner(System.in);
		System.out.print("Enter a base num: ");
		base= s.nextInt();
		System.out.print("Enter a exponent num: ");
		expo=s.nextInt();
		
		if(expo==0) {
			System.out.print("Answer is :"+1);
		}
		else if(base==0){
			System.out.print("Answer is :"+0);
		}else {
			int n=power(base,expo);
			System.out.print("Answe is:"  +n);
		}
	}

}
