package projectbriefpartamain;

import java.util.ArrayList;

public class StudentCourse {

    private Course c;
    private ArrayList<Student> Students;

    public StudentCourse(Course c, ArrayList<Student> Students) {
        this.c = c;
        this.Students = Students;
    }

    @Override
    public String toString() {
        String result = c.getTitle();
        for (Student s : Students) {
            result += " " + s.toString();
        }
        return result;
    }

    public Course getC() {
        return c;
    }

    public void setC(Course c) {
        this.c = c;
    }

    public ArrayList<Student> getStudents() {
        return Students;
    }

    public void setStudents(ArrayList<Student> Students) {
        this.Students = Students;
    }
    
}
