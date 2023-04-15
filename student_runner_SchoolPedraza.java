import java.io.IOException;
import java.util.ArrayList;

public class student_runner_SchoolPedraza {

    public static void main(String arg[]) throws IOException {
        PersonPedraza p = new PersonPedraza("John", "Doe");
        System.out.println("Printing person:\n");
        System.out.println(p);

        StudentPedraza s = new StudentPedraza("Sallie", "Smithers", 7);
        System.out.println("\nPrinting student:\n");
        System.out.println(s);

        System.out.println("\nPrinting highschoolstudent:\n");
        HighSchoolStudentPedraza h = new HighSchoolStudentPedraza("Bert", "Smith", 11, 3.67);
        System.out.println(h);

        ArrayList<StudentPedraza> stu = new ArrayList<StudentPedraza>();
        stu.add(new HighSchoolStudentPedraza("Jem", "Finch", 11, 3.4));
        stu.add(new StudentPedraza("Scout", "Finch", 4));
        stu.add(new HighSchoolStudentPedraza("Natalie", "Adams", 11, 2.4));
        stu.add(new HighSchoolStudentPedraza("Boo", "Radley", 12, 1.7));
        stu.add(new HighSchoolStudentPedraza("Atticus", "Finch", 12, 4.8));
        stu.add(new StudentPedraza("Elaine", "Benes", 9));
        stu.add(new StudentPedraza("Patrick", "Henry", 11));

        ArrayList<TeacherPedraza> tea = new ArrayList<TeacherPedraza>();
        tea.add(new TeacherPedraza("Ada", "Lovelace", "Mathematics"));
        tea.add(new TeacherPedraza("Albert", "Einstein", "Physics"));
        tea.add(new TeacherPedraza("Grace", "Hopper", "Computer Science"));
        tea.add(new TeacherPedraza("Alan", "Turing", "Mathematics"));
        tea.add(new TeacherPedraza("Marie", "Curie", "Chemistry"));
        tea.add(new TeacherPedraza("Dolly", "Madison", "Government"));
        tea.add(new TeacherPedraza("Maya", "Angelou", "English Composition"));

        SchoolPedraza sch = new SchoolPedraza(stu, tea);
        System.out.println("\nPrinting school: \n");
        System.out.println(sch);

        System.out.println("\nJust seniors: \n" + sch.getGradeLevel(12));
    }
}
