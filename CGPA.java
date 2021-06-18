import java.lang.*;
import java.util.*;
class Student{
	String reg_no;
	String name;
	int marks[];
	double cgpa;
	
	void getInput(){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter register no:		");
		reg_no=sc.next();
		System.out.println(" Enter name:");
		name=sc.next();
		System.out.println("Enter the marks for 5 subjects");
		marks=new int[5];
		for(int i=0;i<marks.length;i++)
		{
            marks[i]=sc.nextInt();	
		}
	}
	void print( )
	{
		System.out.println(name+"\t"+reg_no);
		for(int i=0;i<marks.length;i++)
		{
			System.out.println(marks[i]);	
		}
	}
	
	void calculateCGPA( )
	{
		int sum=0;
		double per;
		for(int i=0;i<marks.length;i++)
		{
			sum=sum+marks[i];	
		}
		per= (sum/5);
		cgpa= (per/9.5);
		System.out.println(cgpa);
		
	}

}
class CGPA{
	public static void main(String[] args)
	{
		Student s=new Student();
		s.getInput();
		s.print();
		s.calculateCGPA();	
	}
}
	