//finding roots of a Quadratic Equation
import java.lang.*;
import java.lang.Math.*;
public class RootOfEqn{
	public static void main(String[] args){
		
		double a=1,b=4,c=4;
		System.out.println("18MIS0232 A.POOJA");
		System.out.println("a,b,c are:"+a+"\t"+b+"\t"+c);
		System.out.println("equation is "+a +"x^2 +"+b+ "x+" +c);
		double root1,root2;
		
		double det;  //determinant initialization
		
		det=(b*b)-4*a*c;
		if(det>0){
			System.out.println("The roots are real and different");
			root1= (-b+Math.sqrt(det))/(2*a);
			root2= (-b-Math.sqrt(det))/(2*a);
			System.out.println(" "+root1+""+root2);
		}
		else if (det==0){
			System.out.println("The roots are real and equal");
			root1=root2=-b/(2*a);
			System.out.println(" "+root1+""+root2);
			
		}
		else{
			System.out.println("The roots are complex and different");
			double real=-b/(2*a);
			double imaginary= Math.sqrt(-det)/(2*a);
			
			System.out.println("root1="+real+"+i"+imaginary+ "\troot2 is"+real+"-i"+imaginary);
			
		}
		
		//int d=Math.sqrt(det);
		
		
		/*
		root1= (((-b)+root)/(2*a));
		root2= (((-b)-root)/(2*a));
		System.out.println("The roots are of the equation"+a+"x^2+"+b+"x+"+c+"are\t"+root1+"\t"+root2);
		
		*/
		/*
		int a=16;
		double s=Math.sqrt(a);
		System.out.println(""+s);
		*/
		
	}
}

		
		