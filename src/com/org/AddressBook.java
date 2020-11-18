package AddressArrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

class AddressBook {

	ArrayList persons;
	Scanner scan = new Scanner(System.in);

	public AddressBook() {
		persons = new ArrayList();
	}

	public void addPerson() {

		System.out.println("Enter First Name: ");
		String firstName = scan.nextLine();
		System.out.println("Enter Last Name: ");
		String lastName = scan.nextLine();
		System.out.println("Enter Address: ");
		String address = scan.nextLine();
		System.out.println("Enter Phone Number: ");
		String phoneNumber = scan.nextLine();
		System.out.println("Enter State: ");
		String state = scan.nextLine();
		System.out.println("Enter zip code: ");
		String zip = scan.nextLine();

		UserInfo p = new UserInfo(firstName, lastName, address, phoneNumber, state, zip);
		persons.add(p);
		p.print();
	}

	public void searchPerson() {
		System.out.println("Enter Name to Search");
		String s = scan.nextLine();
		for (int i = 0; i < persons.size(); i++) {
			UserInfo p = (UserInfo) persons.get(i);

			if (s.equals(p.firstName)) {
				p.print();
				break;
			} else {
				System.out.println("Name Not Found !!!");
			}
		}
	}

	public void view() {

		System.out.println("FirstName    LastName     City     State   Contact      Zip");
		for (int i = 0; i < persons.size(); i++) {
			UserInfo p = (UserInfo) persons.get(i);
			p.print();
		}

	}

	public void deletePerson() {
		System.out.println("Enter Name to Delete");
		String s = scan.nextLine();
		for (int i = 0; i < persons.size(); i++) {
			UserInfo p = (UserInfo) persons.get(i);
			if (s.equals(p.firstName)) {
				persons.remove(i);
				System.out.println("User Removed Successfully");
				break;
			} else {
				System.out.println("Name Not Found !!!");
			}
		}
	}
}
