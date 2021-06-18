import java.lang.*;
import java.util.*;
public class RevOrdArray{
	public static void main(String[] args){
		//int[] a;//declare an array
		System.out.println("A.POOJA 18MIS0232");
		int [] a=new int[5];
		a[0]=1;
		a[1]=2;
		a[2]=3;
		a[3]=4;
		a[4]=5;
		
		/*int [] b={1,2,3,4,5,6};
		System.out.println("A.POOJA  18MIS0232 ");
		System.out.println("The actual order of array is: ");
		for(int i=0;i<b.length;i++){
			System.out.println(b[i]);
		}
		System.out.println("The Reverse order of array is: ");
		for(int i=b.length-1;i>=0;i--)
		{
			System.out.println(b[i]);
		}
		*/
		System.out.println("The actual order of array is: ");
		for(int i=0;i<a.length;i++){
			System.out.println(a[i]);
		}
		System.out.println("The Reverse order of array is: ");
		for(int i=a.length-1;i>=0;i--)
		{
			System.out.println(a[i]);
		}
	}
}