package projectbriefpartamain;

import java.util.ArrayList;

public class AssignmentStudent {

    private Student s;
    private ArrayList<Assignment> assignment;

    public AssignmentStudent(Student s, ArrayList<Assignment> assignment) {
        this.s = s;
        this.assignment = assignment;
    }

    @Override
    public String toString() {
        String result = s.getfName();
        for (Assignment s : assignment) {
            result += " " + s.toString();
        }
        return result;
        
    }

    public Student getS() {
        return s;
    }

    public void setS(Student s) {
        this.s = s;
    }

    public ArrayList<Assignment> getAssignment() {
        return assignment;
    }

    public void setAssignment(ArrayList<Assignment> assignment) {
        this.assignment = assignment;
    }

}
