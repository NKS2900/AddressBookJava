package AddressArrayList;

class UserInfo {

	String firstName;
	String lastName;
	String address;
	String phoneNumber;
	String state;
	String zip;

	UserInfo(String firstName, String lastName, String address, String phoneNumber, String state, String zip) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
		this.phoneNumber = phoneNumber;
		this.state = state;
		this.zip = zip;

	}

	public void print() {
		
		System.out.println(firstName + " \t  " + lastName +
				  " \t  " + address + " \t  " + state + " \t   " +
				  phoneNumber + " \t " + zip);
	}
}
