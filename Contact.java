// Author: Faris Malik
// Date: October 12, 2024
// Course: CS-320
// Description: This class represents a Contact object with validation for contact ID, 
//              first name, last name, phone number, and address. Each attribute has 
//              specific rules: names and addresses are truncated if they exceed the 
//              character limit, and defaults are set for null or invalid inputs.


package Contact;

import java.util.concurrent.atomic.AtomicLong;

public class Contact {
    private final String contactID; // Unique identifier for the contact
    private String firstName;        // First name of the contact
    private String lastName;         // Last name of the contact
    private String number;           // Phone number of the contact
    private String address;          // Address of the contact
    private static AtomicLong idGenerator = new AtomicLong(); // ID generator for unique contact IDs

    // CONSTRUCTOR
    /*
     * Initializes a new Contact with the provided first name, last name, 
     * phone number, and address. 
     * 
     * - Generates a unique contactID.
     * - Sets first and last names to "NULL" if they are blank or null, 
     *   truncating to 10 characters if necessary.
     * - Defaults the phone number to '2222222222' if invalid (not 10 characters).
     * - Sets address to "NULL" if blank or null, truncating to 30 characters if needed.
     */
    public Contact(String firstName, String lastName, String number, String address) {
        this.contactID = String.valueOf(idGenerator.getAndIncrement());

        // Set first name
        if (firstName == null || firstName.isEmpty()) {
            this.firstName = "NULL";
        } else if (firstName.length() > 10) {
            this.firstName = firstName.substring(0, 10);
        } else {
            this.firstName = firstName;
        }

        // Set last name
        if (lastName == null || lastName.isEmpty()) {
            this.lastName = "NULL";
        } else if (lastName.length() > 10) {
            this.lastName = lastName.substring(0, 10);
        } else {
            this.lastName = lastName;
        }

        // Set phone number
        if (number == null || number.isEmpty() || number.length() != 10) {
            this.number = "2222222222";
        } else {
            this.number = number;
        }

        // Set address
        if (address == null || address.isEmpty()) {
            this.address = "NULL";
        } else if (address.length() > 30) {
            this.address = address.substring(0, 30);
        } else {
            this.address = address;
        }
    }

    // GETTERS
    public String getContactID() {
        return contactID; // Returns the contact's unique ID
    }

    public String getFirstName() {
        return firstName; // Returns the first name
    }

    public String getLastName() {
        return lastName; // Returns the last name
    }

    public String getNumber() {
        return number; // Returns the phone number
    }

    public String getAddress() {
        return address; // Returns the address
    }

    // SETTERS
    /*
     * Setters enforce the same validation rules as the constructor.
     */
    public void setFirstName(String firstName) {
        if (firstName == null || firstName.isEmpty()) {
            this.firstName = "NULL";
        } else if (firstName.length() > 10) {
            this.firstName = firstName.substring(0, 10);
        } else {
            this.firstName = firstName;
        }
    }

    public void setLastName(String lastName) {
        if (lastName == null || lastName.isEmpty()) {
            this.lastName = "NULL";
        } else if (lastName.length() > 10) {
            this.lastName = lastName.substring(0, 10);
        } else {
            this.lastName = lastName;
        }
    }

    public void setNumber(String number) {
        if (number == null || number.isEmpty() || number.length() != 10) {
            this.number = "2222222222";
        } else {
            this.number = number;
        }
    }

    public void setAddress(String address) {
        if (address == null || address.isEmpty()) {
            this.address = "NULL";
        } else if (address.length() > 30) {
            this.address = address.substring(0, 30);
        } else {
            this.address = address;
        }
    }
}
