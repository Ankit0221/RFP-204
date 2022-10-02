package Day6problems;

import java.util.Scanner;

public class Day6_Fibonacciseries {

	public static void main(String[] args) {
		int Fibonacci,x=0,y=1,z;
		System.out.println("Enter the number to print Fibonacci series");
		Scanner sc= new Scanner(System.in);
		Fibonacci=sc.nextInt();
		for(int i=1;i<=Fibonacci;i++) {
			System.out.print(x+"  ");
		   z=x+y;
		   x=y;
		   y=z;
		}

	}

}
