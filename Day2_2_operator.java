package Day2_Problems;

import java.util.Scanner;
public class Day2_2_operator {
    public static void main(String[] args) {
        int M; 
        int d; 
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter month number:- ");
        M = sc.nextInt();
        System.out.println("Enter Day:- ");
        d = sc.nextInt();

        boolean isSpringSeason = (M == 3 && d >= 20 && d <= 31) ||
        		                 (M == 4 && d >= 1 && d <= 30) ||
        	                   	 (M == 5 && d >= 1 && d <= 31) ||
        		                 (M == 6 && d >= 1 && d <= 20);
        System.out.println(isSpringSeason);
    }
}