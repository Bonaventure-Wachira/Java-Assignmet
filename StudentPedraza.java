public class StudentPedraza extends PersonPedraza {
    private static int numStudents = 0;
    private int studentId;
    private int level;

    public StudentPedraza(String fName, String lName, int gLevel) {
        super(fName, lName);
        level = (gLevel >= 0 && gLevel <= 12) ? gLevel : 0;
        studentId = ++numStudents;
    }

    public int getLevel() {
        return level;
    }

    public String toString() {
        return super.toString() + "\n   Grade Level: " + level + "\n   ID #: " + studentId;
    }
}
