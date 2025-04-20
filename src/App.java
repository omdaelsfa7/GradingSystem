import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);
        List<Students> studentsList = new ArrayList<>();
        List<Course> courseList = new ArrayList<>();

        boolean exit = false;
        Students selectedStudent = null;
        int studentID;
        System.out.println("<< Welcome to Grading System>>");
        while(!exit){
            
            System.out.println("1. Add Student");
            System.out.println("2. Add Course");
            System.out.println("3. Assign Grades and Courses");
            System.out.println("4. Show Students");
            System.out.println("5. Show Courses");
            System.out.println("6. Calculate GPA");
            System.out.println("7. Generate Report Card");
            System.out.println("8. exit");
            int select = scanner.nextInt();
            scanner.nextLine();

            switch (select) {
                case 1:
                    Students student;
                    System.out.println("Enter details for Student " + ":");

                    System.out.print("What's your Name: ");
                    String name = scanner.nextLine();
        
                    System.out.print("What's your Faculty: ");
                    String faculty = scanner.nextLine();
        
                    student = new Students(name, faculty);
                    studentsList.add(student);
                    System.out.println("Your Name: "+ student.Get_Name() + " Your ID: " + student.Get_ID());
                break;
            
                case 2:
                    
                    System.out.println("Enter details for Course " + ":");

                    System.out.print("Course Name: ");
                    String courseName = scanner.nextLine();

                    System.out.print("Credit Hours: ");
                    int creditHours = scanner.nextInt();

                    System.out.print("Grade: ");
                    double grade = scanner.nextDouble();
                    scanner.nextLine(); 

                    Course course = new Course(courseName, creditHours);
                    course.Set_Grades(grade);
                    courseList.add(course);
                break;

                case 3:
                    System.out.println("Enter Student ID to assign Grades and Courses");
                    studentID = scanner.nextInt();
                    scanner.nextLine();

                    //: = for-each
                    for (Students s : studentsList) {
                        if (s.Get_ID() == studentID) {
                            selectedStudent = s;
                            break;
                        }
                    }

                    if (selectedStudent == null){
                        System.out.println("Student not found!");
                    }
                    else{
                        System.out.println("How many courses do you want to assign?");
                        int numCourses = scanner.nextInt();
                        scanner.nextLine();

                        for (int j = 0; j < numCourses; j++) {
                            System.out.print("Course Name: ");
                            String cname = scanner.nextLine();

                            System.out.print("Credit Hours: ");
                            int chours = scanner.nextInt();

                            System.out.print("Grade: ");
                            double g = scanner.nextDouble();
                            scanner.nextLine();

                            Course c = new Course(cname, chours);
                            c.Set_Grades(g);
                            selectedStudent.AddCourse(c);
                            selectedStudent.AssignGradeToCourse(cname, g);
                        }

                        System.out.println("Courses and grades assigned successfully.");

                    }
                break;
                case 4:
                    System.out.println("Enter Student ID to view details.");
                    studentID = scanner.nextInt();
                    scanner.nextLine();

                    for (Students s : studentsList) {
                        if (s.Get_ID() == studentID) {
                            selectedStudent = s;
                            break;
                        }
                    }

                    if (selectedStudent == null){
                        System.out.println("Student not found!");
                    }
                    else{
                        
                        for (Students s : studentsList){
                            if(s.Get_ID() == studentID){
                                selectedStudent = s;
                                System.out.println("Name: "+ s.Get_Name());
                                System.out.println("ID: "+ s.Get_ID());
                                System.out.println("Faculty: "+ s.Get_Faculty());
                                if(s.Get_Courses() == null){
                                System.out.println("Not Assigned To courses");
                                }
                                else{
                                    System.out.println("Courses: "+ s.Get_Courses());
                                }

                            }
                        }
                    }
                break;
                case 5:
                    if (courseList.isEmpty()){
                        System.out.println("course not found!");
                    }
                    else{
                    for(Course c : courseList){
                        System.out.println("Course Name:"+ c.Get_CourseName());
                        System.out.println("Credit Hours:"+ c.Get_Credits());
                        System.out.println("Grade:"+ c.Get_Grade());
                        System.out.println("*=====================*");
                    }
                }
                break;

                case 6:
                    System.out.println("Enter Studetn ID to Calculate GPA");
                    studentID = scanner.nextInt();
                    scanner.nextLine();
                    
                    for (Students s : studentsList) {
                        if (s.Get_ID() == studentID) {
                            selectedStudent = s;
                            break;
                        }
                    }

                    if (selectedStudent == null){
                        System.out.println("Student not found!");
                    }
                    else{
                        System.out.println("Your GPA is:"+ selectedStudent.Calculate_GPA());
                    }
                break;

                case 7:
                    System.out.println("Enter Student ID to Create ReportCard");
                    studentID = scanner.nextInt();
                    scanner.nextLine();
                    
                    for (Students s : studentsList) {
                        if (s.Get_ID() == studentID) {
                            selectedStudent = s;
                            break;
                        }
                    }

                    if (selectedStudent == null){
                        System.out.println("Student not found!");
                    }
                    else{
                    ReportCard reportCard = new ReportCard(selectedStudent);
                    reportCard.generateReportCard();
                    }
                break;

                case 8:
                    exit = true;
                    System.out.println("Exiting the program :)");
                break;

                default:
                    System.out.println("Invaled option. please try again");
                    break;
            }


        }

        


        scanner.close();

    }  
}
