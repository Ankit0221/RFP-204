package Day2_Problems;

import java.util.Scanner;

public class Day2_2_Ifelse {

	public static void main(String[] args) {
		Scanner shubh=new Scanner(System.in);
				int thousands =0;
		
				int hundreds =0;
		int tens=0;
		int units=0;
		System.out.println("Enter 4 digit number");
		int number = shubh.nextInt();
		if (number<=9999 && number>999) {
			thousands = number /1000;
		System.out.println("thousands place digit="+thousands);	
		
		hundreds = (number / 100)%10;
		System.out.println("hundreds place digit="+hundreds);	
		
		tens = (number / 10)%10;
		System.out.println("tens place digit="+tens);	
		
		units = (number %10);
		System.out.println("units place digit="+units);	
		}
		else {
			if (number>9999)
		System.out.println("please enter valid digits");
			if (number<1000)
				System.out.println("enter 4 digit number");
		
		
		
		
		}

	}

}
