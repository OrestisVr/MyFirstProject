package projectbriefpartamain;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class ProjectBriefPartAMain {

    public static ArrayList<Student> createSyntheticStudents() {
        Student st1 = new Student();
        st1.setfName("orestis");
        st1.setlName("vrettos");
        st1.setDateOfBirth(new Date());
        st1.setTuitionFees(2500);

        Student st2 = new Student();
        st2.setfName("andreas");
        st2.setlName("meladianos");
        st2.setDateOfBirth(new Date());
        st2.setTuitionFees(2500);

        Student st3 = new Student();
        st3.setfName("polukarpos");
        st3.setlName("meladianos");
        st3.setDateOfBirth(new Date());
        st3.setTuitionFees(2500);

        Student st4 = new Student();
        st4.setfName("sofia");
        st4.setlName("faka");
        st4.setDateOfBirth(new Date());
        st4.setTuitionFees(2500);

        Student st5 = new Student();
        st5.setfName("katerina");
        st5.setlName("neratzakh");
        st5.setDateOfBirth(new Date());
        st5.setTuitionFees(2500);

        Student st6 = new Student();
        st6.setfName("georgia");
        st6.setlName("bouloumpasi");
        st6.setDateOfBirth(new Date());
        st6.setTuitionFees(2500);

        Student st7 = new Student();
        st7.setfName("periklis");
        st7.setlName("papadopoulos");
        st7.setDateOfBirth(new Date());
        st7.setTuitionFees(2500);

        Student st8 = new Student();
        st8.setfName("dimitris");
        st8.setlName("mimidis");
        st8.setDateOfBirth(new Date());
        st8.setTuitionFees(2500);

        Student st9 = new Student();
        st9.setfName("panagiwtis");
        st9.setlName("marathianos");
        st9.setDateOfBirth(new Date());
        st9.setTuitionFees(2500);

        ArrayList<Student> Studentlist = new ArrayList();
        Studentlist.add(st1);
        Studentlist.add(st2);
        Studentlist.add(st3);
        Studentlist.add(st4);
        Studentlist.add(st5);
        Studentlist.add(st6);
        Studentlist.add(st7);
        Studentlist.add(st8);
        Studentlist.add(st9);
        return Studentlist;
    }

    public static ArrayList<Assignment> createSyntheticAssignments() {
        Assignment asm1 = new Assignment();
        asm1.setTitle("Project");
        asm1.setDescription("description");
        asm1.setOralMark(35);
        asm1.setTotalMark(65);

        Assignment asm2 = new Assignment();
        asm2.setTitle("Project");
        asm2.setDescription("description");
        asm2.setOralMark(15);
        asm2.setTotalMark(43);

        Assignment asm3 = new Assignment();
        asm3.setTitle("Project");
        asm3.setDescription("description");
        asm3.setOralMark(17);
        asm3.setTotalMark(48);

        Assignment asm4 = new Assignment();
        asm4.setTitle("Project");
        asm4.setDescription("description");
        asm4.setOralMark(13);
        asm4.setTotalMark(54);

        Assignment asm5 = new Assignment();
        asm5.setTitle("Project");
        asm5.setDescription("description");
        asm5.setOralMark(19);
        asm5.setTotalMark(67);

        ArrayList<Assignment> asmlist = new ArrayList();
        asmlist.add(asm1);
        asmlist.add(asm2);
        asmlist.add(asm3);
        asmlist.add(asm4);
        asmlist.add(asm5);
        return asmlist;
    }

    public static ArrayList<Course> createSyntheticCourses() {
        Course cr1 = new Course();
        cr1.setTitle("CB10");
        cr1.setStream("Java");
        cr1.setType("Full time");
        cr1.setStDate("stDate");
        cr1.setEnDate("enDate");

        Course cr2 = new Course();
        cr2.setTitle("CB 10");
        cr2.setStream("Java");
        cr2.setType("Part time");
        cr2.setStDate("stDate");
        cr2.setEnDate("enDate");

        Course cr3 = new Course();
        cr3.setTitle("CB 10");
        cr3.setStream("C#");
        cr3.setType("Full time");
        cr3.setStDate("stDate");
        cr3.setEnDate("enDate");

        ArrayList<Course> courselist = new ArrayList();
        courselist.add(cr1);
        courselist.add(cr2);
        courselist.add(cr3);
        return courselist;
    }

    public static ArrayList<Trainer> createSyntheticTrainer() {
        Trainer tr1 = new Trainer();
        tr1.setSubject("subject");
        tr1.setfName("Giorgos");
        tr1.setlName("Pasparakis");

        Trainer tr2 = new Trainer();
        tr2.setSubject("subject");
        tr2.setfName("Giorgos");
        tr2.setlName("Irakleidis");

        Trainer tr3 = new Trainer();
        tr3.setSubject("subject");
        tr3.setfName("Nikos");
        tr3.setlName("Karapas");

        ArrayList<Trainer> Trainerlist = new ArrayList();
        Trainerlist.add(tr1);
        Trainerlist.add(tr2);
        Trainerlist.add(tr3);
        return Trainerlist;
    }

    public static ArrayList<StudentCourse> syntheticCourseSudent(ArrayList<Student> Students, ArrayList<Course> Courses) {
        Course c1 = Courses.get(2);
        Course c2 = Courses.get(0);

        ArrayList l1 = new ArrayList(Students.subList(0, Students.size() / 2));
        ArrayList l2 = new ArrayList(Students.subList(2, Students.size() / 2 + 1));

        StudentCourse st1 = new StudentCourse(c1, l1);
        StudentCourse st2 = new StudentCourse(c2, l2);

        ArrayList<StudentCourse> StudentCourses = new ArrayList();
        StudentCourses.add(st1);
        StudentCourses.add(st2);

        return StudentCourses;
    }

    public static ArrayList<AssignmentCourse> syntheticAssignmentCourse(ArrayList<Assignment> Assignments, ArrayList<Course> Courses) {
        Course c1 = Courses.get(2);
        Course c2 = Courses.get(0);

        ArrayList l1 = new ArrayList(Assignments.subList(0, Assignments.size() / 2));
        ArrayList l2 = new ArrayList(Assignments.subList(2, Assignments.size() / 2 + 1));

        AssignmentCourse asm1 = new AssignmentCourse(c1, l1);
        AssignmentCourse asm2 = new AssignmentCourse(c2, l2);

        ArrayList<AssignmentCourse> assignmentCourses = new ArrayList();
        assignmentCourses.add(asm1);
        assignmentCourses.add(asm2);

        return assignmentCourses;
    }

    public static ArrayList<AssignmentStudent> syntheticAssignmentStudent(ArrayList<Assignment> Assignments, ArrayList<Student> Students) {
        Student st1 = Students.get(2);
        Student st2 = Students.get(0);

        ArrayList l1 = new ArrayList(Assignments.subList(0, Assignments.size() / 2));
        ArrayList l2 = new ArrayList(Assignments.subList(2, Assignments.size() / 2 + 1));

        AssignmentStudent asm1 = new AssignmentStudent(st1, l1);
        AssignmentStudent asm2 = new AssignmentStudent(st2, l2);

        ArrayList<AssignmentStudent> assignmentStudent = new ArrayList();
        assignmentStudent.add(asm1);
        assignmentStudent.add(asm2);

        return assignmentStudent;
    }

    public static void main(String[] args) throws ParseException {

        System.out.println("Welcome!!\nIf you want to use synthetic data press 1: ");
        System.out.println("For your own data press 2: ");
        Scanner sc = new Scanner(System.in);

        int choice = sc.nextInt();

        ArrayList<Student> studentlist = new ArrayList();
        ArrayList<Assignment> assignmentlist = new ArrayList();
        ArrayList<Course> courselist = new ArrayList();
        ArrayList<Trainer> trainerlist = new ArrayList();
        ArrayList<StudentCourse> StudentCourselist = new ArrayList();
        ArrayList<AssignmentCourse> AssignmentCourselist = new ArrayList();
        ArrayList<AssignmentStudent> AssignmentStundetlist = new ArrayList();

        switch (choice) {
            case 1:
                studentlist = createSyntheticStudents();
                assignmentlist = createSyntheticAssignments();
                courselist = createSyntheticCourses();
                trainerlist = createSyntheticTrainer();

                StudentCourselist = syntheticCourseSudent(studentlist, courselist);
                AssignmentCourselist = syntheticAssignmentCourse(assignmentlist, courselist);
                AssignmentStundetlist = syntheticAssignmentStudent(assignmentlist, studentlist);
                break;
            case 2:
                System.out.println("How many students would you like to create?");
                int x = sc.nextInt();
                for (int i = 0; i <= x; i++) {
                    Student st = new Student();
                    st.inputS();
                    studentlist.add(st);
                }
                System.out.println("How many course would you like to create?");
                x = sc.nextInt();
                for (int i = 0; i <= x; i++) {
                    Course cr = new Course();
                    cr.inputC();
                    courselist.add(cr);
                }
                System.out.println("How many assignments would you like to create?");
                x = sc.nextInt();
                for (int i = 0; i <= x; i++) {
                    Assignment asm = new Assignment();
                    asm.inputA();
                    assignmentlist.add(asm);
                }
                System.out.println("How many trainers would you like to create?");
                x = sc.nextInt();
                for (int i = 0; i <= x; i++) {
                    Trainer tr = new Trainer();
                    tr.inputT();
                    trainerlist.add(tr);
                }

        }
        for (Student s : studentlist) {
            System.out.println(s.toString());

        }
        for (StudentCourse s : StudentCourselist) {
            System.out.println(s.toString());

            for (AssignmentCourse as : AssignmentCourselist) {
                System.out.println(s.toString());

            }
            for (AssignmentCourse as : AssignmentCourselist) {
                System.out.println(s.toString());

            }
            int counters=0;
            for (Student st : studentlist) {
                System.out.println(st.getlName());
                int counter=0;
                for (StudentCourse stC : StudentCourselist) {
                    for (Student stu : stC.getStudents()) {
                        if (st.getlName().equals(stu.getlName())) {
                            counter++;
                            if (counter>=2){
                            counters++;}
                            for (AssignmentCourse as : AssignmentCourselist) {
                                if (stC.getC().equals(as.getC())) {
                                    as.printAssignments();
                                }
                            }
                        }
                    }
                }
            }
            System.out.println(counters);
        }
    }
}
