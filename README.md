# Java-Assignmet

For this project you will create a hierarchy of five classes to describe various elements of a school setting. 
Detailed below are the requirements for the variables and methods of each class. You may need to add a few additional variables and/or methods; 
figuring out what is needed is part of your task with this assignment.
One key piece that you will be using in this inheritance project is super.
While this points to the local class as in; this.fName is the same as invoking Person's fName variable. But super points to the extended class and invokes that instead.
So, if you were in Student and want to retrieve the fName and IName from Person's constructor, then you would use super(fName, IName) which
would be Person's constructor and bring those values in to the child since it inherits everything from the parent.
NOTE: super must be first in the constructor.
You will create the classes listed below and upload all of them when you turn in for grading, including the runner customized to your classes.
Make sure to customize your classes by appending your last name to the class and file (Personllkenhons.java; public class Personilkenhons) 
and then you will need to change the instantiation of those objects to match.


Person

Variables:
• String firstName - Holds the person's first name
• String lastName - Holds the person's last name
Methods:
⚫ Person(String fName, String IName) - Constructor that takes in String parameters representing the first and last names
• String toString() - Returns a String with the Person name formatted as follows:
⚫ Smith, Mary


Student extends Person

Variables:
⚫//all variables inherited from Person
⚫int studentld - Using a private static variable, every student should be assigned a unique value for studentid. ⚫int numStudent - Using a public variable to return.
⚫ int level - Represents a student's grade level with possible values ranging from 0 to 12, where O represents kindergarten.
Methods:
. Student(String fName, String IName, int gLevel) - Constructor that accepts the first and last names and the student level. Student level should
be assigned 0 if the parameter is not between 0 and 12 inclusive. The first and last names should be set by calling the parameter of the parent class. 
The constructor also sets the studentld to the next available positive integer. The first Student created should have a studentld of 1, the
second will have an ID of 2, third of 3, etc.
⚫ int getLevel()- Returns the student's grade level. String toString() - Returns a three line String with Student info formatted as follows:
⚫ Smith, Mary
Grade Level: 2
o ID #: 1
• Note: there are three spaces before "Grade Level:.." and "ID #:..
⚫ Note 2: Using 'super.toString() + will append the information from the parent class to the return that you are developing here.



High SchoolStudent extends Student

Variables:
⚫ double gradePointAvg - Stores a GPA value between 0 and 5 inclusive Methods:
⚫ HighSchoolStudent(String fName, String IName, int gLevel, double gpa) - The first and last names and the level should be set by calling the constructor of the parent class. The GPA should be between 1 and 5 inclusive, otherwise set to 0.
• String toString() - Returns a four line String with HighSchoolStudent info formatted as follows:
• Lee, Sarah
Grade Level: 9
ID #: 2
GPA: 3.7
Note: there are three spaces before "Grade Level:...", "ID #:..." and "GPA: ....


Teacher extends Person

Variables:
⚫ String course - A String representing the academic subject taught by the teacher.

Methods:
⚫ Teacher(String fName, String IName, String subject) - The first and last names should be set by calling the constructor of the parent class. • String toString() - Returns a two line String with Teacher info formatted as follows:
• Doormouse, Rebecca
Subject: Computer Science
⚫ Note: there are three spaces before "Subject: ....


School

Variables:
• ArrayList<Student> pupils - A list of students at the school.
• ArrayList<Teacher> instructors - A list of teachers at the school.

Methods:
⚫ School(ArrayList<Student> students, ArrayList<Teacher teachers) - A constructor that specifies teachers and students at a school.
⚫ String getGradeLevel(int level) - Returns a String listing all the schools's students that are at the specified grade level. Returns an empty String
if the school has no students at the specified level. See the Sample Run below for the format of the returned String. • String toString() - Returns a multiline String listing the teachers and students at the school. The String is formatted as follows:
• Faculty:
⚫ [listing of teachers)
• Student Body:
⚫ [listing of students)

See the Sample Run below for an example.
Remember, all variables should have an access level of private and all required methods should have an access level of public. Wherever possible, the child class should use a call to the parent's toString and/or constructor methods; super.toString() + [your new data].


School UML(Person connects to Student and Teacher. Student connects to HighSchoolStudent)

Person
+String firstName 
+String lastName
"Person(fName, IName) 
-String toString()

School
+Student ArrayList
+Teacher ArrayList
"School(students, teachers)
-String getGradeLevel(int level)
-String toString()

Student
+int studentID
+int numStudent 
+int gradelevel
*Student (...,..., grade)
-int getLevel()
-String toString()

Teacher
+String course
"Teacher (...,..., subject) 
-String toString()

HighSchoolStudent 
+double gradePointAvg 
*HighSchoolStudent(...,...,..., gpa) 
-String toString()


Sample Run:

printing person: Doe, John
printing student: Smithers, Sallie
printing person: Doe, John
printing student:
Smithers, Sallie
Grade Level: 7
ID #: 1
printing highschoolstudent:
Smith, Bert Grade Level: 11
ID #: 2 GPA: 3.67
printing school:
Faculty:
Lovelace, Ada Subject: Mathematics
Einstein, Albert Subject: Physics
Hopper, Grace
Subject: Computer Science Turing, Alan
Subject: Mathematics
Curie, Marie Subject: Chemistry
Madison, Dolly Subject: Government
Angelou, Mayat
Subject: English Composition
Student Body: Finch, Jem
Grade Level: 11
ID #: 3
GPA: 3.4
Finch, Scout Grade Level: 4
ID #: 4 Adams, Natalie
Grade Level: 11
ID #: 5
GPA: 2.4
Radley, Boo Grade Level: 12
ID #: 6 GPA: 1.7
Finch, Atticus
Grade Level: 12
ID #: 7
GPA: 4.8
Benes, Elaine. Grade Level: 9
ID #: 8 Henry, Patrick
Grade Level: 11
ID #: 9
just seniors:
Radley, Boo Grade Level: 12
ID #: 6
GPA: 1.7
Finch, Atticus Grade Level: 12
ID #: 7 GPA: 4.8

After completing everything you should have 5 class files that you created for each class, and also your customized student_runner_School.java.
