package com.org;

public class UserInfo 
{

	String firstName;
	String lastName;
	String address;
	String phoneNumber;
	String state;
	String zip;
	
	UserInfo(String firstName , String lastName , String address , String phoneNumber , String state , String zip){
		this.firstName=firstName;
		this.lastName = lastName;
		this.address = address;
		this.phoneNumber = phoneNumber;
		this.state = state;
		this.zip = zip;
		
	}
	public void print() 
	{
		System.out.println(" ");
		System.out.println("Firstname : " + firstName + "\nLastName : " + lastName + "\nAddress : " + address + "\nPhoneNumber : " + phoneNumber + "\nState : " + state + "\nZip Code : " + zip );
	}
}