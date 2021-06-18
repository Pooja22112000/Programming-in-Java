//swapping without temporary variable
import java.lang.*;
public class SwapWithout{
	public static void main(String[] args){
		int a=3, b=9;
		
		System.out.println("The values before Swapping: \n a="+a+"b="+b);
		a=a-b;
		b=a+b;
		a=b-a;
		System.out.println("The values after Swapping: \n a="+a+"b="+b);
	}
}
