package projectbriefpartamain;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Student {

    private String fName;
    private String lName;
    private Date dateOfBirth;
    private float tuitionFees;
    private ArrayList<Assignment> assignments;

    public Student(String fName, String lName, Date dateOfBirth, float tuitionFees) {
        this.fName = fName;
        this.lName = lName;
        this.dateOfBirth = dateOfBirth;
        this.tuitionFees = tuitionFees;
    }

    public void inputS() throws ParseException {
        Student st01 = new Student();
        Scanner sc = new Scanner(System.in);
        boolean check = true;
        while (check = true) {
            System.out.print("\n insert the name of student: ");
            fName = sc.next();
            //validation first name only String
            while (!fName.matches("[a-zA-Z_]+")) {
            System.out.print("Invalid name!only characters are accepted \nplease insert the Name: ");
            fName = sc.next();}
            st01.setfName(fName);
            System.out.print("\n insert the surname of student: ");
            lName = sc.next();
            //validation last name
            while (!lName.matches("[a-zA-Z_]+")) {
            System.out.print("Invalid name!only characters are accepted \nplease insert the surname: ");
            lName = sc.next();}
            st01.setlName(lName);
            System.out.print("\n insert the date of birth (dd-MM-yyyy): ");
            String dateOfBi = sc.next();
            st01.setDateOfBirth(dateOfBirth);
            SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
            Date dateOfB = formatter.parse(dateOfBi);
            dateOfBirth = dateOfB;
            System.out.print("\n insert the tuition fees: ");
            tuitionFees = sc.nextFloat();
                        
            st01.setTuitionFees(tuitionFees);
            System.out.println("\n Would you like to add more Students? YES:1 NO:2");
            int num = sc.nextInt();
            if (num == 1) {
                check = false;
            } else if (num == 2) {
                break;
            }
        }
    }

    @Override
    public String toString() {
        return "Student{" + "fName=" + fName + ", lName=" + lName + ", dateOfBirth=" + dateOfBirth + ", tuitionFees=" + tuitionFees + '}';
    }

    public Student() {

    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public float getTuitionFees() {
        return tuitionFees;
    }

    public void setTuitionFees(float tuitionFees) {
        this.tuitionFees = tuitionFees;
    }

}
