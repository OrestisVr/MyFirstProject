package projectbriefpartamain;

import java.util.ArrayList;
import java.util.Scanner;

public class Assignment {

    private String title;
    private String description;
    private String subDateTime;
    private float oralMark;
    private float totalMark;
    //private ArrayList<Course> assignments;

    public Assignment(String title, String description, String subDateTime, float oralMark, float totalMark) {
        this.title = title;
        this.description = description;
        this.subDateTime = subDateTime;
        this.oralMark = oralMark;
        this.totalMark = totalMark;
    }

    public Assignment() {
    }

    Assignment(Course c1, ArrayList l1) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    Assignment(Student st1, ArrayList l1) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void inputA() {
        Scanner sc = new Scanner(System.in);
        Assignment asm1 = new Assignment();
        boolean check = true;
        while (check = true) {
            System.out.println("\n Please insert the title of the Assignment");
            title = sc.next();
            asm1.setTitle(title);
            System.out.println("\n Please insert the description of the Course");
            description = sc.next();
            asm1.setDescription(description);
            System.out.println("\n Please insert the date time");
            subDateTime = sc.next();
            asm1.setSubDateTime(subDateTime);
            System.out.println("\n Please insert the oral mark");
            oralMark = sc.nextFloat();
            asm1.setOralMark(oralMark);
            System.out.println("\n Please insert the total mark");
            totalMark = sc.nextFloat();
            asm1.setTotalMark(totalMark);
            System.out.println("\n Would you like to add more Trainers? YES:1 NO:2");
            int num = sc.nextInt();
            if (num == 1) {
                check = false;
            } else if (num == 2) {
                break;
            }
        }
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getSubDateTime() {
        return subDateTime;
    }

    public void setSubDateTime(String subDateTime) {
        this.subDateTime = subDateTime;
    }

    public float getOralMark() {
        return oralMark;
    }

    public void setOralMark(float oralMark) {
        this.oralMark = oralMark;
    }

    public float getTotalMark() {
        return totalMark;
    }

    public void setTotalMark(float totalMark) {
        this.totalMark = totalMark;
    }

}
