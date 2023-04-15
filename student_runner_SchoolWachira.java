import java.io.IOException;
import java.util.ArrayList;

public class student_runner_SchoolWachira{

 public static void main(String arg[]) throws IOException {
 
  PersonWachira p = new PersonWachira("John", "Doe");
  System.out.println("Printing person:\n");
  System.out.println(p);

  StudentWachira s = new StudentWachira("Sallie", "Smithers", 7);
  System.out.println("\nPrinting student:\n");
  System.out.println(s);

  System.out.println("\nPrinting highschoolstudent:\n");
  HighSchoolStudentWachira h = new HighSchoolStudentWachira("Bert", "Smith", 11, 3.67);
  System.out.println(h);

  ArrayList<StudentWachira> stu = new ArrayList<StudentWachira>();
  stu.add(new HighSchoolStudentWachira("Jem", "Finch", 11, 3.4));
  stu.add(new StudentWachira("Scout", "Finch", 4));
  stu.add(new HighSchoolStudentWachira("Natalie", "Adams", 11, 2.4));
  stu.add(new HighSchoolStudentWachira("Boo", "Radley", 12, 1.7));
  stu.add(new HighSchoolStudentWachira("Atticus", "Finch", 12, 4.8));
  stu.add(new StudentWachira("Elaine", "Benes", 9));
  stu.add(new StudentWachira("Patrick", "Henry", 11));

  ArrayList<TeacherWachira> tea = new ArrayList<TeacherWachira>();
  tea.add(new TeacherWachira("Ada", "Lovelace", "Mathematics"));
  tea.add(new TeacherWachira("Albert", "Einstein", "Physics"));                   
  tea.add(new TeacherWachira("Grace", "Hopper", "Computer Science"));
  tea.add(new TeacherWachira("Alan", "Turing", "Mathematics"));
  tea.add(new TeacherWachira("Marie", "Curie", "Chemistry"));
  tea.add(new TeacherWachira("Dolly", "Madison", "Government"));
  tea.add(new TeacherWachira("Maya", "Angelou", "English Composition"));

  SchoolWachira sch = new SchoolWachira(stu, tea);
  System.out.println("\nPrinting school: \n");
  System.out.println(sch);

  System.out.println("\nJust seniors: \n" + sch.getGradeLevel(12));

 }
}
