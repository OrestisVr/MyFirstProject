package projectbriefpartamain;

import java.util.ArrayList;
import java.util.Scanner;

public class Trainer {

    private String fName;
    private String lName;
    private String subject;

    public Trainer(String fName, String lName, String subject) {
        this.fName = fName;
        this.lName = lName;
        this.subject = subject;
    }

    public void inputT() {
        Scanner sc = new Scanner(System.in);
        Trainer tr01 = new Trainer();
        boolean check = true;
        while (check = true) {
            System.out.println("\n Please insert the Τrainer's  name");
            fName = sc.next();
             //validation first name only String
            while (!fName.matches("[a-zA-Z_]+")) {
            System.out.print("Invalid name!only characters are accepted \nplease insert the Name: ");
            fName = sc.next();}            
            tr01.setfName(fName);
            System.out.println("\n Please insert the Trainer's last name");
            lName = sc.next();
            while (!lName.matches("[a-zA-Z_]+")) {
            System.out.print("Invalid name!only characters are accepted \nplease insert the surname: ");
            lName = sc.next();}
            tr01.setlName(lName);           
            System.out.println("\n Please insert the subject");
            subject = sc.next();
            tr01.setSubject(subject);
            System.out.println("\n Would you like to add more Assignments? YES:1 NO:2");
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
        return "Trainer{" + "fName=" + fName + ", lName=" + lName + ", subject=" + subject + '}';
    }

    public Trainer() {
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

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

}
