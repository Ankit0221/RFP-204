package Day5_problems;
import java.util.Scanner;
public class Day5_5_factors {
	

	   public static void main(String args[]){
	      int input;
	      Scanner sc = new Scanner(System.in);
	      System.out.println("Enter value ::");
	      input = sc.nextInt();
	     
	      for(int i = 2; i< input; i++) {
	         while(input%i == 0) {
	            System.out.println(i+" ");
	            input = input/i;
	         }
	      }
	      if(input >2) {
	         System.out.println(input);
	      }
	   }
}