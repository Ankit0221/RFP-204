package Day6problems;

import java.util.Scanner;

public class Day6_Primenumber {



			public static void main(String[] args) {
				int Prime,count=0;
		  System.out.println("Enter a number ");
			Scanner sc= new Scanner(System.in);
			Prime=sc.nextInt();
			 
			for(int i=1;i<=Prime;i++) {
				if (Prime%i==0) {
			count++;
				}
		     }
		       if(count==2)
                 System.out.print("prime number");
		        else
			     System.out.print("not prime number");
			
		}
} 	
