package Day9problems;

import java.util.Scanner;

public class Day9AddressBookuc4 {

	public static void main(String[] args) {
		System.out.println("Welcome to Address Book");
		Day9AddressBookuc1 contact = new Day9AddressBookuc1();
		String name;
		int choice;
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println(
					"Enter 1 to Add Contact " + 
			"\nEnter 2 To Show Added Contacts " +
			"\nEnter 3 to edit contact"+
			"\nEnter 4 to delete contact");
			choice = sc.nextInt();
			switch (choice) {
			case 1:
				contact.addUser();
				System.out.println();
				System.out.println("Added Successfully");
				System.out.println();
				break;

			case 2:

				contact.display();
				break;
			case 3:
				contact.edit();
				break;
			case 4:
				contact.delete();
				break;
				default:
				System.out.println("You have Entered Wrong Choice ");
			}
		}

	}
}
