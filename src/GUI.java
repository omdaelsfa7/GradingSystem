import java.awt.*;
import java.util.ArrayList;
import javax.swing.*;


// fe 4wyt 7gat m7tagen nzbtha
// 1. lw 7d d5l ay byanat n7ot 7ga bt2ol enha at3mlha added succesfuly ( we lw fel add student n7t 3aha el id bta3oh )
// 2. wlw 3ml report aw assign gardes aw calculate gpa we hwa m3ndo4 id n5leh ytl3 7ga t2oloh en el student msh mwgood
// 3.mmkn nb2a nzbt el ab3ad bta3t el window wel 7gat zy el (zrayer,...) b7es n5leh akbr ( brdo 34an mmkn lma n3ml report n5ly lma yprint aktr mn course yprintohom fo2 b3d bd gmb b3d)
// 4. 3yzen n4of 7war el add course da l2n fe etnen ArrayList lel course ( ArrayList<Course> Courses) (bta3 omda) we fe da (ArrayList<Course> courseList) (bta3 dofda3)
// 5. nzwd we n7t design (optional) 


public class GUI {
    
    private JPanel homePanel;
    private JPanel studentPanel;
    private JPanel coursePanel;
    private JPanel gradePanel;
    private JPanel gpaPanel;
    private JPanel reportPanel;
    private JPanel reportPanel2;
    private JPanel gpaPanel2;
    private JPanel AssignCoursePanel;


    private JLabel title;
    private JLabel title2;
    private JLabel title3;
    private JLabel title4;
    private JLabel title5;
    private JLabel title6;
    private JLabel AssignCourseTitle;
    private JLabel l1;
    private JLabel l2;
    private JLabel l3;
    private JLabel l4;
    private JLabel l5;
    private JLabel l6;
    private JLabel l7;
    private JLabel l8;
    private JLabel l9;
    private JLabel gpa;
    private JLabel report;

    private JFrame frame;

    private JButton b1;
    private JButton b2;
    private JButton b3;
    private JButton b4;
    private JButton b5;
    private JButton b6;
    private JButton AssignCourseButton;
    

    private JTextField t1;
    private JTextField t3;
    private JTextField t4;
    private JTextField t5;
    private JTextField id1;
    private JTextField id2;
    private JTextField id3;
    private JTextField AC_CourseName ;
    private JTextField AC_SID ;

    private String[] faculties = {"Computer Science", "Engineering", "Business", "Arts", "Science"};
    private JComboBox<String> FdropList = new JComboBox<>(faculties);

    private String Grades[] = {"A+","A","A-","B+","B","B-","C+","C","C-","D+","D","D-" ,"F"};
    private JComboBox<String> GdropList = new JComboBox<>(Grades);

    private ArrayList<Students> studentsList;
    private ArrayList<Course> courseList;

    public GUI(ArrayList<Students> studentsList, ArrayList<Course> courseList){

        this.studentsList = studentsList;
        this.courseList = courseList;

        // setting objects of the libraries imported 

        JFrame frame = new JFrame("Student Grading System");
        JLabel title = new JLabel("Student Grading System");
        JLabel title2 = new JLabel("Add Student");
        JLabel title3 = new JLabel("Add Course");
        JLabel title4 = new JLabel("Assign Grades");
        JLabel title5 = new JLabel("Calculate GPA");
        JLabel title6 = new JLabel("Generate Report Card");
        JLabel AssignCourseTitle = new JLabel("Enroll Course (Student)");
        JLabel gpa = new JLabel("GPA");
        JLabel report = new JLabel("Report Card");


        JPanel homePanel = new JPanel(null);
        JPanel studentPanel = new JPanel(null);
        JPanel coursePanel = new JPanel(null);
        JPanel gradePanel = new JPanel(null);
        JPanel gpaPanel = new JPanel(null);
        JPanel reportPanel = new JPanel(null);
        JPanel reportPanel2 = new JPanel(null);
        JPanel gpaPanel2 = new JPanel(null);
        JPanel AssignCoursePanel = new JPanel(null);

        JButton b1 = new JButton("Add Student");
        JButton b2 = new JButton("Add Course");
        JButton b3 = new JButton("Assign Grades");
        JButton b4 = new JButton("Calculate GPA");
        JButton b5 = new JButton("Generate Report Card");
        JButton AssignCourseButton = new JButton("Assign Course (Student)");
        JButton b6 = new JButton("Exit");

        JButton backButton1 = new JButton("Back");
        JButton backButton2 = new JButton("Back");
        JButton backButton3 = new JButton("Back");
        JButton backButton4 = new JButton("Back");
        JButton backButton5 = new JButton("Back");
        JButton backButton6 = new JButton("Back");
        JButton backButton7 = new JButton("Back");
        JButton backAssignCourse = new JButton("Back");
        
        
        JButton submit1 = new JButton("Submit");
        JButton submit2 = new JButton("Submit");
        JButton submit3 = new JButton("Submit");
        JButton submit4 = new JButton("Submit");
        JButton submit5 = new JButton("Submit");
        JButton AssignCourseSubmit = new JButton("Submit");


        // setting text Fields and labels for student panel 

        JTextField t1 = new JTextField();
        JLabel l1 = new JLabel("Enter Your Name");
        // JTextField t2 = new JTextField();
        JLabel l2 = new JLabel("Enter Your Faculty");


        // setting text Fields and labels for course panel 

        JTextField t3 = new JTextField();
        JLabel l3 = new JLabel("Enter Your Course Name");
        JTextField t4 = new JTextField();
        JLabel l4 = new JLabel("Enter The Credit Hours");


        // setting text Fields and labels for assigning grades panel 

        JTextField t5 = new JTextField();
        JLabel l5 = new JLabel("Enter The Course Name");
        // JTextField t6 = new JTextField();
        JLabel l6 = new JLabel("Enter The Grade");

        JTextField id3 = new JTextField();
        JLabel l9 = new JLabel("Enter Your ID");
        // JTextField t7 = new JTextField();
        // JLabel l10 = new JLabel("Enter The Credit Hours");



        // setting text Fields and labels for calculate gpa panel 

        JTextField id1 = new JTextField();
        JLabel l7 = new JLabel("Enter Your ID");



        // setting text Fields and labels for generate report card panel 

        JTextField id2 = new JTextField();
        JLabel l8 = new JLabel("Enter Your ID");

        //AssignCoursePanel

        JLabel AC_SID = new JLabel("Enter Student ID");
        JTextField AC_SId = new JTextField();
        JTextField AC_CourseName = new JTextField();
        JLabel AC_Name = new JLabel("Enter Course Name");



        // setting up the window

        frame.setSize(800, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setLayout(null);   // disables layout manager to use setBounds() freely
        

        // setting the title "Student Grading System"

        title.setBounds(215, 40, 400, 50);
        title.setFont(new Font("Arial", Font.BOLD, 28));



        // setting bounds for buttons

        b1.setBounds(50, 160, 200, 50); 
        b2.setBounds(275, 160, 200, 50);
        b3.setBounds(500, 160, 200, 50);
        b4.setBounds(50, 260, 200, 50); 
        b5.setBounds(275, 260, 200, 50);
        AssignCourseButton.setBounds(500, 260, 200, 50);
        b6.setBounds(275, 410, 200, 50);
        
        


        backButton1.setBounds(300, 500, 150, 40);
        backButton2.setBounds(300, 500, 150, 40);
        backButton3.setBounds(300, 500, 150, 40);
        backButton4.setBounds(300, 500, 150, 40);
        backButton5.setBounds(300, 500, 150, 40);
        backButton6.setBounds(300, 500, 150, 40);
        backButton7.setBounds(300, 500, 150, 40);
        backAssignCourse.setBounds(300, 500, 150, 40);


        submit1.setBounds(300, 400, 150, 40);
        submit2.setBounds(300, 400, 150, 40);
        submit3.setBounds(300, 430, 150, 40);
        submit4.setBounds(300, 400, 150, 40);
        submit5.setBounds(300, 400, 150, 40);
        AssignCourseSubmit.setBounds(300, 400, 150, 40);




        // setting the bounds and font for the student panel

        l1.setBounds(50, 150, 250, 40);
        l1.setFont(new Font("Arial", Font.BOLD, 20));
        t1.setBounds(250, 150, 250, 40);
        l2.setBounds(50, 250, 250, 40);
        l2.setFont(new Font("Arial", Font.BOLD, 20));
        // t2.setBounds(250, 250, 250, 40);
        title2.setBounds(300, 40, 400, 50);
        title2.setFont(new Font("Arial", Font.BOLD, 28));
        FdropList.setBounds(250, 250, 250, 40);




        // setting the bounds and font for the course panel
        l3.setBounds(50, 150, 250, 40);
        l3.setFont(new Font("Arial", Font.BOLD, 20));
        t3.setBounds(350, 150, 250, 40);
        l4.setBounds(50, 250, 250, 40);
        l4.setFont(new Font("Arial", Font.BOLD, 20));
        t4.setBounds(350, 250, 250, 40);
        title3.setBounds(300, 40, 400, 50);
        title3.setFont(new Font("Arial", Font.BOLD, 28));

        // setting the bounds and font for the assign course panel
        AssignCourseTitle.setBounds(300, 40, 400, 50);
        AssignCourseTitle.setFont(new Font("Arial", Font.BOLD, 28));
        AC_Name.setBounds(50, 150, 250, 40);
        AC_Name.setFont(new Font("Arial", Font.BOLD, 20));
        AC_CourseName.setBounds(350, 150, 250, 40);
        AC_SID.setBounds(50, 220, 250, 40);
        AC_SID.setFont(new Font("Arial", Font.BOLD, 20));
        AC_SId.setBounds(350, 220, 250, 40);
        

        // setting the bounds and font for the assigning grade panel

        l5.setBounds(50, 150, 250, 40);
        l5.setFont(new Font("Arial", Font.BOLD, 20));
        t5.setBounds(350, 150, 250, 40);
        l6.setBounds(50, 220, 250, 40);
        l6.setFont(new Font("Arial", Font.BOLD, 20));
        GdropList.setBounds(350, 220, 250, 40);
        title4.setBounds(300, 40, 400, 50);
        title4.setFont(new Font("Arial", Font.BOLD, 28));

        l9.setBounds(50, 290, 250, 40);
        l9.setFont(new Font("Arial", Font.BOLD, 20));
        id3.setBounds(350, 290, 250, 40);



        // setting the bounds and font for the calculate gpa panel

        l7.setBounds(50, 150, 250, 40);
        l7.setFont(new Font("Arial", Font.BOLD, 20));
        id1.setBounds(250, 150, 250, 40);
        title5.setBounds(275, 40, 400, 50);
        title5.setFont(new Font("Arial", Font.BOLD, 28));



        // setting the bounds and font for the generate report card panel

        l8.setBounds(50, 150, 250, 40);
        l8.setFont(new Font("Arial", Font.BOLD, 20));
        id2.setBounds(250, 150, 250, 40);
        title6.setBounds(250, 40, 400, 50);
        title6.setFont(new Font("Arial", Font.BOLD, 28));



        // setting the title of the gpa in the second panel of gpa 

        gpa.setBounds(315, 80, 400, 50);
        gpa.setFont(new Font("Arial", Font.BOLD, 50));

        

        // setting the title of the report in the second panel of report card 

        report.setBounds(270, 40, 400, 50);
        report.setFont(new Font("Arial", Font.BOLD, 40));



        // setting a label to show the gpa on the second gpa panel

        JLabel gpaFinal = new JLabel();
        gpaFinal.setBounds(315, 250, 400, 50);
        gpaFinal.setFont(new Font("Arial", Font.BOLD, 50));
        gpaPanel2.add(gpaFinal);




        // setting the labels to show the report information on the second repoirt panel

        JLabel nameReport = new JLabel();
        JLabel idReport = new JLabel();
        JLabel facultyReport = new JLabel();
        JLabel gpaReport = new JLabel();
        JLabel courseReport = new JLabel();

        nameReport.setBounds(50, 110, 600, 50);
        idReport.setBounds(50, 180, 400, 50);
        facultyReport.setBounds(50, 250, 400, 50);
        gpaReport.setBounds(50, 320, 400, 50);
        courseReport.setBounds(50, 390, 3000, 50);

        nameReport.setFont(new Font("Arial", Font.BOLD, 30));
        idReport.setFont(new Font("Arial", Font.BOLD, 30));
        facultyReport.setFont(new Font("Arial", Font.BOLD, 30));
        gpaReport.setFont(new Font("Arial", Font.BOLD, 30));
        courseReport.setFont(new Font("Arial", Font.BOLD, 30));

        


        // addding every thing to its panel

        homePanel.add(title);
        homePanel.add(b1);
        homePanel.add(b2);
        homePanel.add(b3);
        homePanel.add(b4);
        homePanel.add(b5);
        homePanel.add(AssignCourseButton);
        homePanel.add(b6);


        studentPanel.add(backButton1);
        studentPanel.add(submit1);
        studentPanel.add(t1);
        studentPanel.add(l1);
        studentPanel.add(l2);
        studentPanel.add(FdropList);
        studentPanel.add(title2);


        coursePanel.add(backButton2);
        coursePanel.add(submit2);
        coursePanel.add(t3);
        coursePanel.add(l3);
        coursePanel.add(t4);
        coursePanel.add(l4);
        coursePanel.add(title3);


        gradePanel.add(backButton3);
        gradePanel.add(submit3);
        gradePanel.add(t5);
        gradePanel.add(l5);
        gradePanel.add(GdropList);
        gradePanel.add(l6);
        gradePanel.add(title4);
        gradePanel.add(l9);
        gradePanel.add(id3);

        AssignCoursePanel.add(backAssignCourse);
        AssignCoursePanel.add(AssignCourseSubmit);
        AssignCoursePanel.add(AC_CourseName);
        AssignCoursePanel.add(AC_Name);
        AssignCoursePanel.add(AssignCourseTitle);
        AssignCoursePanel.add(AC_SId);
        AssignCoursePanel.add(AC_SID);


        gpaPanel.add(backButton4);
        gpaPanel.add(id1);
        gpaPanel.add(l7);
        gpaPanel.add(title5);
        gpaPanel.add(submit4);

        reportPanel.add(backButton5);
        reportPanel.add(id2);
        reportPanel.add(l8);
        reportPanel.add(title6);
        reportPanel.add(submit5);


        gpaPanel2.add(backButton6);
        gpaPanel2.add(gpa);


        reportPanel2.add(backButton7);
        reportPanel2.add(report);      
        reportPanel2.add(nameReport);
        reportPanel2.add(idReport);
        reportPanel2.add(facultyReport);
        reportPanel2.add(gpaReport);
        reportPanel2.add(courseReport);
        

        // adding every panel to the window

        frame.add(homePanel);
        frame.add(studentPanel);
        frame.add(coursePanel);
        frame.add(gradePanel);
        frame.add(gpaPanel);
        frame.add(reportPanel);
        frame.add(reportPanel2);
        frame.add(gpaPanel2);
        frame.add(AssignCoursePanel);

        

        // setting bounds of the panels

        homePanel.setBounds(0, 0, 800, 600);
        studentPanel.setBounds(0, 0, 800, 600);
        coursePanel.setBounds(0, 0, 800, 600);
        gradePanel.setBounds(0, 0, 800, 600);
        gpaPanel.setBounds(0, 0, 800, 600);
        reportPanel.setBounds(0, 0, 800, 600);
        reportPanel2.setBounds(0, 0, 800, 600);
        gpaPanel2.setBounds(0, 0, 800, 600);
        AssignCoursePanel.setBounds(0, 0, 800, 600);

        

        // setting panels to be invisible

        studentPanel.setVisible(false);
        coursePanel.setVisible(false);
        gradePanel.setVisible(false);
        gpaPanel.setVisible(false);
        reportPanel.setVisible(false);
        reportPanel2.setVisible(false);
        gpaPanel2.setVisible(false);
        AssignCoursePanel.setVisible(false);
        

       
        


        // setting the actions when pressing the buttons



        b1.addActionListener(f -> {homePanel.setVisible(false);
            studentPanel.setVisible(true);} );

        b2.addActionListener(f -> {homePanel.setVisible(false);
            coursePanel.setVisible(true);} );
            
        b3.addActionListener(f -> {homePanel.setVisible(false);
            gradePanel.setVisible(true);} );

        b4.addActionListener(f -> {homePanel.setVisible(false);
            gpaPanel.setVisible(true);} );

        b5.addActionListener(f -> {homePanel.setVisible(false);
            reportPanel.setVisible(true);} );

        b6.addActionListener(f -> System.exit(0));

        AssignCourseButton.addActionListener(f -> {homePanel.setVisible(false);
            AssignCoursePanel.setVisible(true);} );
        

        backButton1.addActionListener(f -> {homePanel.setVisible(true);
            studentPanel.setVisible(false);} );

        backButton2.addActionListener(f -> {homePanel.setVisible(true);
            coursePanel.setVisible(false);} );
            
        backButton3.addActionListener(f -> {homePanel.setVisible(true);
            gradePanel.setVisible(false);} );

        backButton4.addActionListener(f -> {homePanel.setVisible(true);
            gpaPanel.setVisible(false);} );

        backButton5.addActionListener(f -> {homePanel.setVisible(true);
            reportPanel.setVisible(false);} );

        backButton6.addActionListener(f -> {homePanel.setVisible(false);
            gpaPanel.setVisible(true);
            gpaPanel2.setVisible(false);} );

        backButton7.addActionListener(f -> {homePanel.setVisible(false);
            reportPanel.setVisible(true);
            reportPanel2.setVisible(false);} );

        backAssignCourse.addActionListener(f -> {homePanel.setVisible(true);
            AssignCoursePanel.setVisible(false);} );
    



        
        submit1.addActionListener(f -> {

            String studentName = t1.getText();
            String Faculty = (String) FdropList.getSelectedItem();

            if ((isEmpty(studentName))) {
                JOptionPane.showMessageDialog(frame, "Please fill in all fields.", "Input Error", JOptionPane.ERROR_MESSAGE);
                return; 
            }
            
            if(!isValidName(studentName)){
                JOptionPane.showMessageDialog(frame ,"Name is Invalid" , "Input Error", JOptionPane.ERROR_MESSAGE) ;
                return  ; 
            }
    
            if(!isValidFaculty(Faculty)){
                JOptionPane.showMessageDialog(frame ,"Faculty Name is Invalid is Invalid" , "Input Error", JOptionPane.ERROR_MESSAGE) ;
                return  ; 
            }

            if (isStudent(studentName)) {
                JOptionPane.showMessageDialog(frame, "Student already exists.", "Input Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

            Students student = new Students() ;
            student.Set_Name(studentName);
            student.Set_Faculty(Faculty);
            studentsList.add(student);
            int id = student.Get_ID();
            System.out.println("Student Name: " + studentName);
            System.out.println("Faculty: " + Faculty);
            System.out.println("Your ID is:"+id);
            JOptionPane.showMessageDialog(frame, "Student added!\nYour ID is: " + id);      
        } 
        );
            

        submit2.addActionListener(f -> {

            String courseName = t3.getText();
            String creditHours = t4.getText();

            if((isEmpty(courseName ,creditHours))) {
                JOptionPane.showMessageDialog(frame, "Please fill in all fields.", "Input Error", JOptionPane.ERROR_MESSAGE);
                return; 
            }

            if(isCourse(courseName)){
                JOptionPane.showMessageDialog(frame ,"Course Already Exist" , "Input Error", JOptionPane.ERROR_MESSAGE) ;
                return  ; 
            }

            if(!(isInt(creditHours))) {
                JOptionPane.showMessageDialog(frame, "Invalid Credit Hours.", "Input Error", JOptionPane.ERROR_MESSAGE);
                return; 
            }

            int CreditHours = Integer.parseInt(creditHours);
            Course course = new Course(courseName, CreditHours);
            courseList.add(course);
            System.out.println("Course Name: " + courseName);
            System.out.println("Credit Hours: " + CreditHours);
            JOptionPane.showMessageDialog(frame, "Course Add Succefully\n " + "Course Name: " + courseName + "\n" + "CreditHours" + creditHours); 
        } 
        );


        submit3.addActionListener(f -> {

            String courseName = t5.getText();
            String grade = (String) GdropList.getSelectedItem();
            String idNo = id3.getText();
            if (isEmpty(courseName, grade, idNo)){
                JOptionPane.showMessageDialog(frame, "Please fill in all fields.", "Input Error", JOptionPane.ERROR_MESSAGE);
                return; 
            }
            if(!isInt(idNo)){
                JOptionPane.showMessageDialog(frame ,"ID is Invalid" , "Input Error", JOptionPane.ERROR_MESSAGE) ;
                return  ; 
            }

            int ID = Integer.parseInt(idNo);

            double g = Grade(grade);

            Students selectedStudent = FindStudent(ID);
            if (selectedStudent == null) {
                JOptionPane.showMessageDialog(frame, "Student not found!", "Input Error", JOptionPane.ERROR_MESSAGE) ;
                return; 
            }

            Course c = FindCourse(courseName);
            if (c == null) {
                JOptionPane.showMessageDialog(frame, "Course not found!", "Input Error", JOptionPane.ERROR_MESSAGE) ;
                return; 
            }
            selectedStudent.AssignGradeToCourse(courseName, g);
            System.out.println("grades assigned successfully.");
            System.out.println("ID Number: " + idNo);
            System.out.println("Course Assigned Grade: " + courseName);
            System.out.println("Grade: " + grade);
        }
        );

        submit4.addActionListener(f -> {
            
            String idNo = id1.getText();
            homePanel.setVisible(false);
            gpaPanel.setVisible(false);          // leh ma7tooteen hena 
            gpaPanel2.setVisible(true);

            if (isEmpty(idNo)) {
                JOptionPane.showMessageDialog(frame, "Please fill in all fields.", "Input Error", JOptionPane.ERROR_MESSAGE);
                return; 
            }
            if (!isInt(idNo)) {
                JOptionPane.showMessageDialog(frame, "Invalid ID.", "Input Error", JOptionPane.ERROR_MESSAGE);
                return; 
            }
            
            Students selectedStudent = FindStudent(Integer.parseInt(idNo));

            if (selectedStudent == null){
                JOptionPane.showMessageDialog(frame, "Student not found!", "Input Error", JOptionPane.ERROR_MESSAGE) ;
                return;
            }
            
            String calculateGpa = String.format("%.2f", selectedStudent.Calculate_GPA());
            gpaFinal.setText(calculateGpa);
            
        } 
        );



        submit5.addActionListener(f -> {
            
            String idNo = id2.getText();
            homePanel.setVisible(false);
            reportPanel.setVisible(false);
            reportPanel2.setVisible(true);

            if (isEmpty(idNo)) {
                JOptionPane.showMessageDialog(frame, "Please fill in all fields.", "Input Error", JOptionPane.ERROR_MESSAGE);
                return; 
            }
            if (!isInt(idNo)) {
                JOptionPane.showMessageDialog(frame, "Invalid ID.", "Input Error", JOptionPane.ERROR_MESSAGE) ;
                return; 
            }
            int ID2 = Integer.parseInt(idNo);
            Students selectedStudent = FindStudent(ID2);
            if (selectedStudent == null){
               JOptionPane.showMessageDialog(frame , "Student not found!" , "Input Error", JOptionPane.ERROR_MESSAGE) ;
                return;
            }
            else{
                nameReport.setText("Name: " + selectedStudent.Get_Name());
                idReport.setText("ID: " + ID2);
                facultyReport.setText("Faculty: " + selectedStudent.Get_Faculty());
                gpaReport.setText("GPA: " + selectedStudent.Get_GPA());
                courseReport.setText("Courses: " + selectedStudent.Get_Courses());
            }
        } 
        );
        AssignCourseSubmit.addActionListener(f -> {
            String courseName = AC_CourseName.getText();
            String idNo = AC_SId.getText();

            if (isEmpty(courseName, idNo)) {
                JOptionPane.showMessageDialog(frame, "Please fill in all fields.", "Input Error", JOptionPane.ERROR_MESSAGE);
                return; 
            }
            if (!isInt(idNo)) {
                JOptionPane.showMessageDialog(frame, "Invalid ID.", "Input Error", JOptionPane.ERROR_MESSAGE) ;
                return; 
            }
            
            Students selectedStudent = FindStudent(Integer.parseInt(idNo));
            if (selectedStudent == null){
               JOptionPane.showMessageDialog(frame , "Student not found!" , "Input Error", JOptionPane.ERROR_MESSAGE) ;
                return;
            }
            
            Course c = FindCourse(courseName);
            if (c == null) {
                JOptionPane.showMessageDialog(frame, "Course not found!", "Input Error", JOptionPane.ERROR_MESSAGE) ;
                return; 
            }
            
            selectedStudent.AddCourse(c);
        } 
        );
    }


    private double Grade(String grade) {
        switch (grade) {
            case "A+" : {
                return 4.0;
            }
            case "A": {
                return 4.0;
            }
            case "A-" : {
                return 3.7;
            }
            case "B+" : {
                return 3.3;
            }
            case "B" : {
                return 3.0;
            }
            case "B-" : {
                return 2.7;
            }
            case "C+" : {
                return 2.3;
            }
            case "C" : {
                return 2.0;
            }
            case "C-" : {
                return 1.7;
            }
            case "D+" : {
                return 1.3;
            }
            case "D" : {
                return 1.0 ;
            }
            case "D-" : {
                return 0.7;
            }
            default : {
                return 0.0;
            } 
        }
    }

    private boolean isValidName(String name) {
        for (char c : name.toCharArray()) {
            if (!Character.isLetter(c)) {
                return false;
            }
        }
        return true;
    }

    private boolean isValidFaculty(String faculty) {
        for (char c : faculty.toCharArray()) {
            if (!Character.isLetter(c) && c != ' ') {
                return false;
            }
        }
        return true;
    }

    private boolean isStudent(String name) {
        for (Students s : studentsList) {
            if (s.Get_Name().equals(name)) {
                return true;
            }
        }
        return false;
    }

    private boolean isCourse(String course) {
        for (Course c : courseList) {
            if (c.Get_CourseName().equals(course)) {
                return true;
            }
        }
        return false;
    }

    private boolean isEmpty(String str) {
        return str.isEmpty();
    }
    private boolean isEmpty(String str1, String str2) {
        return (str1.isEmpty() || str2.isEmpty());
    }
    private boolean isEmpty(String str1, String str2, String str3) {
        return (str1.isEmpty() || str2.isEmpty() || str3.isEmpty());
    }

    private boolean isInt(String str) {
        try {
            Integer.parseInt(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    private Students FindStudent(int id) {
        for (Students s : studentsList) {
            if (s.Get_ID() == id) {
                return s;
            }
        }
        return null;
    }
    private Course FindCourse(String course) {
        for (Course c : courseList) {
            if (c.Get_CourseName().equals(course)) {
                return c;
            }
        }
        return null;
    }
}