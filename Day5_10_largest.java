package Day5_problems;
import java.util.Scanner;
public class Day5_10_largest {

		public static void main(String[] args) {
			Scanner scan=new Scanner(System.in);
	  	System.out.println("Enter first number:");
	  	int a=scan.nextInt();
	  	System.out.println("Enter second number:");
	  	int b=scan.nextInt();
	  	System.out.println("Enter third number:");
	  	int c=scan.nextInt();

	  	if(a>b && a>c) {
		System.out.println("Largest number is"+a);
	  	}
	  	else if(b>a && b>c) {
	  		System.out.println("Largest number is"+b);
	  	}
	  	
	  	else
	  	{
	  		System.out.println("Largest number is"+c);
	  	
	  	
	  	
		}

	}
	}
