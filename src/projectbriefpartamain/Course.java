package projectbriefpartamain;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Course {

    private String title;
    private String stream;
    private String type;
    private String stDate;
    private String enDate;
    private List<Trainer> trainers;
    private List<Student> students;
    private List<Assignment> assignments;

    public Course(String title, String stream, String type, String stDate, String enDate) {
        this.title = title;
        this.stream = stream;
        this.type = type;
        this.stDate = stDate;
        this.enDate = enDate;
    }

    public void inputC() {
        Scanner sc = new Scanner(System.in);
        Course c01 = new Course();
        boolean check = true;
        while (check = true) {
            System.out.println("\n Please insert the title of the course");
            title = sc.next();
            c01.setTitle(title);
            System.out.println("\n Plese insert the stream");
            stream = sc.next();
            c01.setStream(stream);
            System.out.println("\n Please insert the type of course");
            type = sc.next();
            c01.setStream(stream);
            System.out.println("\n Please insert start date");
            stDate = sc.next();
            c01.setStDate(stDate);
            System.out.println("\n Please insert the end date");
            enDate = sc.next();
            c01.setEnDate(enDate);
            System.out.println("\n Would you like to add more Courses? YES:1 NO:2");
            int num = sc.nextInt();
            if (num == 1) {
                check = false;
            } else if (num == 2) {
                break;
            }
        }

    }
  
    public Course() {
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getStream() {
        return stream;
    }

    public void setStream(String stream) {
        this.stream = stream;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getStDate() {
        return stDate;
    }

    public void setStDate(String stDate) {
        this.stDate = stDate;
    }

    public String getEnDate() {
        return enDate;
    }

    public void setEnDate(String enDate) {
        this.enDate = enDate;
    }

}
