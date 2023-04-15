public class HighSchoolStudentWachira extends StudentWachira {
    private double gradePointAvg;

    public HighSchoolStudentWachira(String fName, String lName, int gLevel, double gpa) {
        super(fName, lName, gLevel);
        this.gradePointAvg = (gpa >= 0 && gpa <= 5) ? gpa : 0;
    }

    public String toString() {
        return super.toString() + "\n   GPA: " + gradePointAvg;
    }
}
