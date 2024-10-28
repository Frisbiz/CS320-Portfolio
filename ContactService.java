// Author: Faris Malik
// Date: October 12, 2024
// Course: CS-320
// Description: This class represents the ContactService, which manages a collection 
//              of Contact objects. It provides methods for adding, updating, and 
//              deleting contacts while enforcing validation rules to maintain data 
//              integrity and unique contact identifiers.

package Contact;

import java.util.ArrayList;

public class ContactService {
    // List to hold all contacts
    public ArrayList<Contact> contactList = new ArrayList<Contact>();

    // Displays the full list of contacts to the console for error checking
    public void displayContactList() {
        for (int counter = 0; counter < contactList.size(); counter++) {
            System.out.println("\t Contact ID: " + contactList.get(counter).getContactID());
            System.out.println("\t First Name: " + contactList.get(counter).getFirstName());
            System.out.println("\t Last Name: " + contactList.get(counter).getLastName());
            System.out.println("\t Phone Number: " + contactList.get(counter).getNumber());
            System.out.println("\t Address: " + contactList.get(counter).getAddress() + "\n");
        }
    }

    // Adds a new contact to the list using the Contact constructor
    public void addContact(String firstName, String lastName, String number, String address) {
        Contact contact = new Contact(firstName, lastName, number, address);
        contactList.add(contact);
    }

    // Returns a contact object matching the given Contact ID
    // If not found, returns a contact object with default values
    public Contact getContact(String contactID) {
        Contact contact = new Contact(null, null, null, null);
        for (int counter = 0; counter < contactList.size(); counter++) {
            if (contactList.get(counter).getContactID().contentEquals(contactID)) {
                contact = contactList.get(counter);
                break; // Exit loop upon finding the contact
            }
        }
        return contact;
    }

    // Deletes the contact with the specified Contact ID
    // Reports to the console if no matching contact is found
    public void deleteContact(String contactID) {
        for (int counter = 0; counter < contactList.size(); counter++) {
            if (contactList.get(counter).getContactID().equals(contactID)) {
                contactList.remove(counter);
                return; // Exit method after deletion
            }
            if (counter == contactList.size() - 1) {
                System.out.println("Contact ID: " + contactID + " not found.");
            }
        }
    }

    // Updates the first name of the contact with the specified Contact ID
    public void updateFirstName(String updatedString, String contactID) {
        for (int counter = 0; counter < contactList.size(); counter++) {
            if (contactList.get(counter).getContactID().equals(contactID)) {
                contactList.get(counter).setFirstName(updatedString);
                return; // Exit method after update
            }
            if (counter == contactList.size() - 1) {
                System.out.println("Contact ID: " + contactID + " not found.");
            }
        }
    }

    // Updates the last name of the contact with the specified Contact ID
    public void updateLastName(String updatedString, String contactID) {
        for (int counter = 0; counter < contactList.size(); counter++) {
            if (contactList.get(counter).getContactID().equals(contactID)) {
                contactList.get(counter).setLastName(updatedString);
                return; // Exit method after update
            }
            if (counter == contactList.size() - 1) {
                System.out.println("Contact ID: " + contactID + " not found.");
            }
        }
    }

    // Updates the phone number of the contact with the specified Contact ID
    public void updateNumber(String updatedString, String contactID) {
        for (int counter = 0; counter < contactList.size(); counter++) {
            if (contactList.get(counter).getContactID().equals(contactID)) {
                contactList.get(counter).setNumber(updatedString);
                return; // Exit method after update
            }
            if (counter == contactList.size() - 1) {
                System.out.println("Contact ID: " + contactID + " not found.");
            }
        }
    }

    // Updates the address of the contact with the specified Contact ID
    public void updateAddress(String updatedString, String contactID) {
        for (int counter = 0; counter < contactList.size(); counter++) {
            if (contactList.get(counter).getContactID().equals(contactID)) {
                contactList.get(counter).setAddress(updatedString);
                return; // Exit method after update
            }
            if (counter == contactList.size() - 1) {
                System.out.println("Contact ID: " + contactID + " not found.");
            }
        }
    }
}
