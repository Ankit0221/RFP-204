package Day9problems;

import java.util.ArrayList;
import java.util.Scanner;

public class Day9AddressBookuc1 {

	ArrayList<UserData> userData = new ArrayList<>();
	Scanner sc = new Scanner(System.in);

	public void addUser() {
		Scanner sc = new Scanner(System.in);
		System.out.println();
		System.out.print("Enter First Name: ");
		String FIRSTNAME = sc.next();

		System.out.print("Enter Last Name: ");
		String LASTNAME = sc.next();

		System.out.print("Enter phonenumber Number: ");
		long PHONENUMBER = sc.nextLong();

		System.out.print("Enter Email_ID: ");
		String EMAILID = sc.next();

		System.out.print("Enter Address: ");
		String ADDRESS = sc.next();

		System.out.print("Enter City Name: ");
		String CITY = sc.next();

		System.out.print("Enter StateName: ");
		String STATE = sc.next();

		System.out.print("Enter Zip Code: ");
		int ZIP = sc.nextInt();

		UserData data = new UserData(FIRSTNAME, LASTNAME, PHONENUMBER, EMAILID, ADDRESS, CITY, STATE, ZIP);
		userData.add(data);

	}

	public void display() {
		System.out.println(userData.size());
		if (userData.size() == 0) {
			System.out.println("Empty Address Book ");
			System.out.println();
		} else {
			for (int i = 0; i < userData.size(); i++) {
				UserData data = (UserData) userData.get(i);
				System.out.println(userData.get(i));
				System.out.println(" ");
			}
		}
	}
	public void edit() {
        System.out.println("Enter First And Last Name to Update details ");
        String first_name = sc.next();
        String last_name = sc.next();

        for (int i = 0; i < userData.size(); i++) {
            UserData data = userData.get(i);

            if (first_name.equals(data.FIRSTNAME) && last_name.equals(data.LASTNAME)) {
                System.out.println("Enter Choice to Update\nEnter 1 for Update Address\n Enter 2 for contact Number \n " + "Enter 3 for Email adderss ");
                int choice =  sc.nextInt();

                switch (choice) {
                    case 1:
                        System.out.print("Enter Address: ");
                        String Address = sc.next();

                        System.out.print("Enter City Name: ");
                        String City = sc.next();

                        System.out.print("Enter State: ");
                        String State = sc.next();

                        System.out.print("Enter postal code(Zip Code): ");
                        int zip = sc.nextInt();
                        break;

                    case 2:
                        System.out.print("Enter Contact Number: ");
                        long newphoneNumber = sc.nextLong();
                        break;

                    case 3:
                        System.out.print("Enter Email ID: ");
                        String newEmail = sc.next();
                        break;
                }

                
            }
            else
                System.out.println("No record Found ");
        }
        System.out.println();
	}
        public void delete() {
            if (userData.size() == 0) {
                System.out.println("Empty Address Book");
            }

            else {
                System.out.print("ENter First Name to delete Contact from addressBook: ");
                String first_name =  sc.next();
                for (int i = 0; i < userData.size(); i++) {
                    UserData data = userData.get(i);
                    if (first_name.equals(data.FIRSTNAME)) {
                        userData.remove(i);
                        System.out.println("Contact Delete SuccessFully");
                    }
                }
            }
        
	}
}

