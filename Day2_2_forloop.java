package Day2_Problems;
import java.util.Scanner;
public class Day2_2_forloop {


		public  static void  main(String[]args) {
		Scanner scan =new Scanner(System.in);
			System.out.println("Enter the value :  ");
			int num = scan.nextInt();
			
		int sum =0;
		
		for (  ;num > 0; num=num/10 )
		{
			int r = num % 10;
			sum= sum * 10 + r;
			
		}
	System.out.println(sum);
	    }
	}

