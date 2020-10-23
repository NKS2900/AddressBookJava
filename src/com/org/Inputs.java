package com.org;

import java.util.Scanner;

public class Inputs {

	public static void main(String[] args) {

		AddressBook ab = new AddressBook();

		String input, s;
		int ch;

		while (true) {
			System.out.println(" ");
			System.out.println("******WELCOME TO ADDRESS BOOK******");
			Scanner scan = new Scanner(System.in);
			System.out.println("1. Add \n" + "2. Search \n"+"3. Display " + "4. Delete \n" + "5. Exit");
			System.out.println("Enter Your Choice:");
			input = scan.nextLine();
			ch = Integer.parseInt(input);

			switch (ch) {

			case 1:
				ab.addPerson();
				System.out.println("Details Added Successfully. \n");
				break;

			case 2:
				System.out.println("Enter Name to Search");
				s = scan.nextLine();
				ab.searchPerson(s);
				break;

			case 3:
				System.out.println("Enter Name to Delete");
				s = scan.nextLine();
				ab.view();
				break;
				
			case 4:
				System.out.println("Enter Name to Delete");
				s = scan.nextLine();
				ab.deletePerson(s);
				break;
			default:
				System.exit(0);
			}
		}
	}
}
