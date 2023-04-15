public class StudentWachira extends PersonWachira {
    private static int numStudent = 0;
    private int studentId;
    private int level;

    public StudentWachira(String fName, String lName, int gLevel) {
        super(fName, lName);
        this.level = (gLevel >= 0 && gLevel <= 12) ? gLevel : 0;
        this.studentId = ++numStudent;
    }

    public int getLevel() {
        return level;
    }

    public String toString() {
        return super.toString() + "\n   Grade Level: " + level + "\n   ID #: " + studentId;
    }
}
