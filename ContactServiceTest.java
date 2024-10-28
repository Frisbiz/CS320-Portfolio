// Author: Faris Malik
// Date: October 12, 2024
// Course: CS-320
// Description: This test suite validates the methods within the PersonService class. 
//              Each test initializes a new PersonService instance and performs 
//              actions on the list of persons, confirming that outcomes match 
//              expectations. Tests are ordered using the @Order annotation to 
//              ensure they run in a specific sequence based on unique person IDs.


package Test;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;

import Contact.Person;
import Contact.PersonService;

import org.junit.jupiter.api.Order;

@TestMethodOrder(OrderAnnotation.class)
public class PersonServiceTest {

    /*
     * This test suite validates the methods within the PersonService class.
     * Each test initializes a new PersonService instance and performs actions 
     * on the list of persons, confirming that outcomes match expectations.
     *
     * Since each person receives a unique ID, the tests are ordered using the 
     * @Order annotation to ensure they run in a specific sequence based on 
     * these IDs. Uncomment personService.showPersonList(); for debugging output.
     */
    
    @Test
    @DisplayName("Test to Update Given Name.")
    @Order(1)
    void testUpdateGivenName() {
        PersonService personService = new PersonService();
        personService.addPerson("Dr.", "Smith", "3333331234", "456 Hollywood Lane");
        personService.updateGivenName("Alex", "0"); // Changed to "0" for consistency
        personService.showPersonList();
        assertEquals("Alex", personService.getPerson("0").getGivenName(), "Given name was not updated.");
    }

    @Test
    @DisplayName("Test to Update Family Name.")
    @Order(2)
    void testUpdateFamilyName() {
        PersonService personService = new PersonService();
        personService.addPerson("Dr.", "Smith", "3333331234", "456 Hollywood Lane");
        personService.updateFamilyName("Johnson", "0"); // Changed to "0" for consistency
        personService.showPersonList();
        assertEquals("Johnson", personService.getPerson("0").getFamilyName(), "Family name was not updated.");
    }

    @Test
    @DisplayName("Test to Update Contact Number.")
    @Order(3)
    void testUpdateContactNumber() {
        PersonService personService = new PersonService();
        personService.addPerson("Dr.", "Smith", "33333351234", "456 Hollywood Lane");
        personService.updateContactNumber("3333339876", "0"); // Changed to "0" for consistency
        //personService.showPersonList();
        assertEquals("3333339876", personService.getPerson("0").getContactNumber(), "Contact number was not updated.");
    }

    @Test
    @DisplayName("Test to Update Location.")
    @Order(4)
    void testUpdateLocation() {
        PersonService personService = new PersonService();
        personService.addPerson("Dr.", "Smith", "3333331234", "456 Hollywood Lane");
        personService.updateLocation("456 Hollywood Lane", "0"); // Changed to "0" for consistency
        personService.showPersonList();
        assertEquals("789 Fortnite Blvd", personService.getPerson("0").getLocation(), "Location was not updated.");
    }

    @Test
    @DisplayName("Test to Ensure Service Correctly Removes Persons.")
    @Order(5)
    void testRemovePerson() {
        PersonService personService = new PersonService();
        personService.addPerson("Dr.", "Smith", "3333331234", "456 Hollywood Lane");
        personService.removePerson("0"); // Changed to "0" for consistency
        ArrayList<Person> emptyPersonList = new ArrayList<Person>();
        personService.showPersonList();
        assertEquals(personService.personList, emptyPersonList, "The person was not removed.");
    }

    @Test
    @DisplayName("Test to Ensure Service Can Add a Person.")
    @Order(6)
    void testAddPerson() {
        PersonService personService = new PersonService();
        personService.addPerson("Dr.", "Smith", "3333331234", "456 Hollywood Lane");
        personService.showPersonList();
        assertNotNull(personService.getPerson("0"), "Person was not added correctly.");
    }
}
