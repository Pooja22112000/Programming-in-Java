//finding sum and average of contents in an array
import java.lang.*;
import java.util.*;
public class SumAvgArr{
	public static void main(String[] args){
		System.out.println("A.POOJA 18MIS0232");
		int [] a={1,3,4,5,6,2};
		double sum=0, avg;
		for(int i=0;i<a.length;i++)
		{
			sum=sum+a[i];
		}
		System.out.println(sum);
	    avg= sum/(a.length);
		System.out.println(avg);
	
	}
}
