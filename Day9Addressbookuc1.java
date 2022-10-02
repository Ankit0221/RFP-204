package Day9problems;

import java.util.Scanner;

public class Day9Addressbookuc1 {
	public static void main(String[]args) {
	
	String firstName;
	String lastName;
	String address;
	String city;
	String state;
	String email;
    Long   phoneNumber;
	String information;
	int zip;
	Scanner sc= new Scanner(System.in);
	
	System.out.println("Enter your first name");
	firstName= sc.nextLine();
	System.out.println("Enter your last name");
     lastName= sc.nextLine();
     System.out.println("Enter your address");
	address= sc.nextLine();
	System.out.println("Enter your city");
	city= sc.nextLine();
	System.out.println("Enter your state");
	state= sc.nextLine();
	System.out.println("Enter your email");
	email= sc.nextLine();
	System.out.println("Enter your zip code");
	zip= sc.nextInt();
	System.out.println("Enter your phonenumber");
	phoneNumber=sc.nextLong();
	
	information= String.format("firstName:%10s\n", firstName);
	information+= String.format("lastName:%10s\n", lastName);
	information+= String.format("address:%10s\n", address);
	information+= String.format("city:%10s\n", city);
	information+= String.format("state:%10s\n", state);
	information+= String.format("email:%10s\n", email);
	information+= String.format("phoneNumber:%10s\n", phoneNumber);
	information+= String.format("zip code:%10s\n", zip);
	System.out.println(information);
	}
}
