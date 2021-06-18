package internetUsage;
import java.lang.*;
import java.io.*;
import java.util.*;

public class InternetUse{
	double dataplan;
	double dataplan_cost;
	double internet_usage_per_hour;
	double internet_usage_per_day;
	int mobilebattery;
	int no_of_times_charged_mobile;
	int no_of_units_consumed;
	double InternetUsage_cal;
	double avg_usage;
    int no_of_hours_used;
	double cost_for_unit;
	double unit_consumption_cost;
	public static double avg_req_a_day;
	double cost_for_used_data;
	
	Scanner sc=new Scanner(System.in);
	
	public void getDetail()
	{
		System.out.println("\t \t -------- Internet Related Details --------");
		
		System.out.println("Enter your dataPlan ");
		dataplan=sc.nextDouble();
		System.out.println("Enter the amount spent for dataplan (COST)");
		dataplan_cost=sc.nextDouble();
		System.out.println("Enter the number of hours mobile used");
		no_of_hours_used=sc.nextInt();
		System.out.println("Enter your internet usage per hour:");
		internet_usage_per_hour=sc.nextDouble();
		System.out.println("Enter the number of times you charge your phone:");
		no_of_times_charged_mobile=sc.nextInt();
		System.out.println("Enter the cost for 1 unit of electricity");
		cost_for_unit=sc.nextDouble();
		System.out.println("Enter the number of units consumed for charging phone:");
		no_of_units_consumed=sc.nextInt();
		
	}
	public void internetCalculation()
	{
		
		internet_usage_per_day= no_of_hours_used *internet_usage_per_hour;
		System.out.println("\nAs per the details given by you based on usage per hour the dataplan needed for a day is "+internet_usage_per_day);
		
		
		 cost_for_used_data=(internet_usage_per_day * dataplan_cost) /dataplan;
		InternetUsage_cal= dataplan - (internet_usage_per_hour * no_of_hours_used);
		System.out.println("The internet remaining from dataplan is :"+InternetUsage_cal);
		
		
		if(InternetUsage_cal<0)
		{
			System.out.println("Your daily internet usage exceeds the dataplan must have had an additional datapackage \n ");
		}
		avg_usage=((no_of_hours_used*100)/24);
		System.out.println("The average time you spend on internet is "+avg_usage+ "% i.e,"+ avg_usage+ " part of a day");
		
		unit_consumption_cost= no_of_units_consumed*cost_for_unit;
		
		avg_req_a_day=cost_for_used_data+unit_consumption_cost;
		System.out.println("The cost required for internet usages a day is "+String.format("%.2f",avg_req_a_day));
		
	}
	public double value1()
	{
		return avg_req_a_day;
	}
	public static void main(String[] args)
	{
		InternetUse i= new InternetUse();
		i.getDetail();
		i.internetCalculation();
	}
	
}
		
		
		
	
	
	
	
	
	
	
	