package oop_lab8;

public class Student {
    private String StudentID;
    private String major;

    public Student(String personID, String name, String gender, String age, String studentID, String major) {

        super(personID, name, gender, age);
        StudentID = studentID;
        this.major = major;
    }

    @Override
    public String toString() {
        return "Student{" +
                "StudentID='" + StudentID + '\'' +
                ", major='" + major + '\'' +
                "} " + super.toString();
    }

    public String getStudentID() {
        return StudentID;
    }

    public void setStudentID(String studentID) {
        StudentID = studentID;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }
}
}
