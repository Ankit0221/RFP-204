package Day2_Problems;
import java.util.Scanner;
public class Day2_3_operator {


		public static void main(String[] args) {
			System.out.println("quadratic equation= a*x*x + b*x + c"); 
			Scanner scan = new Scanner(System.in);
			System.out.println("enter the value of a =");
			int a = scan.nextInt();
			System.out.println("enter the value of b =");
			int b = scan.nextInt();
			System.out.println("enter the value of c =");
			int c = scan.nextInt();
		System.out.println(a+"*x*x "+ b + "*x+"+c);
		System.out.println("find the roots");
		int delta=b*b - 4*a*c;
		int root1 = (int) ((-b + Math.sqrt(delta))/(2*a));
		int root2 = (int) ((-b - Math.sqrt(delta))/(2*a));
				
		System.out.println("root1 of x = " + root1);
		System.out.println("root2 of x = " + root2);
		
		
		}

	}


