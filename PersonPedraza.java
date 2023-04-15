public class PersonPedraza {
    private String firstName;
    private String lastName;

    public PersonPedraza(String fName, String lName) {
        firstName = fName;
        lastName = lName;
    }

    public String toString() {
        return lastName + ", " + firstName;
    }
}
