//matrix add checking type of given matrix ,subtraction,multiplication with switch,do while, and for loop
import java.lang.*;
import java.util.*;
public class MatrixSwitch{
	public static void main(String[] args){
		System.out.println("A.POOJA 18MIS0232");
		int p,q,m,n; 
		Scanner input=new Scanner(System.in);
			System.out.println("Enter the number of rows in matrix 1");
			p=input.nextInt();
			System.out.println("Enter the number of columns in matrix 1");
			q=input.nextInt();
			System.out.println("Enter the number of rows in matrix 2");
			m=input.nextInt();
			System.out.println("Enter the number of columns in matrix 2");
			n=input.nextInt();
		int r; 
		int a[][]=new int[p][q];
		int b[][]=new int[m][n];
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the values of first matrix:");
		for(int i=0;i<p;i++){
			for(int j=0;j<q;j++){
			a[i][j]=s.nextInt();	
			}
		}
		System.out.println("The values of first matrix:");
		for(int i=0;i<p;i++){
			for(int j=0;j<q;j++){
				System.out.print(a[i][j]+"\t");
			}
			System.out.println(" ");
		}
		
		System.out.println("Enter the values of second matrix:");
		for(int i=0;i<m;i++){
			for(int j=0;j<n;j++){
			b[i][j]=s.nextInt();	
			}
		}
		System.out.println("The values of second matrix:");
         for(int i=0;i<m;i++){
			for(int j=0;j<n;j++){
				System.out.print(b[i][j]+"\t");
			}
			System.out.println("");
		} 
		do{
		System.out.println("Enter your choice number....... \n 1.Matrix addition \n 2.Checking the type of given matrix \n 3.Matrix Subtraction \n 4.Matrix Multiplication");	
		Scanner sc=new Scanner(System.in);
		int u=sc.nextInt(); 
		
		int c[] [] =new int[p][n];	
		switch(u)
		{
			case 1:
			System.out.println("Matrix Addition");
			 if (p == m && q == n){
			for(int i=0;i<p;i++){
				for(int j=0;j<n;j++){
					for(int k=0;k<q;k++){
						c[i][j]=a[i][j]+b[i][j];
					}
				}
			}
			for(int i=0;i<p;i++){
				for(int j=0;j<n;j++){
					System.out.print(c[i][j]+"\t");
				}
				System.out.println();
			}
			}
			else{
				System.out.println("Incompatible dimensions of matrix  \n Cannot perform the operation");
			}
			break;
			case 2:
			System.out.println("Finding the Type of matrix");
			   if (p == 0 && q == 1) 
                System.out.println("Matrix 1 is Column Matrix" ); 
                else if (p == 1 && q == 0) 
                System.out.println("Matrix 1 is Row Matrix" );
                else if (p < q) 
                System.out.println("Matrix 1 is Horizontal Matrix"); 
                else if (p > q) 
                System.out.println("Matrix 1 is Vertical Matrix");  
                else if (p == q) 
                System.out.println("Matrix 1 is Square Matrix"); 
               
			    if (m == 0 && n == 1) 
                System.out.println("Matrix 2 is Column Matrix" ); 
                 else if (m == 1 && n == 0) 
                System.out.println("Matrix 2 is Row Matrix" );
                else if (m < n) 
                System.out.println("Matrix 2 is Horizontal Matrix"); 
                else if (m > n) 
                System.out.println("Matrix 2 is Vertical Matrix");  
                else if (m == n) 
                System.out.println("Matrix 2 is Square Matrix"); 
			break;
			case 3:
			System.out.println("Matrix Subtraction");
			    if(p==m && q==n){
			       for(int i=0;i<p;i++){
				      for(int j=0;j<n;j++){
					     for(int k=0;k<q;k++){
						     c[i][j]=a[i][j]-b[i][j];
					        }
				        }
			        }
			    for(int i=0;i<p;i++){
				    for(int j=0;j<n;j++){
					   System.out.print(c[i][j]+"\t");
				    }
				     System.out.println();
			      }
			    }
			    else{
				  System.out.println("Incompatible dimensions of matrix  \n Cannot perform the operation");
			    }
			break;
			case 4:
			     System.out.println("Matrix Multiplication");
			    if(q==m){
			        for(int i=0;i<p;i++){    
                         for(int j=0;j<n;j++){    
                           c[i][j]=0;      
                           for(int k=0;k<q;k++){      
                              c[i][j]+=a[i][k]*b[k][j];      
                             } 
                            System.out.print(c[i][j]+" ");    
                           }  
                         System.out.println();   
                        }    
			        }
			    else{
				     System.out.println("Incompatible dimensions of matrix  \n Cannot perform the operation");
			    }
			  break;
			default:
			System.out.println("Invalid Choice Number");	
		}	
		System.out.println("Do you want to continue to perform other operations hit 9");
		}while(int w==9);	
	}
 }

