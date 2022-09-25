//write a program for the sum of n natural no.using forloop

package Day2problem;

import java.util.Scanner;

public class Day2_5 {
public static void main(String[]args) {
	int n,sum=0;
	Scanner scanner=new Scanner(System.in);
System.out.println("Enter the number ");
	n=scanner.nextInt();
	for(int i =1;i<=n;i++) {
	sum=sum+i;
	}
System.out.println("Sum="+sum);
     }
}
