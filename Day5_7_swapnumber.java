package Day5_problems;
import java.util.Scanner;
public class Day5_7_swapnumber {

		public static void main(String[] args) {
			int a,b,func;
			System.out.println("Enter two numbers");
	Scanner shubh=new Scanner(System.in);
	a=shubh.nextInt();
	b=shubh.nextInt();
	System.out.println("before swap "+a+" "+b);
	func=a;
	a=b;
	b=func;

	System.out.println("after swap "+a+" "+b);

		}

	}

