import java.util.ArrayList;

public class SchoolPedraza {
    private ArrayList<StudentPedraza> pupils;
    private ArrayList<TeacherPedraza> instructors;

    public SchoolPedraza(ArrayList<StudentPedraza> students, ArrayList<TeacherPedraza> teachers) {
        pupils = students;
        instructors = teachers;
    }

    public String getGradeLevel(int level) {
        StringBuilder gradeLevelStudents = new StringBuilder();
        for (StudentPedraza student : pupils) {
            if (student.getLevel() == level) {
                gradeLevelStudents.append(student.toString()).append("\n");
            }
        }
        return gradeLevelStudents.toString();
    }

    public String toString() {
        StringBuilder schoolInfo = new StringBuilder("Faculty:\n");
        for (TeacherPedraza teacher : instructors) {
            schoolInfo.append(teacher.toString()).append("\n");
        }

        schoolInfo.append("\nStudent Body:\n");
        for (StudentPedraza student : pupils) {
            schoolInfo.append(student.toString()).append("\n");
        }

        return schoolInfo.toString();
    }
}
