package Day9problems;

public class UserData {

	String FIRSTNAME;
	String LASTNAME;
	String ADDRESS;
	String CITY;
	String STATE;
	int ZIP;
    long PHONENUMBER;
    String EMAIL;
	public UserData(String firstName, String lastName, long phoneNumber, String emailID, String address,
			String cityName, String stateName, int zipCode) {

		this.FIRSTNAME = firstName;
		this.LASTNAME = lastName;
		this.ADDRESS = address;
		this.CITY = cityName;
		this.STATE = stateName;
		this.ZIP = zipCode;
		this.PHONENUMBER = phoneNumber;
	    this.EMAIL=emailID;
	}

	public String toString() {
		return "AddressBook ========  " +
      " first name ==" + FIRSTNAME +
	 " /n last name ==" + LASTNAME +
	 " /n address==" + ADDRESS +
	 " /n city==" + CITY +
	 " /n state==" + STATE +
	 " /n zip==" + ZIP+
	 " /n phonrnumber=="+ PHONENUMBER+
	 " /n email=="+EMAIL ;

	}

	    public void print() {
		System.out.println("First Name: " + FIRSTNAME + " \nLast Name: " + LASTNAME + " \nphone number: "
				+ PHONENUMBER + " \nEmail ID: " + EMAIL + " \nAddress: " + ADDRESS + " \nCity Name: " + CITY
				+ " \nState Name: " + STATE + " Zip Code: " + ZIP + "\n");

	}

}
