package Day5_problems;
import java.util.Scanner;
public class Day5_functional_2Darray {

	    public static void main(String args[]){
	        
	       System.out.print("Enter array size : ");
	       Scanner sc=new Scanner(System.in);
	       int Mrows=sc.nextInt();
	       int Ncolumns=sc.nextInt();
	       
	       System.out.println("Enter array elements : ");    
	        
	       int twoD[][]=new int[Mrows][Ncolumns];
	        
	          
	        for(int i=0; i<Mrows;i++)
	         {            
	            for(int j=0; j<Ncolumns;j++)
	            {
	                twoD[i][j]=sc.nextInt();
	            }
	         }
	        System.out.print("\nMatrix : \n");
	        for(int []x:twoD){
	            for(int y:x){
	            System.out.print(y+"        ");
	            }
	            System.out.println();
	        }
	        
	    }  
	    
	}
