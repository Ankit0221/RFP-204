package Day2_Problems;
import java.util.Scanner;
public class Day2_1_Ifelse {
	
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a number: ");
	int n = sc.nextInt();
	int n1 = n, n2 = n;
	int b = n1 % 10 , a = n2 / 10;
	String[] single_digits = new String[]{"zero" , "one" , "two" , "three" , "four" , "five" , "six" , "seven" , "eight" , "nine"};
	String[] two_digits = new String[]{"ten" , "eleven" , "twelve" , "thirteen" , "fourteen" , "fifteen" , "sixteen" , "seventeen" , "eighteen" , "nineteen"};
	String[] tens_digits = new String[]{"" , "" , "twenty" , "thirty" , "fourty" , "fifty" , "sixty", "seventy" , "eighty" , "ninety"};
	if(a == 1){
	System.out.println(two_digits[b]);
	}
			        else if(b == 0)
			            System.out.println(tens_digits[a]);
			        else
			            System.out.println(tens_digits[a] + "-" + single_digits[b]);


			    }
			

		}



	
	
	
	
	
	
	
	
	
	
	
	
	

