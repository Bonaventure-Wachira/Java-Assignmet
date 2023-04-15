public class TeacherPedraza extends PersonPedraza {
    private String course;

    public TeacherPedraza(String fName, String lName, String subject) {
        super(fName, lName);
        course = subject;
    }

    public String toString() {
        return super.toString() + "\n   Subject: " + course;
    }
}
