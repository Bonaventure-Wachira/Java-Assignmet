public class TeacherWachira extends PersonWachira {
    private String course;

    public TeacherWachira(String fName, String lName, String subject) {
        super(fName, lName);
        this.course = subject;
    }

    public String toString() {
        return super.toString() + "\n   Subject: " + course;
    }
}
