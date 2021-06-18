package dailyExpense;

import java.io.*;
import java.lang.*;
import java.util.*;

public class DailyExpense{
	
	double grocery=0;
	double fuel=0;
	double electronics=0;
	public static double sum_dExp=0;
	double avg_dExp_per_day=0;
	
	Scanner sc=new Scanner(System.in);
	public void getDetails(){
	 System.out.println("\t \t-------- The grocery expenditure for person --------");
	 System.out.println("Enter the amount spent for grocery per day:");
	 grocery=sc.nextDouble();
	 System.out.println("Enter the amount spent for electronics per day:");
	 electronics=sc.nextDouble();
	 System.out.println("Enter the amount spent for fuel per day:");
	 fuel=sc.nextDouble();
	}
	public void DailyExpensesCal()
	{
	 sum_dExp=grocery+ electronics+fuel;
	 avg_dExp_per_day= sum_dExp/3;
	 
	 //System.out.println(sum_dExp);
	 System.out.println("\nThe average daily household expenses expenditure of user is :"+String.format("%.2f",avg_dExp_per_day));
	
	}
	public double value()
	{
		 return sum_dExp;
	}
	public static void main(String[] args){
		DailyExpense d=new DailyExpense();
		d.getDetails();
		d.DailyExpensesCal();
		
	}
}
	 
	
	
	
	
	
	
	
	
	
	
	
