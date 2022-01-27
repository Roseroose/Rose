import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        School school = new School("Uhill", "Vancouver", "Canada");

        school.addStudent(new Student(234,2,"B","B"));
        school.addStudent(new Student(345,3,"c","c"));
        school.addStudent(new Student(456, 4,"D","D"));
        school.addStudent(new Student(567,5,"E","E"));
        school.addStudent(new Student(789,6,"F","F"));
        school.addStudent(new Student(890,7,"G","G"));
        school.addStudent(new Student(901, 8,"H","H"));
        school.addStudent(new Student(1234,9,"I","I"));
        school.addStudent(new Student(1345,10,"J","J"));

        Student student1 = new Student(123, 1,"A","A");
        school.addStudent(student1);
        Student student2 = new Student(345,3,"c","c");
        school.addStudent(student2);

        Teacher teacher = new Teacher("A","A","Math");
        school.addTeacher(teacher);
        school.addTeacher(new Teacher("A","A","CS"));
        school.addTeacher(new Teacher("B","B","Physics"));
        school.addTeacher(new Teacher("C","C","English"));

        school.removeStudent(student1);
        school.removeStudent(student2);
        school.removeTeacher(teacher);

        school.show();
    }
}
