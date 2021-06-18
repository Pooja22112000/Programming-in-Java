//java Program to print the season based on the month
import java.lang.*;
import java.util.*;
public class Season{
	public static void main(String[] args){
		
		Scanner sc=new Scanner(System.in);
		int n;
		System.out.println("Enter the Month you want to know the season");
		System.out.println("1.January 2.February 3.March 4.April 5.May 6.June .7.July 8.August 9.September 10.October 11.November 12.December");
		n= sc.nextInt();
		switch(n){
			case 12:
			case 1:
			System.out.println("Winter");
			break;
			case 2:
			case 3:
			System.out.println("Spring");
			break;
			case 4: 
			case 5: 
			case 6:
			System.out.println("Summer");
			break;
			case 7:
			case 8:
			case 9:
			System.out.println("Monsoon");
			break;
			case 10:
			case 11:
			System.out.println("Autumn");
			break;
			default:
			System.out.println("Please enter valid Month");
			
		}
	}
}
