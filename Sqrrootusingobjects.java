//finding the squareroot of a number using classes and objects
import java.lang.*;
import java.util.*;
class Sqrroot{
	int number;
	double squareroot;
	Sqrroot(int n){
		int number=n;
	}
	double calculation(int n){
		squareroot=Math.sqrt(n);
		System.out.println("The square Root of the number "+n+" is: "+squareroot);
		return squareroot;	
	}
}
class Sqrrootusingobjects{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("A.POOJA -- 18MIS0232");
		System.out.println("Enter the number for which you want to find the square root");
		int inp=sc.nextInt();
		Sqrroot sr=new Sqrroot(inp);
		sr.calculation(inp);
	}
}