package Day6problems;

import java.util.Scanner;

public class Day6_PerfectNumber {

	public static void main(String[] args) {
		int Perfect,sum=0;
  System.out.println("Enter a number ");
	Scanner sc= new Scanner(System.in);
	Perfect=sc.nextInt();
	 
	for(int i=1;i<Perfect;i++) {
		if (Perfect%i==0) {
	sum=sum+i;
		}
     }
       if(Perfect==sum)

	
	     System.out.print("perfect number");
        else
	     System.out.print("not perfect number");
	
	}
}