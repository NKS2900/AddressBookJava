package com.org;

import java.util.ArrayList;
import java.util.Scanner;

public class AddressBook {

	ArrayList persons;
	AddressBook ad;
	UserInfo user;

	public AddressBook() {
		persons = new ArrayList();
	}

	public void addPerson() {
		Scanner scan = new Scanner(System.in);
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

		user = new UserInfo(firstName, lastName, address, phoneNumber, state, zip);
		persons.add(user);
	}

	public void searchPerson(String n) {
		for (int i = 0; i < persons.size(); i++) {
			UserInfo p = (UserInfo) persons.get(i);

			if (n.equals(p.getFirstName())) {
				ad.view();// p.print();
			} else {
				System.out.println("Name Not Found !!!");
			}
		}
	}

	public void view() {
		System.out.println("FirstName    LastName     City     State   Contact      Zip");
		for (int i = 0; i < persons.size(); i++) {

			System.out.println(user.getFirstName() + " \t  " + user.getLastName() + " \t  " + user.getAddress()
					+ " \t  " + user.getState() + " \t   " + user.getPhoneNumber() + " \t " + user.getZip());
		}
	}

	public void deletePerson(String n) {
		for (int i = 0; i < persons.size(); i++) {
			UserInfo p = (UserInfo) persons.get(i);
			if (n.equals(p.firstName)) {
				persons.remove(i);
				System.out.println("User Removed Successfully");
			} else {
				System.out.println("Name Not Found !!!");
			}
		}
	}
}
