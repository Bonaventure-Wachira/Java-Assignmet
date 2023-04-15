public class PersonWachira {
    private String firstName;
    private String lastName;

    public PersonWachira(String fName, String lName) {
        this.firstName = fName;
        this.lastName = lName;
    }

    public String toString() {
        return lastName + ", " + firstName;
    }
}
