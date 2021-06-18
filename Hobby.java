//java program to print the hobby of a person.
import java.lang.*;
import java.util.*;
public class Hobby{
	public static void main(String[] args){
		
		System.out.println("Enter Your Hobby:");
		System.out.println("eg..Programming,Singing,Dancing,Reading,Movies\n");
		Scanner sc=new Scanner(System.in);
		String hobby;
		hobby=sc.next();
		hobby=hobby.toLowerCase();
		String lang;
		Scanner s=new Scanner (System.in);
		lang=s.next();
		lang=lang.toLowerCase();
		switch(hobby){
			case "singing":
			System.out.println("Hobby: Singing");	
			System.out.println("Expert");
			break;
			case "reading":
			System.out.println("Hobby: Reading");	
			System.out.println("Expert");
			break;
			case "dancing":
			System.out.println("Hobby: Dancing");	
			System.out.println("Expert");
			break;
			case "movies":
			System.out.println("Hobby: Movies");	
			System.out.println("Expert");
			break;
			case "programming":
			System.out.println("Hobby: Programming");
			//System.out.println("Choose your Programming Language");
			//System.out.println("eg...C C++ Java");
			switch(lang){
				case "c":
				System.out.println("Programming language: C");
				System.out.println("Inventor : Dennis Ritchie");
				break;
				case "c++":
				System.out.println("Programming language: C++");
				System.out.println("Inventor : Bjarne Stroustrup");
				break;
				case "java":
				System.out.println("Programming language: Java");
				System.out.println("Inventor : Green Team, James Gosling");
				break;			
			}
			break;
			default:
			System.out.println("Enter your Hobby:");	
			hobby=sc.next();
			System.out.println("Expert");	
		}
	}
}
