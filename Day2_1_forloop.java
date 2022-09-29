package Day2_Problems;
import java.util.Scanner;
public class Day2_1_forloop {


	public static void main(String[]args) {
		int n,sum=0;
		Scanner r=new Scanner(System.in);
	System.out.println("Enter the number ");
		n=r.nextInt();
		for(int i =1;i<=n;i++) {
		sum=sum+i;
		}
	System.out.println("Sum="+sum);
	     }
	}

