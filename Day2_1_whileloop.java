package Day2_Problems;
import java.util.Scanner;
public class Day2_1_whileloop {

	public static void main(String[]args) {
		Scanner scanner=new Scanner(System.in);
	 System.out.println("Enter the value");
		int n=scanner.nextInt();
		int i = 0;
		int sum = 0;
		while(i<=n) {
			sum =sum+i;
			i++;
			}
	System.out.println("sum of natural no." + sum );
	   }
	}

