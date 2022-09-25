//write a program for the sum of n natural no. using while loop

package Day2problem;

import java.util.Scanner;

public class Day2_3 {
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
