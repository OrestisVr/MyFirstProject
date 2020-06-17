package projectbriefpartamain;

import java.util.ArrayList;

public class AssignmentCourse {

    private Course c;
    private ArrayList<Assignment> assignment;

    public AssignmentCourse(Course c, ArrayList<Assignment> assignment) {
        this.c = c;
        this.assignment = assignment;
    }

    @Override
    public String toString() {
        String result = c.getTitle();
        for (Assignment s : assignment) {
            result += " " + s.toString();
        }
        return result;
        
    }
    public String printAssignments() {
        String result = "";
        for (Assignment s : assignment) {
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

    public ArrayList<Assignment> getAssignment() {
        return assignment;
    }

    public void setAssignment(ArrayList<Assignment> assignment) {
        this.assignment = assignment;
    }
}
