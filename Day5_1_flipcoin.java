package Day5_problems;
import java.util.Scanner;
public class Day5_1_flipcoin {


		public static void main(String[] args) {
		int heads=0;
		int tails=0;
		int count=0;
		double random=0.0;
		
		System.out.println("please enter the number = ");
		Scanner scan = new Scanner(System.in);
		int flips =scan.nextInt();
		while(count <= flips) {
			random=Math.random();
			System.out.println(count+" "+random);
			if (random<0.5) {
				heads++;
				System.out.println(" HEADS ");
					}
			else {
				tails++;
				System.out.println(" TAILS ");
				}
		count++;
		}
	System.out.println();
	System.out.println("Number of HEADS :" +heads);
	System.out.println("Number of TAILS :" +tails);

	double headpercent=(double)heads/flips*100;

	double tailpercent=(double)tails/flips*100;

	System.out.println("percent of HEADS :" +headpercent);
	System.out.println("percent of TAILS :" +tailpercent);




	}
	}
