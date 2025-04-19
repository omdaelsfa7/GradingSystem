import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Number of Students: ");
        int i = scanner.nextInt();
        scanner.nextLine();
        List<Students> studentsList = new ArrayList<>();

        //Student Info Inputs
        for (int count = 1; count < i; count++) {
            System.out.println("Enter details for Student " + ":");

            System.out.print("What's your Name: ");
            String name = scanner.nextLine();

            System.out.print("What's your Faculty: ");
            String faculty = scanner.nextLine();

            Students student = new Students(name, faculty);

            System.out.print("How many courses are you taking? ");
            int numberOfCourses = scanner.nextInt();
            scanner.nextLine(); 
            //Courses Info Inputs
            for (int j = 0; j < numberOfCourses; j++) {
                System.out.println("Enter details for Course " + (j + 1) + ":");

                System.out.print("Course Name: ");
                String courseName = scanner.nextLine();

                System.out.print("Credit Hours: ");
                int creditHours = scanner.nextInt();

                System.out.print("Grade: ");
                double grade = scanner.nextDouble();
                scanner.nextLine(); 

                Course course = new Course(courseName, creditHours);
                course.Set_Grades(grade);
                student.AddCourse(course);
            }

            studentsList.add(student);
        }    
        // Generate ReportCard
        for (Students student : studentsList) {
            ReportCard reportCard = new ReportCard(student);
            reportCard.generateReportCard();
        }


        scanner.close();

    }  
}
