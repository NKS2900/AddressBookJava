package com.org;

import java.util.Scanner;

public class Inputs {

	public static void main(String[] args) {

		AddressBook ab = new AddressBook();
		Scanner in = new Scanner(System.in);
		int input;
		String s;
		int ch;

		while (true) {
			System.out.println(" ");
			System.out.println("******WELCOME TO ADDRESS BOOK******");
			System.out.println("1. Add \n" + "2. Search \n"+"3. Display \n" + "4. Delete \n" + "5. Exit");
			System.out.println("Enter Your Choice:");
			input = in.nextInt();

			switch (input) {

			case 1:
				ab.addPerson();
				System.out.println("Details Added Successfully. \n");
				break;

			case 2:
				System.out.println("Enter Name to Search");
				s = in.nextLine();
				ab.searchPerson(s);
				break;

			case 3:
				System.out.println("--------------Address_Book-------------");
				ab.view();
				System.out.println("---------------------------------------");
				break;
				
			case 4:
				System.out.println("Enter Name to Delete");
				s = in.nextLine();
				ab.view();
				break;
				
			case 5:
				System.out.println("Enter Name to Delete");
				s = in.nextLine();
				ab.deletePerson(s);
				break;
			default:
				System.exit(0);
			}
		}
	}
}
