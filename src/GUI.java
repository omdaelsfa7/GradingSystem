import java.awt.Font;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;


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


    private JLabel titleFrame;
    private JLabel titleStudent;
    private JLabel titleCourse;
    private JLabel titleGrades;
    private JLabel titleGPA;
    private JLabel titleReport;
    private JLabel AssignCourseTitle;
    private JLabel titleGPA2;
    private JLabel titleReport2;
    private JLabel studentNameLabel;
    private JLabel studentFacultyLabel;
    private JLabel courseNameLabel;
    private JLabel creditsLabel;
    private JLabel courseNameLabel2;
    private JLabel gradeLabel;
    private JLabel idGradeLabel;
    private JLabel idGpaLabel;
    private JLabel idReportLabel;
    

    private JFrame frame;

    private JButton addStudent;
    private JButton addCourse;
    private JButton assignGrade;
    private JButton calculateGPA;
    private JButton generateReportCard;
    private JButton AssignCourseButton;
    private JButton exitButton;
    

    private JTextField studentTextField;
    private JTextField courseTextField;

    private JTextField AG_id;
    private JTextField AC_id;
    private JTextField GPA_id;
    private JTextField RC_id;
    

    private String[] Faculties = {"Computer Science", "Engineering", "Business", "Arts", "Science"};
    private JComboBox<String> FacultyDropList = new JComboBox<>(Faculties);

    private String[] Grades = {"A+","A","A-","B+","B","B-","C+","C","C-","D+","D","D-"};
    private JComboBox<String> GradeDropList = new JComboBox<>(Grades);
    
    private String[] CreditHours = {"1", "2", "3", "4", "5"};
    private JComboBox<String> CreditsDropList = new JComboBox<>(CreditHours); 

    ArrayList<String> CourseArr = new ArrayList<>();
    private JComboBox<String> CourseDropList = new JComboBox<>(CourseArr.toArray(new String[0]));
    private JComboBox<String> CourseDropList2 = new JComboBox<>(CourseArr.toArray(new String[0]));


    
    private ArrayList<Students> studentsList;
    private ArrayList<Course> courseList;
    Students selectedStudent = null;


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



    public GUI(ArrayList<Students> studentsList, ArrayList<Course> courseList){

        this.studentsList = studentsList;
        this.courseList = courseList;

        // setting objects of the libraries imported 

        JFrame frame = new JFrame("Student Grading System");
        JLabel titleFrame = new JLabel("Student Grading System");
        JLabel titleStudent = new JLabel("Add Student");
        JLabel titleCourse = new JLabel("Add Course");
        JLabel titleGrades = new JLabel("Assign Grades");
        JLabel titleGPA = new JLabel("Calculate GPA");
        JLabel titleReport = new JLabel("Generate Report Card");
        JLabel AssignCourseTitle = new JLabel("Enroll Course (Student)");
        JLabel titleGPA2 = new JLabel("GPA");
        JLabel titleReport2 = new JLabel("Report Card");


        JPanel homePanel = new JPanel(null);
        JPanel studentPanel = new JPanel(null);
        JPanel coursePanel = new JPanel(null);
        JPanel gradePanel = new JPanel(null);
        JPanel gpaPanel = new JPanel(null);
        JPanel reportPanel = new JPanel(null);
        JPanel reportPanel2 = new JPanel(null);
        JPanel gpaPanel2 = new JPanel(null);
        JPanel AssignCoursePanel = new JPanel(null);
        JPanel removePanel = new JPanel(null);
        JPanel removeStudentPanel = new JPanel(null);
        JPanel removeCoursePanel = new JPanel(null);

        JButton addStudent = new JButton("Add Student");
        JButton addCourse = new JButton("Add Course");
        JButton assignGrade = new JButton("Assign Grades");
        JButton calculateGPA = new JButton("Calculate GPA");
        JButton generateReportCard = new JButton("Generate Report Card");
        JButton AssignCourseButton = new JButton("Assign Course (Student)");
        JButton exitButton = new JButton("Exit");

        
        JButton backButton1 = new JButton("Back");
        JButton backButton2 = new JButton("Back");
        JButton backButton3 = new JButton("Back");
        JButton backButton4 = new JButton("Back");
        JButton backButton5 = new JButton("Back");
        JButton backButton6 = new JButton("Back");
        JButton backButton7 = new JButton("Back");
        JButton AssignCourseBackButton = new JButton("Back");
        
        
        JButton submit1 = new JButton("Submit");
        JButton submit2 = new JButton("Submit");
        JButton submit3 = new JButton("Submit");
        JButton submit4 = new JButton("Submit");
        JButton submit5 = new JButton("Submit");
        JButton AssignCourseSubmit = new JButton("Submit");



        // setting text Fields and labels for student panel 

        JTextField studentTextField = new JTextField();
        JLabel studentNameLabel = new JLabel("Enter Your Name");
        JLabel studentFacultyLabel = new JLabel("Enter Your Faculty");


        // setting text Fields and labels for course panel 

        JTextField courseTextField = new JTextField();
        JLabel courseNameLabel = new JLabel("Enter Your Course Name");
        JLabel creditsLabel = new JLabel("Enter The Credit Hours");


        // setting text Fields and labels for assigning grades panel 

        JLabel courseNameLabel2 = new JLabel("Enter The Course Name");
        JLabel gradeLabel = new JLabel("Enter The Grade");
        JLabel idGradeLabel = new JLabel("Enter Your ID");
        JTextField AG_id = new JTextField();



        // setting text Fields and labels for calculate gpa panel 

        JLabel idGpaLabel = new JLabel("Enter Your ID");
        JTextField GPA_id = new JTextField();


        // setting text Fields and labels for generate report card panel 

        JLabel idReportLabel = new JLabel("Enter Your ID");
        JTextField RC_id = new JTextField();

        //AssignCoursePanel

        JLabel AC_SID = new JLabel("Enter Student ID");
        JLabel AC_Name = new JLabel("Enter Course Name");
        JTextField AC_id = new JTextField();



        // setting up the window

        frame.setSize(800, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setLayout(null);   // disables layout manager to use setBounds() freely
        

        // setting the title "Student Grading System"

        titleFrame.setBounds(215, 40, 400, 50);
        titleFrame.setFont(new Font("Arial", Font.BOLD, 28));



        // setting bounds for buttons

        addStudent.setBounds(50, 160, 200, 50); 
        addCourse.setBounds(275, 160, 200, 50);
        assignGrade.setBounds(500, 160, 200, 50);
        calculateGPA.setBounds(50, 260, 200, 50); 
        generateReportCard.setBounds(275, 260, 200, 50);
        AssignCourseButton.setBounds(500, 260, 200, 50);
        exitButton.setBounds(275, 410, 200, 50);
        backButton1.setBounds(300, 500, 150, 40);
        backButton2.setBounds(300, 500, 150, 40);
        backButton3.setBounds(300, 500, 150, 40);
        backButton4.setBounds(300, 500, 150, 40);
        backButton5.setBounds(300, 500, 150, 40);
        backButton6.setBounds(300, 500, 150, 40);
        backButton7.setBounds(300, 500, 150, 40);
        AssignCourseBackButton.setBounds(300, 500, 150, 40);
        submit1.setBounds(300, 400, 150, 40);
        submit2.setBounds(300, 400, 150, 40);
        submit3.setBounds(300, 430, 150, 40);
        submit4.setBounds(300, 400, 150, 40);
        submit5.setBounds(300, 400, 150, 40);
        AssignCourseSubmit.setBounds(300, 400, 150, 40);


        // setting the bounds and font for the student panel

        studentNameLabel.setBounds(50, 150, 250, 40);
        studentNameLabel.setFont(new Font("Arial", Font.BOLD, 20));
        studentTextField.setBounds(250, 150, 250, 40);
        studentFacultyLabel.setBounds(50, 250, 250, 40);
        studentFacultyLabel.setFont(new Font("Arial", Font.BOLD, 20));
        FacultyDropList.setBounds(250, 250, 250, 40);
        titleStudent.setBounds(300, 40, 400, 50);
        titleStudent.setFont(new Font("Arial", Font.BOLD, 28));




        // setting the bounds and font for the course panel
        courseNameLabel.setBounds(50, 150, 250, 40);
        courseNameLabel.setFont(new Font("Arial", Font.BOLD, 20));
        courseTextField.setBounds(350, 150, 250, 40);
        creditsLabel.setBounds(50, 250, 250, 40);
        creditsLabel.setFont(new Font("Arial", Font.BOLD, 20));
        CreditsDropList.setBounds(350, 250, 250, 40);
        titleCourse.setBounds(300, 40, 400, 50);
        titleCourse.setFont(new Font("Arial", Font.BOLD, 28));



        // setting the bounds and font for the assigning grade panel

        courseNameLabel2.setBounds(50, 150, 250, 40);
        courseNameLabel2.setFont(new Font("Arial", Font.BOLD, 20));
        CourseDropList.setBounds(350, 150, 250, 40);
        gradeLabel.setBounds(50, 220, 250, 40);
        gradeLabel.setFont(new Font("Arial", Font.BOLD, 20));
        GradeDropList.setBounds(350, 220, 250, 40);
        titleGrades.setBounds(300, 40, 400, 50);
        titleGrades.setFont(new Font("Arial", Font.BOLD, 28));

        idGradeLabel.setBounds(50, 290, 250, 40);
        idGradeLabel.setFont(new Font("Arial", Font.BOLD, 20));
        AG_id.setBounds(350, 290, 250, 40);



        // setting the bounds and font for the calculate gpa panel

        idGpaLabel.setBounds(50, 150, 250, 40);
        idGpaLabel.setFont(new Font("Arial", Font.BOLD, 20));
        GPA_id.setBounds(250, 150, 250, 40);
        titleGPA.setBounds(275, 40, 400, 50);
        titleGPA.setFont(new Font("Arial", Font.BOLD, 28));



        // setting the bounds and font for the generate report card panel

        idReportLabel.setBounds(50, 150, 250, 40);
        idReportLabel.setFont(new Font("Arial", Font.BOLD, 20));
        RC_id.setBounds(250, 150, 250, 40);
        titleReport.setBounds(250, 40, 400, 50);
        titleReport.setFont(new Font("Arial", Font.BOLD, 28));



        // setting the title of the gpa in the second panel of gpa 

        titleGPA2.setBounds(315, 80, 400, 50);
        titleGPA2.setFont(new Font("Arial", Font.BOLD, 50));

        

        // setting the title of the report in the second panel of report card 

        titleReport2.setBounds(270, 40, 400, 50);
        titleReport2.setFont(new Font("Arial", Font.BOLD, 40));



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
        courseReport.setBounds(50, 390, 1000000, 50);

        nameReport.setFont(new Font("Arial", Font.BOLD, 30));
        idReport.setFont(new Font("Arial", Font.BOLD, 30));
        facultyReport.setFont(new Font("Arial", Font.BOLD, 30));
        gpaReport.setFont(new Font("Arial", Font.BOLD, 30));
        courseReport.setFont(new Font("Arial", Font.BOLD, 30));
        


        // setting the bounds and font for the assign course panel

        AssignCourseTitle.setBounds(225, 40, 400, 50);
        AssignCourseTitle.setFont(new Font("Arial", Font.BOLD, 28));
        AC_Name.setBounds(50, 150, 250, 40);
        AC_Name.setFont(new Font("Arial", Font.BOLD, 20));
        CourseDropList2.setBounds(350, 150, 250, 40);
        AC_SID.setBounds(50, 240, 250, 40);
        AC_SID.setFont(new Font("Arial", Font.BOLD, 20));
        AC_id.setBounds(350, 240, 250, 40);






        // adding Remove Student/Course  


        JTextField removeId1 = new JTextField();
        removeId1.setBounds(250, 150, 250, 40);

        JTextField removeCourseName = new JTextField();
        removeCourseName.setBounds(250, 150, 250, 40);

        JLabel removeId1Label = new JLabel("Enter Your ID");
        removeId1Label.setBounds(50, 150, 250, 40);
        removeId1Label.setFont(new Font("Arial", Font.BOLD, 20));


        JLabel removeId2Label = new JLabel("Enter course name");
        removeId2Label.setBounds(50, 150, 250, 40);
        removeId2Label.setFont(new Font("Arial", Font.BOLD, 20));


        JLabel removeTitle = new JLabel("Remove Student/Course");
        removeTitle.setBounds(220, 50, 450, 40);
        removeTitle.setFont(new Font("Arial", Font.BOLD, 30));
        
        JLabel removeStudentTitle = new JLabel("Remove Student");
        removeStudentTitle.setBounds(280, 50, 250, 40);
        removeStudentTitle.setFont(new Font("Arial", Font.BOLD, 30));

        JLabel removeCourseTitle = new JLabel("Remove Course");
        removeCourseTitle.setBounds(280, 50, 250, 40);
        removeCourseTitle.setFont(new Font("Arial", Font.BOLD, 30));


        JButton removeButton = new JButton("Remove Student/Course");
        removeButton.setBounds(275, 330, 200, 50);

        JButton removeStudentButton = new JButton("Remove Student");
        removeStudentButton.setBounds(50, 150, 250, 40);

        JButton removeCourseButton = new JButton("Remove Course");
        removeCourseButton.setBounds(450, 150, 250, 40);

        JButton RemovebackButton = new JButton("Back");
        RemovebackButton.setBounds(300, 500, 150, 40);

        JButton RemoveStudentbackButton = new JButton("Back");
        RemoveStudentbackButton.setBounds(300, 500, 150, 40);

        JButton RemoveCoursebackButton = new JButton("Back");
        RemoveCoursebackButton.setBounds(300, 500, 150, 40);

        JButton removeStudentSubmit = new JButton("Submit");
        removeStudentSubmit.setBounds(300, 400, 150, 40);

        JButton removeCourseSubmit = new JButton("Submit");
        removeCourseSubmit.setBounds(300, 400, 150, 40);









        // setting backgrounds for panels

        JLabel greyBackground = new JLabel(new ImageIcon("/home/omarzohrin/Documents/Github/GradingSystem/Backgrounds/Grey.jpg"));
        JLabel greyBackground2 = new JLabel(new ImageIcon("/home/omarzohrin/Documents/Github/GradingSystem/Backgrounds/Grey.jpg"));
        JLabel greyBackground3 = new JLabel(new ImageIcon("/home/omarzohrin/Documents/Github/GradingSystem/Backgrounds/Grey.jpg"));
        JLabel greyBackground4 = new JLabel(new ImageIcon("/home/omarzohrin/Documents/Github/GradingSystem/Backgrounds/Grey.jpg"));
        JLabel greyBackground5 = new JLabel(new ImageIcon("/home/omarzohrin/Documents/Github/GradingSystem/Backgrounds/Grey.jpg"));
        JLabel greyBackground6 = new JLabel(new ImageIcon("/home/omarzohrin/Documents/Github/GradingSystem/Backgrounds/Grey.jpg"));
        JLabel greyBackground7 = new JLabel(new ImageIcon("/home/omarzohrin/Documents/Github/GradingSystem/Backgrounds/Grey.jpg"));
        JLabel greyBackground8 = new JLabel(new ImageIcon("/home/omarzohrin/Documents/Github/GradingSystem/Backgrounds/Grey.jpg"));
        JLabel greyBackground9 = new JLabel(new ImageIcon("/home/omarzohrin/Documents/Github/GradingSystem/Backgrounds/Grey.jpg"));
        JLabel greyBackground10 = new JLabel(new ImageIcon("/home/omarzohrin/Documents/Github/GradingSystem/Backgrounds/Grey.jpg"));
        
        greyBackground.setLayout(null);
        greyBackground2.setLayout(null);
        greyBackground3.setLayout(null);
        greyBackground4.setLayout(null);
        greyBackground5.setLayout(null);
        greyBackground6.setLayout(null);
        greyBackground7.setLayout(null);
        greyBackground8.setLayout(null);
        greyBackground9.setLayout(null);
        greyBackground9.setLayout(null);

        greyBackground.setBounds(40, 145, 260, 50);
        greyBackground2.setBounds(40, 245, 260, 50);
        greyBackground3.setBounds(40, 145, 260, 50);
        greyBackground4.setBounds(40, 215, 260, 50);
        greyBackground5.setBounds(40, 285, 260, 50);
        greyBackground6.setBounds(40, 145, 260, 50);
        greyBackground7.setBounds(40, 235, 260, 50);
        greyBackground8.setBounds(40, 145, 195, 50);
        greyBackground9.setBounds(40, 245, 195, 50);
        greyBackground10.setBounds(252, 223, 225, 100);



        

        JLabel homeBackground = new JLabel(new ImageIcon("/home/omarzohrin/Documents/Github/GradingSystem/Backgrounds/homepanel.jpg"));
        homeBackground.setLayout(null);
        homeBackground.setBounds(0, 0, 800, 600);


        JLabel studentBackground = new JLabel(new ImageIcon("/home/omarzohrin/Documents/Github/GradingSystem/Backgrounds/studentpanel.jpg"));
        studentBackground.setLayout(null);
        studentBackground.setBounds(0, 0, 800, 600);


        JLabel courseBackground = new JLabel(new ImageIcon("/home/omarzohrin/Documents/Github/GradingSystem/Backgrounds/coursepanel.jpg"));
        courseBackground.setLayout(null);
        courseBackground.setBounds(0, 0, 800, 600);



        JLabel assignGradeBackground = new JLabel(new ImageIcon("/home/omarzohrin/Documents/Github/GradingSystem/Backgrounds/assigngradepanel.jpg"));
        assignGradeBackground.setLayout(null);
        assignGradeBackground.setBounds(0, 0, 800, 600);



        JLabel assignCourseBackground = new JLabel(new ImageIcon("/home/omarzohrin/Documents/Github/GradingSystem/Backgrounds/assigncoursepanel.jpg"));
        assignCourseBackground.setLayout(null);
        assignCourseBackground.setBounds(0, 0, 800, 600);


        JLabel gpaBackground = new JLabel(new ImageIcon("/home/omarzohrin/Documents/Github/GradingSystem/Backgrounds/gpa.jpg"));
        JLabel gpaBackground2 = new JLabel(new ImageIcon("/home/omarzohrin/Documents/Github/GradingSystem/Backgrounds/gpa.jpg"));
        gpaBackground.setLayout(null);
        gpaBackground2.setLayout(null);
        gpaBackground.setBounds(0, 0, 800, 600);
        gpaBackground2.setBounds(0, 0, 800, 600);






        
        // adding every thing to its panel

        homePanel.add(titleFrame);
        homePanel.add(addStudent);
        homePanel.add(addCourse);
        homePanel.add(assignGrade);
        homePanel.add(calculateGPA);
        homePanel.add(generateReportCard);
        homePanel.add(AssignCourseButton);
        homePanel.add(exitButton);
        homePanel.add(removeButton);
        homePanel.add(homeBackground);

        studentPanel.add(backButton1);
        studentPanel.add(submit1);
        studentPanel.add(studentTextField);
        studentPanel.add(studentNameLabel);
        studentPanel.add(FacultyDropList);
        studentPanel.add(studentFacultyLabel);
        studentPanel.add(titleStudent);
        studentPanel.add(greyBackground8);
        studentPanel.add(greyBackground9);
        studentPanel.add(studentBackground);

        coursePanel.add(backButton2);
        coursePanel.add(submit2);
        coursePanel.add(courseTextField);
        coursePanel.add(courseNameLabel);
        coursePanel.add(CreditsDropList);
        coursePanel.add(creditsLabel);
        coursePanel.add(titleCourse);
        coursePanel.add(greyBackground);
        coursePanel.add(greyBackground2);
        coursePanel.add(courseBackground);
       


        gradePanel.add(backButton3);
        gradePanel.add(submit3);
        gradePanel.add(CourseDropList);
        gradePanel.add(courseNameLabel2);
        gradePanel.add(GradeDropList);
        gradePanel.add(gradeLabel);
        gradePanel.add(titleGrades);
        gradePanel.add(idGradeLabel);
        gradePanel.add(AG_id);
        gradePanel.add(greyBackground3);
        gradePanel.add(greyBackground4);
        gradePanel.add(greyBackground5);
        gradePanel.add(assignGradeBackground);


        gpaPanel.add(backButton4);
        gpaPanel.add(GPA_id);
        gpaPanel.add(idGpaLabel);
        gpaPanel.add(titleGPA);
        gpaPanel.add(submit4);
        gpaPanel.add(gpaBackground);
        

        reportPanel.add(backButton5);
        reportPanel.add(RC_id);
        reportPanel.add(idReportLabel);
        reportPanel.add(titleReport);
        reportPanel.add(submit5);


        gpaPanel2.add(backButton6);
        gpaPanel2.add(titleGPA2);
        gpaPanel2.add(greyBackground10);
        gpaPanel2.add(gpaBackground2);



        reportPanel2.add(backButton7);
        reportPanel2.add(titleReport2);      
        reportPanel2.add(nameReport);
        reportPanel2.add(idReport);
        reportPanel2.add(facultyReport);
        reportPanel2.add(gpaReport);
        reportPanel2.add(courseReport);
        

        AssignCoursePanel.add(AssignCourseTitle);
        AssignCoursePanel.add(CourseDropList2);
        AssignCoursePanel.add(AC_Name);
        AssignCoursePanel.add(AC_SID);
        AssignCoursePanel.add(AC_id);
        AssignCoursePanel.add(AssignCourseSubmit);
        AssignCoursePanel.add(AssignCourseBackButton);
        AssignCoursePanel.add(greyBackground6);
        AssignCoursePanel.add(greyBackground7);
        AssignCoursePanel.add(assignCourseBackground);


        removePanel.add(removeTitle);
        removePanel.add(removeStudentButton);
        removePanel.add(removeCourseButton);
        removePanel.add(RemovebackButton);


        removeStudentPanel.add(removeStudentTitle);
        removeStudentPanel.add(removeId1);
        removeStudentPanel.add(removeId1Label);
        removeStudentPanel.add(RemoveStudentbackButton);
        removeStudentPanel.add(removeStudentSubmit);


        removeCoursePanel.add(removeCourseTitle);
        removeCoursePanel.add(removeCourseName);
        removeCoursePanel.add(removeId2Label);
        removeCoursePanel.add(RemoveCoursebackButton);
        removeCoursePanel.add(removeCourseSubmit);




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
        frame.add(removePanel);
        frame.add(removeStudentPanel);
        frame.add(removeCoursePanel);
        

        // setting bounds of the panels

        homePanel.setBounds(0, 0, 800, 600);
        studentPanel.setBounds(0, 0, 800, 600);
        coursePanel.setBounds(0, 0, 800, 600);
        gradePanel.setBounds(0, 0, 800, 600);
        gpaPanel.setBounds(0, 0, 800, 600);
        reportPanel.setBounds(0, 0, 800, 600);
        reportPanel2.setBounds(0, 0, 10000, 600);
        gpaPanel2.setBounds(0, 0, 800, 600);
        AssignCoursePanel.setBounds(0, 0, 800, 600);
        removePanel.setBounds(0, 0, 800, 600);
        removeStudentPanel.setBounds(0, 0, 800, 600);
        removeCoursePanel.setBounds(0, 0, 800, 600);

        

        // setting panels to be invisible

        studentPanel.setVisible(false);
        coursePanel.setVisible(false);
        gradePanel.setVisible(false);
        gpaPanel.setVisible(false);
        reportPanel.setVisible(false);
        reportPanel2.setVisible(false);
        gpaPanel2.setVisible(false);
        AssignCoursePanel.setVisible(false);
        removePanel.setVisible(false);
        removeStudentPanel.setVisible(false);
        removeCoursePanel.setVisible(false);

       


        // setting the actions when pressing the buttons



        addStudent.addActionListener(f -> {homePanel.setVisible(false);
            studentPanel.setVisible(true);} );

        addCourse.addActionListener(f -> {homePanel.setVisible(false);
            coursePanel.setVisible(true);} );
            
        assignGrade.addActionListener(f -> {homePanel.setVisible(false);
            gradePanel.setVisible(true);} );

        calculateGPA.addActionListener(f -> {homePanel.setVisible(false);
            gpaPanel.setVisible(true);} );

        generateReportCard.addActionListener(f -> {homePanel.setVisible(false);
            reportPanel.setVisible(true);} );
        
        AssignCourseButton.addActionListener(f -> {homePanel.setVisible(false);
            AssignCoursePanel.setVisible(true);} );
        
        exitButton.addActionListener(f -> System.exit(0));




        removeButton.addActionListener(f -> {homePanel.setVisible(false);
            removePanel.setVisible(true);} );

        removeStudentButton.addActionListener(f -> {homePanel.setVisible(false);
            removePanel.setVisible(false);
            removeStudentPanel.setVisible(true);
        } );

        removeCourseButton.addActionListener(f -> {homePanel.setVisible(false);
            removePanel.setVisible(false);
            removeCoursePanel.setVisible(true);
        } );
        



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
        
        AssignCourseBackButton.addActionListener(f -> {homePanel.setVisible(true);
            AssignCoursePanel.setVisible(false);} );

        
        RemovebackButton.addActionListener(f -> {homePanel.setVisible(true);
            removePanel.setVisible(false);} );

        RemoveStudentbackButton.addActionListener(f -> {homePanel.setVisible(false);
            removePanel.setVisible(true);
            removeStudentPanel.setVisible(false);
        } );

        RemoveCoursebackButton.addActionListener(f -> {homePanel.setVisible(false);
            removePanel.setVisible(true);
            removeCoursePanel.setVisible(false);
        } );




        // add student
        submit1.addActionListener(f -> {
            
            try {

                String studentName = studentTextField.getText();
                String facultyName = (String) FacultyDropList.getSelectedItem();
    
    
                for (Students s : studentsList) {
                    if (s.Get_Name().equals(studentName)) {
                        throw new Exception("This Student has already been added");
                    }
                }
    
                if (!studentName.trim().matches("[a-z A-Z]+")) {
                    throw new Exception("Invalid name! Please enter a Valid Name.");
                }
    
                Students student = new Students(studentName, facultyName);
                studentsList.add(student);
                JOptionPane.showMessageDialog(frame, "Student successfully added\n" + "Name : " + studentName + "\nFaculty : " + facultyName + "\nID : " + student.Get_ID(), "Success", JOptionPane.INFORMATION_MESSAGE);
                System.out.println("Student Name: " + studentName);
                System.out.println("Faculty: " + facultyName);
    

            } 
            
            catch (Exception e) {
                JOptionPane.showMessageDialog(frame, "An unexpected error occurred: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            }

        });
            



        // adding course to the course list
        submit2.addActionListener(f -> {
            
            try {
                String courseName = courseTextField.getText();
                String creditHours = (String) CreditsDropList.getSelectedItem();
                
                if (courseName.trim().isEmpty()){
                    throw new Exception("Please enter a Course Name ");
                }

                if (!courseName.replaceAll("\\s+", "").matches("[a-z A-Z 0-9]+")) {
                    throw new Exception("Invalid Course Name");
                }
                
                if (courseName.replaceAll("\\s+", "").matches("\\d+")) {
                    throw new Exception("Course name cannot be only numbers!");
                }
    
                for (Course c : courseList) {
                    if (c.Get_CourseName().equals(courseName)){ 
                        JOptionPane.showMessageDialog(frame, "Course name has already been Added", "Error", JOptionPane.ERROR_MESSAGE);
                        return;
                    }
                    
                }
                
                int ch = Integer.parseInt(creditHours);
                Course course = new Course(courseName, ch);
                courseList.add(course);
                JOptionPane.showMessageDialog(frame, "Course Successfully Added \n Course : " + courseName + "\nCredit Hours : " + creditHours , "Success", JOptionPane.INFORMATION_MESSAGE);
    
    
                if (!CourseArr.contains(courseName)) { 
                    CourseDropList.addItem(courseName);
                    CourseDropList2.addItem(courseName);
                }
            }
            
            catch (Exception e) {
                JOptionPane.showMessageDialog(frame, "An unexpected error occurred: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            }
        
        
        } );






        // assigning grades to students
        submit3.addActionListener(f -> {
            
            try {
                
                String courseGrade = (String) CourseDropList.getSelectedItem();
                String selectedGrade = (String) GradeDropList.getSelectedItem();
                String idNo3 = AG_id.getText();
    
                if (CourseDropList.getSelectedItem() == null){
                    throw new Exception("Please Choose a Course ");
                }
    
                if (!idNo3.replace("\\s+", "").matches("[0-9]+")) {
                    throw new Exception("Please enter a Valid ID.");
                }
    
    
                int ID3 = Integer.parseInt(idNo3);
                double g = Grade(selectedGrade);
    
                for (Students s : studentsList) {
                    if (s.Get_ID() == ID3) {
                        selectedStudent = s;
                        break;
                    }
                }
                if (selectedStudent == null) {
                    throw new Exception("There is no student with this ID");
                }

    
                Course selectedCourse = null;
                for (Course c : courseList) {
                    if (c.Get_CourseName().equals(courseGrade)) { 
                        selectedCourse = c;
                        break;
                    }
                }
                
                selectedCourse.Set_Grades(g);
                selectedStudent.AssignGradeToCourse(courseGrade, g);
                
    
            }
            
            catch (Exception e) {
                JOptionPane.showMessageDialog(frame, "An unexpected error occurred: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            }
        });







        // calculating gpa of the student
        submit4.addActionListener(f -> {
            
            try {
                String idNo1 = GPA_id.getText();
    
                if (!idNo1.replace("\\s+", "").matches("[0-9]+")) {
                    throw new Exception("Please enter a Valid ID.");
                }
            
                for (Students s : studentsList) {
                    int ID = Integer.parseInt(idNo1);
                    if (s.Get_ID() == ID) {
                        selectedStudent = s;
                        break;
                    }
                }
                if (selectedStudent == null) {
                    throw new Exception("There is no student with this ID");
                    
                }
    
    
                else{
    
                    homePanel.setVisible(false);
                    gpaPanel.setVisible(false);
                    gpaPanel2.setVisible(true);
    
                    String calculateGpa = String.format("%.2f", selectedStudent.Calculate_GPA());
                    gpaFinal.setText(calculateGpa);
                    
                    System.out.println("Your GPA is:"+ selectedStudent.Calculate_GPA());
                }
            } 
            
            catch (Exception e) {
                JOptionPane.showMessageDialog(frame, "An unexpected error occurred: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            }

        } );





        // generating report card of the student
        submit5.addActionListener(f -> { 
            
            try {
                String idNo2 = RC_id.getText();
    
                if (!idNo2.replace("\\s+", "").matches("[0-9]+")) {
                    throw new Exception("Please enter a Valid ID.");
                }
                
    
                for (Students s : studentsList) {
                    int ID2 = Integer.parseInt(idNo2);
                    if (s.Get_ID() == ID2) {
                        selectedStudent = s;
                        break;
                    }
                }
                if (selectedStudent == null) {
                    throw new Exception("There is no student with this ID");
                }
    
                else{
                    homePanel.setVisible(false);
                    reportPanel.setVisible(false);
                    reportPanel2.setVisible(true);
        
                    nameReport.setText("Name: " + selectedStudent.Get_Name());
                    idReport.setText("ID: " + selectedStudent.Get_ID());
                    facultyReport.setText("Faculty: " + selectedStudent.Get_Faculty());
                    gpaReport.setText("GPA: " + selectedStudent.Get_GPA());
                    courseReport.setText("Courses: " + selectedStudent.courseString());
                }
            } 
            
            catch (Exception e) {
                JOptionPane.showMessageDialog(frame, "An unexpected error occurred: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            }
            
        
        } );


        // assigning course to student
        AssignCourseSubmit.addActionListener(f -> {

            try {
                String courseName = (String) CourseDropList2.getSelectedItem();
                String idNo = AC_id.getText();
                
                if (!idNo.replace("\\s+", "").matches("[0-9]+")) {
                    throw new Exception("Please Enter a Valid ID");
                }

                if (CourseDropList2.getSelectedItem() == null){
                    throw new Exception("Please Choose a Valid Course Name");
                }
    
                int i = Integer.parseInt(idNo);
    
                for (Students s : studentsList) {
                    if (s.Get_ID() == i) {
                        selectedStudent = s;
                        break;
                    }
                }
                if (selectedStudent == null) {
                    throw new Exception("There is no student with this ID");
                }
    
                Course selectedCourse = null;
                for (Course c : courseList) {
                    if (c.Get_CourseName().equals(courseName)){ 
                        selectedCourse = c;
                        break;
                    }
                }
                
                Course selectedStudentCourse = new Course(selectedCourse.Get_CourseName(), selectedCourse.Get_Credits());
                //add student to the course
                selectedStudent.AddCourse(selectedStudentCourse);
            }
            
            catch (Exception e) {
                JOptionPane.showMessageDialog(frame, "An unexpected error occurred: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            }
            

        });


        // removing student
        removeStudentSubmit.addActionListener(f -> {

            try {
                String removeid = removeId1.getText();
                
                if (!removeid.replace("\\s+", "").matches("[0-9]+")) {
                    throw new Exception("Please Enter a Valid ID");
                }
    
                int i = Integer.parseInt(removeid);
    
                boolean found = false;
                for (Students s : studentsList) {
                    if (s.Get_ID() == i) {
                        studentsList.remove(s);
                        JOptionPane.showMessageDialog(frame, "Student Removed Successfully", "Success", JOptionPane.INFORMATION_MESSAGE);
                        found = true;
                        break;
                    }
                }

                if (!found) {
                    throw new Exception("There is no student with this ID");
                }
    
            }
            
            catch (Exception e) {
                JOptionPane.showMessageDialog(frame, "An unexpected error occurred: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            }
            

        });

        // removing course
        removeCourseSubmit.addActionListener(f -> {

            try {
                String removeCourse = removeCourseName.getText();
                
                if (removeCourse.trim().isEmpty()){
                    throw new Exception("Please enter a Course Name ");
                }

                if (!removeCourse.replaceAll("\\s+", "").matches("[a-z A-Z 0-9]+")) {
                    throw new Exception("Invalid Course Name");
                }
                
                if (removeCourse.replaceAll("\\s+", "").matches("\\d+")) {
                    throw new Exception("Course name cannot be only numbers!");
                }
    
    
                boolean found = false;
                for (Course c : courseList) {
                    if (c.Get_CourseName().equals(removeCourse)) {
                        courseList.remove(c);
                        CourseDropList.removeItem(removeCourse);
                        CourseDropList2.removeItem(removeCourse);
                        
                        for (Students s : studentsList) {
                            s.RemoveCourse(c);
                        }
                        
                        JOptionPane.showMessageDialog(frame, "Course Removed Successfully", "Success", JOptionPane.INFORMATION_MESSAGE);
                        found = true;
                        break;
                    }
                }

                if (!found) {
                    throw new Exception("There is no course with this name");
                }
    
            }
            
            catch (Exception e) {
                JOptionPane.showMessageDialog(frame, "An unexpected error occurred: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            }
            

        });
    





    }
}
    



