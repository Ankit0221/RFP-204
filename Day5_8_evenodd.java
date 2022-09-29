package Day5_problems;
import java.util.Scanner;
public class Day5_8_evenodd {

		public static void main(String[]args) {
			int n;
			System.out.println("Enter any no.=");
			Scanner f=new Scanner(System.in);
			n=f.nextInt();
			
			if (n%2==0) {
				System.out.println("Even ");
				}
			else {
				System.out.println("Odd ");
			}
		}
	}

