package Day3Array;

import java.util.Scanner;

public class Day3Array_3 {

	public static void main(String[] args) {
		int number[],size,large;
		try (Scanner shubh = new Scanner(System.in)) {
			System.out.println("Enter size of array:");
			size=shubh.nextInt();
			
			number =new int[size];
			
			System.out.println("Enter elements of array:");
			for (int j=0;j<number.length;j++) {
				number[j]=shubh.nextInt();
				
			}
		}
		
large=number[0];
	for(int j=1;j<number.length;j++) {
		if (large<number[j]) {
			large=number[j];
		}
	}
	
	System.out.println("Largest value is="+large);
	
	}
}