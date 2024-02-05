/**
 * This class represents person (firstname, lastname and birthyear)
 */
public final class Person {
    private final String firstname; 
    private final String lastname;
    private final int birthyear; 
/**
 * Constructor for Person
 * @param firstname firstname
 * @param lastname lastname
 * @param birthyear birthyear
 */
    public Person(String firstname, String lastname, int birthyear){ 
        this.firstname = firstname;
        this.lastname = lastname;
        this.birthyear = birthyear;
    }
/**
 * Get-Method for FirstName
 * @return this.firstname
 */
    public String getFirstName() { 
        return this.firstname;     
    }
/**
 * Get-Method for LastName
 * @return this.lastname
 */
    public String getLastName() {
        return this.lastname;
    }
/**
 * Get-Method for BirthYear
 * @return this.birthyear
 */
    public int getBirthYear() {
        return this.birthyear;
    }

    

}