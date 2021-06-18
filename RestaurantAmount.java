import java.lang.*;
import java.util.*;
class Restaurant{
	int No_of_days_for_food;
	int No_of_days_for_stay;
	double Amount_spent_for_food;
	double Amount_spent_for_stay;
	Restaurant(int p,int q,double a,double b)
	{
		 No_of_days_for_food=p;
	     No_of_days_for_stay=q;
	     Amount_spent_for_food=a;
	     Amount_spent_for_stay=b;
	}
	double Amount_spent_on_restaurant(int p,int q,double a,double b){
		double amountspent=p*a+q*b;
		System.out.println("The total amount spent on  restaurant is :"+amountspent);
		return amountspent;
	}
}
class RestaurantAmount{
	public static void main(String[] args)
	{
	System.out.println("A.POOJA -- 18MIS0232   :-)");
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number of days for food");
		int g=sc.nextInt();
		System.out.println("Enter the Number of days for stay");
		int h=sc.nextInt();
		System.out.println("Enter the amount spent for food");
		double i=sc.nextDouble();
		System.out.println("Enter the amount spent for stay");
		double j=sc.nextDouble();
		
		Restaurant r=new Restaurant(g,h,i,j);
		r.Amount_spent_on_restaurant(g,h,i,j);
	}
}