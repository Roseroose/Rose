public class Teacher {
    private String firstname;
    private String lastname;
    private String subject;

    public Teacher(String firstname, String lastname, String subject){
        this.firstname = firstname;
        this. lastname = lastname;
        this.subject = subject;
    }

    public void setFirstname(String firstname){
        this.firstname = firstname;
    }

    public String getFirstname(){
        return firstname;
    }

    public void setLastname(String lastname){
        this.lastname = lastname;
    }

    public String getLastname(){
        return lastname;
    }

    public void setSubject(String subject){
        this.subject = subject;
    }

    public String getSubject(){
        return subject;
    }

    public String toString(){
        return "Name: "+firstname+" "+lastname+", Subject: "+subject;
    }

}
