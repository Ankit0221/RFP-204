package Day5_problems;
import java.util.Scanner;
public class Day5_3_poweroftwo {

		static int p;
		public static void main(String[] args) {
			int n = 2;
			int result =1;
			System.out.println("Enter a power: ");
			Scanner sc = new Scanner(System.in);
			p = sc.nextInt();
			
			if(p >= 0 && p <= 31) 
			{
				System.out.println("calcuating a power");
			}
			else
			{
				System.out.println("please enter the power below 31");
			}
			for(int i=1; i<=p; i++)
			{
				result=n*result;
				}
			System.out.println("Power: "+result);
			}
		}