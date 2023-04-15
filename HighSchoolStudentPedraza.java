public class HighSchoolStudentPedraza extends StudentPedraza {
    private double gradePointAvg;

    public HighSchoolStudentPedraza(String fName, String lName, int gLevel, double gpa) {
        super(fName, lName, gLevel);
        gradePointAvg = (gpa >= 0 && gpa <= 5) ? gpa : 0;
    }

    public String toString() {
        return super.toString() + "\n   GPA: " + gradePointAvg;
    }
}
