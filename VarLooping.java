//java program to print loop variable count on each iteration using switch case
import java.lang.*;
import java.util.*;
public class VarLooping{
    public static void main(String[] args){
	for( int i=0;i<7;i++)
	{
	 switch(i)
	 {	 
		case 0:
		System.out.println("i is zero");
		break;
		case 1:
		System.out.println("i is one");
		break;
		case 2:
		System.out.println("i is two");
		break;
		case 3:
		System.out.println("i is three");
		break;
		case 4:
		System.out.println("i is four");
		break;
		default:
		System.out.println("i is greater than 4");
	 }
	}
	}
}
