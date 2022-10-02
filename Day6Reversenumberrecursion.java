package Day6problems;

import java.util.Scanner;

public class Day6Reversenumberrecursion {

	public static void reverse(int number) {
		
		       if (number < 10) {
			   System.out.println(number);
			   return;
		       }
		       else {
		           System.out.print(number % 10);
		           reverse(number/10);
		       }
		   }
		   public static void main(String args[])
		   {
			int num=0;
			System.out.println("Enter the  number : ");
			Scanner in = new Scanner(System.in);
			num = in.nextInt();
			System.out.print("Reverse number is:");
			reverse(num);
			System.out.println();
		   }
		
	}


