package BothHouseholdAndInternet;

import java.util.*;
import java.lang.*;
import dailyExpense.DailyExpense;
import internetUsage.InternetUse;

public class Compute{
	double tot_exp;
	double household;
	double iinternet;
	public void MyDetails()
	{
		System.out.println("---------      A.POOJA    -------     -----------");
	}
	
	public void TotalExp()
	{
			DailyExpense dd=new DailyExpense();
			InternetUse ii=new InternetUse();
			household=dd.value();
			//System.out.println(household);
			iinternet=ii.value1();
			//System.out.println(iinternet);
			tot_exp=household+iinternet;
			System.out.println("The average Total Expenditure of user combining both household and Internet Usage for a day is:"+String.format("%.2f",tot_exp));
	}
	
	public static void main(String[] args)
	{
			Scanner sc=new Scanner(System.in);
	        int size=5;
			DailyExpense d=new DailyExpense();
			InternetUse i=new InternetUse();
			Compute c=new Compute();
			c.MyDetails();
		    for(int x=1; x<=5; x++)
			{
				switch(x)
				{
					case 1:
					System.out.println("\t \t Enter details for 1st user");
					d.getDetails();
					i.getDetail();
					d.DailyExpensesCal();
					i.internetCalculation();
					c.TotalExp();
					System.out.println("Details of user"+x +"is Done\n");
					break;
					case 2:
					System.out.println("Enter details for 2nd  user");
					d.getDetails();
					i.getDetail();
					d.DailyExpensesCal();
					i.internetCalculation();
					c.TotalExp();
					System.out.println("Details of user"+x +"is Done\n");
					break;
					case 3:
					System.out.println("Enter details for 3rd user");
					d.getDetails();
					i.getDetail();
					d.DailyExpensesCal();
					i.internetCalculation();
					c.TotalExp();
					System.out.println("Details of user"+x +"is Done\n");
					break;
					case 4:
					System.out.println("Enter details for 4rth user");
					d.getDetails();
					i.getDetail();
					d.DailyExpensesCal();
					i.internetCalculation();
					c.TotalExp();
					System.out.println("Details of user"+x +"is Done\n");
					break;
					case 5:
					System.out.println("Enter details for 5th user");
					d.getDetails();
					i.getDetail();
					d.DailyExpensesCal();
					i.internetCalculation();
					c.TotalExp();
					System.out.println("Details of user"+x +"is Done\n");
					break;
				}
			}
			
	}
}
					
					
					
				
				
			
		
		

