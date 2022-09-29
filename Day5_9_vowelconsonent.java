package Day5_problems;
import java.util.Scanner;
public class Day5_9_vowelconsonent {

			public static void main(String[] args) {
				String character;
				
				Scanner scan=new Scanner(System.in);
				System.out.println("Enter alphabet");
				character= scan.next();
				
				switch(character) {
				case "a":
				System.out.println("Vowel");
				break;
				
				case "e":
					System.out.println("Vowel");
				break;
				
				case "i":
					System.out.println("Vowel");
					break;
			
				case "o":
					System.out.println("Vowel");
					break;
				
					
				case "u":
					System.out.println("Vowel");
					break;
				default:
					
					System.out.println("Consonent");
				}

		}
		}
