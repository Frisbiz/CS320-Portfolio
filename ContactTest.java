// Author: Faris Malik
// Date: October 12, 2024
// Course: CS-320
// Description: This test suite validates the Person class. The first five tests 
//              ensure that each field adheres to specified constraints: first and 
//              last names cannot exceed 10 characters, the phone number must be 
//              exactly 10 characters, and the address cannot exceed 30 characters. 
//              The last four tests verify that each field is not null.


package Test;

import org.junit.jupiter.api.Test;

import Contact.Person;

import org.junit.jupiter.api.DisplayName;
import static org.junit.jupiter.api.Assertions.*;

public class PersonTest {
    /*
     * This suite tests the Person class. The first five tests ensure that each
     * field adheres to specified constraints (10 characters for first and last name,
     * exactly 10 characters for phone number, and 30 characters for the address).
     * The last four tests verify that each field is not null. The PersonID is not
     * tested for nullability as it cannot be created without a valid ID, nor is it
     * tested for being non-updateable as there's no way to change it.
     */
    
    @Test
    @DisplayName("Person ID cannot exceed 10 characters")
    void testPersonIDWithMoreThanTenCharacters() {
        Person person = new Person("SampleFirst", "SampleLast", "SampleNum", "SampleAddress");
        if (person.getPersonID().length() > 10) {
            fail("Person ID has more than 10 characters.");
        }
    }

    @Test
    @DisplayName("Person First Name cannot exceed 10 characters")
    void testPersonFirstNameWithMoreThanTenCharacters() {
        Person person = new Person("ExtraordinarilyLongFirstName", "SampleLast", "SampleNum", "SampleAddress");
        if (person.getFirstName().length() > 10) {
            fail("First Name exceeds 10 characters.");
        }
    }

    @Test
    @DisplayName("Person Last Name cannot exceed 10 characters")
    void testPersonLastNameWithMoreThanTenCharacters() {
        Person person = new Person("SampleFirst", "ExtraordinarilyLongLastName", "SampleNum", "SampleAddress");
        if (person.getLastName().length() > 10) {
            fail("Last Name exceeds 10 characters.");
        }
    }

    @Test
    @DisplayName("Person phone number must be exactly 10 characters")
    void testPersonNumberWithMoreThanTenCharacters() {
        Person person = new Person("SampleFirst", "SampleLast", "12345678901", "SampleAddress");
        if (person.getPhoneNumber().length() != 10) {
            fail("Phone number length is not 10.");
        }
    }

    @Test
    @DisplayName("Person address cannot exceed 30 characters")
    void testPersonAddressWithMoreThanThirtyCharacters() {
        Person person = new Person("SampleFirst", "SampleLast", "SampleNum",
                "This address is way too long and exceeds thirty characters limit!");
        if (person.getAddress().length() > 30) {
            fail("Address exceeds 30 characters.");
        }
    }

    @Test
    @DisplayName("Person First Name must not be null")
    void testPersonFirstNameNotNull() {
        Person person = new Person(null, "SampleLast", "SampleNum", "SampleAddress");
        assertNotNull(person.getFirstName(), "First name is null.");
    }

    @Test
    @DisplayName("Person Last Name must not be null")
    void testPersonLastNameNotNull() {
        Person person = new Person("SampleFirst", null, "SampleNum", "SampleAddress");
        assertNotNull(person.getLastName(), "Last name is null.");
    }

    @Test
    @DisplayName("Person Phone Number must not be null")
    void testPersonPhoneNotNull() {
        Person person = new Person("SampleFirst", "SampleLast", null, "SampleAddress");
        assertNotNull(person.getPhoneNumber(), "Phone number is null.");
    }

    @Test
    @DisplayName("Person Address must not be null")
    void testPersonAddressNotNull() {
        Person person = new Person("SampleFirst", "SampleLast", "SampleNum", null);
        assertNotNull(person.getAddress(), "Address is null.");
    }
}
