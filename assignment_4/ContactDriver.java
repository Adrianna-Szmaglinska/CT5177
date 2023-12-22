package assignment_4;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

public class ContactDriver {
	public static void main(String[] args) {
		
		//Create a LinkedList with 4 contacts
		List<Contact> contactList = new LinkedList<>();
		
		contactList.add(new Contact("Jenn", 4895865));
		contactList.add(new Contact("Hugh", 5565656));
		contactList.add(new Contact("Anna", 35216878));
		contactList.add(new Contact("Elsa", 981638768));
		
		ListIterator<Contact> itr = contactList.listIterator(); 
		
		//Displaying list going forward
		System.out.println("Contact List - going forward:"); //+ contactList);
		while (itr.hasNext()) {
			Contact c = itr.next();
			System.out.println(c);
		}
		
		
		//Use ListIterator to go backwards
		System.out.println("\nContacts List - going backwards:");
		//ListIterator<Contact> backItr = contactList.listIterator(contactList.size());
		while (itr.hasPrevious()) {
			Contact c = itr.previous();
			System.out.println(c);
		}
		
		//Display the size
		System.out.println("\nContacts database has: " + contactList.size() + " entries.");
		
		//User input
		Scanner search = new Scanner(System.in);
		System.out.print("\nEnter the name of contact you wish to remove: ");
		String searchName = search.nextLine();
		
		//Use an enhanced for loop to search
		int index = -1;
		for (Contact c : contactList) {
			if (c.getName().equals(searchName)) {
				index = contactList.indexOf(c);
				break;
			}
		}
		
		//Close the scanner
		search.close();
		
		//remove contact if found
		if (index !=-1) {
			contactList.remove(index);
			System.out.println("Contact removed successfully.");
		
		//Use for loop to display the contents of list after removal
		System.out.println("\nThe list after removal: ");
		for (Contact contact : contactList) {
			System.out.println(contact);
		}
		
		System.out.println("\nContacts database now has: " + contactList.size() + " entries.");
		
		//If user input is not correct, do not change list 
		} else {
			System.out.println("\nContact not found. No changes have been made to the contact list.");
			System.out.println("Contacts database has: " + contactList.size() + " entries.");
		}
		
	}
}

