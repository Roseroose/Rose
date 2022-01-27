public class Student {
    private int studentNumber;
    private int grade;
    private String firstname;
    private String lastname;


    public Student(int studentNumber, int grade, String firstname, String lastname){
        this.studentNumber = studentNumber;
        this.grade = grade;
        this.firstname = firstname;
        this.lastname = lastname;
    }

    public void setFirstname(String firstname){
        this.firstname = firstname;
    }

    public void setLastname(String lastname){
        this.lastname = lastname;
    }

    public String getFirstname(){
        return firstname;
    }

    public String getLastname(){
        return lastname;
    }

    public void setGrade(int grade){
        this.grade = grade;
    }

    public int getGrade(){
        return grade;
    }

    public void setStudentNumber(int number){
        if(number < 0){
            number = 0;
        }
        studentNumber = number;
    }

    public int getStudentNumber(){
        return studentNumber;
    }

    public String toString(){
        return "Name: "+firstname+" "+lastname+", Grade: "+grade;
    }
}
