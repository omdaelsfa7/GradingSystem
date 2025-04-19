import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
<<<<<<< Updated upstream
        System.out.println("Hello, World!");
    }
=======
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Number of Students: ");
        int i = scanner.nextInt();
        int count = 0;

        while(count < i){
            System.out.println("Whats your Name: ");
            String Student = scanner.nextLine();
            System.out.println("Whats your ID: ");
            int ID = scanner.nextInt();
            System.out.println("Whats your Faculty: ");
            String Faculty = scanner.nextLine();
            System.out.println("Enter your courses: ");
            String Course = scanner.nextLine();

        }        
        
        Students s1 = new Students("omar " , "CS") ;
        Students s2 = new Students("7oda", "CS") ; 
        Course c1  = new Course("MATH" , 3 ) ; 
        Course c2 = new Course("JAVA", 3);
        s1.AddCourse(c2);
        s1.AddCourse(c1);
        s1.AssignGradeToCourse("MATH", 3.7);
        s1.AssignGradeToCourse("JAVA", 3.7);    
        System.out.println(s1.toString()) ; 
        System.out.println(s2.toString());
        ReportCard r1 = new ReportCard(s1);

        r1.generateReportCard();


        scanner.close();

    }   
>>>>>>> Stashed changes
}
