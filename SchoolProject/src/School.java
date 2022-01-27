import java.util.ArrayList;

public class School {
    ArrayList<Teacher> teachers = new ArrayList<>();
    ArrayList<Student> students = new ArrayList<>();
    private String schoolName;
    private String city;
    private String country;

    public School(String schoolName, String city, String country){
        this.schoolName = schoolName;
        this.city = city;
        this.country = country;
    }


    public void setSchoolName(String schoolName){
        this.schoolName = schoolName;
    }

    public void setCity(String city){
        this.city = city;
    }

    public void setCountry(String country){
        this.country = country;
    }

    public String getSchoolName(){
        return schoolName;
    }

    public String getCountry(){
        return country;
    }

    public String getCity(){
        return city;
    }

    public void addTeacher(Teacher teacher){
        teachers.add(teacher);
    }

    public void addStudent(Student student){
        students.add(student);
    }

    public void removeTeacher(Teacher teacher){
        teachers.remove(teacher);
    }

    public void removeStudent(Student student){
        students.remove(student);
    }

    public void show(){
        for(int i=0;i<teachers.size();i++){
            System.out.println(teachers.get(i));
        }
        for(int i=0; i<students.size();i++){
            System.out.println(students.get(i));
        }
    }

}
