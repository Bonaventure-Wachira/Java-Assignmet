import java.util.ArrayList;

public class SchoolWachira {
    private ArrayList<StudentWachira> pupils;
    private ArrayList<TeacherWachira> instructors;

    public SchoolWachira(ArrayList<StudentWachira> students, ArrayList<TeacherWachira> teachers) {
        this.pupils = students;
        this.instructors = teachers;
    }

    public String getGradeLevel(int level) {
        StringBuilder sb = new StringBuilder();
        for (StudentWachira student : pupils) {
            if (student.getLevel() == level) {
                sb.append(student.toString()).append("\n");
            }
        }
        return sb.toString();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Faculty:\n");
        for (TeacherWachira teacher : instructors) {
            sb.append(teacher.toString()).append("\n");
        }
        sb.append("\nStudent Body:\n");
        for (StudentWachira student : pupils) {
            sb.append(student.toString()).append("\n");
        }
        return sb.toString();
    }
}
