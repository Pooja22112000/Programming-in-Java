import java.lang.*;
import java.util.*;
class Clothing{
	int No_of_Cloths_purchased;
	double Amount_spent_on_purchase;
	Clothing(int p,double a)
	{
		No_of_Cloths_purchased=p;
		Amount_spent_on_purchase=a;
	}
	double Amount(int p,double a){
		double amountspent=p*a;
		System.out.println("The total amount spent on purchase is :"+amountspent);
		return amountspent;
	}
}
class AmountSpent{
	public static void main(String[] args)
	{
	System.out.println("A.POOJA -- 18MIS0232   :-)");
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number of clothes purchased");
		int p=sc.nextInt();
		System.out.println("Enter the amount spent on purchase");
		double a=sc.nextDouble();
		//Clothing c=new Clothing(2,36);
		//c.Amount();
		Clothing c=new Clothing(p,a);
		c.Amount(p,a);
	}
}