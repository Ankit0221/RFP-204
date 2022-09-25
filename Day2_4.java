//write a program to reverse the integer number usong while loop

package Day2problem;

import java.util.Scanner;

public class Day2_4 {
public static void main(String[]args) {
	
	Scanner scanner=new Scanner(System.in);
	System.out.println("Enter the number");
	int num= scanner.nextInt();
	 int reverse =0;
	 
	while(num>0) {
 int r =num%10;		
		reverse = reverse*10 +r;
		num=num/10;
	}
	
	System.out.println(reverse);
	
}
}

