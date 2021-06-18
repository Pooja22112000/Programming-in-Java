import java.lang.*;
import java.io.*;

public class Lab3{
	public static void main(String[] args) throws IOException{
		
		System.out.println("A.POOJA --- 18MIS0232\n");
		int i,j;
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String s;
		s=br.readLine();
		
		int f[]=new int[s.length()];
		char c[]=s.toCharArray();
		
		//Identify space and Uppercase letters and replace them with 1
		//s=s.toLowerCase();
		String s1=s.replace(" ","1");
		System.out.println("\nThe space replaced by 1 \n new String is given by: \n\n"+s1);
		
		//count the each occurence of insertion
		for( i=0; i<s.length();i++)
		{ 
            f[i] = 1;    
            for( j = i+1; j <s.length(); j++) {    
                if(c[i] == c[j]) {    
                    f[i]++;    
                     
                    c[j] = '0';    
                }    
            }    
        }    
		 for(i = 0; i <f.length; i++) {    
            if(c[i]==' ')  
                System.out.println("\n The count of number of spaces we inserted the 1 the number of times is "+f[i]);
		 }
		
		
		
		
		//replace upper letter with 1
		StringBuffer s2=new StringBuffer(s1);    
            
        for(i = 0; i < s1.length(); i++) {    
            if(Character.isUpperCase(s1.charAt(i))) {    
                    
                s2.setCharAt(i,'1');    
            }    
        }    
        System.out.println("\n String after upper case replacement with 1 :\n\n " + s2.toString()); 
		String fs=s2.toString();
		
		System.out.println("The final output is : \n\n\n");
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));

		bw.write(fs);
		bw.flush();
		bw.close();
		
		
		
	}
}