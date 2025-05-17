import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Students {

//students attribute :>
    private String Name = "" ;
    private String Faculty = "" ; 
    private int ID ;
    private static int IDCounter = 231000 ;
    private ArrayList<Course> Courses = new ArrayList<Course>() ; 
    private double GPA = 0 ; 

// Parametrized Constructor 
    Students(String Name , String Faculty){

        this.Name = Name ;
        this.ID = ++IDCounter ;
        this.Faculty = Faculty ; 

    }

//Setters
    public void Set_Name(String Name){
        this.Name = Name ;
    }

    public void Set_Faculty(String Faculty){
        this.Faculty = Faculty ;
        Courses.clear();
    }

//Getters
    public String Get_Name(){
        return this.Name ; 
    }

    public String Get_Faculty(){
        return Faculty ; 
    }

    public String Get_Courses(){
        String String_Courses = null ;
        for (int i = 0 ; i < Courses.size() ; i++ ){
            String_Courses = Courses.get(i) + "\n" ;
        }
        return String_Courses ; 
    }
    
    public int Get_ID(){
        return  ID ;
    }

    public double Get_GPA(){
        return GPA ; 
    }

//methods

    public void AddCourse(Course course){

        for (Course c : Courses) {
            if (c.Get_CourseName().equals(course.Get_CourseName())){ 
                JOptionPane.showMessageDialog(null, "Student is already enrolled in this course!", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
        }

        if(Courses.add(course)){ 
            JOptionPane.showMessageDialog(null, "Course Added Successfully", "Success", JOptionPane.INFORMATION_MESSAGE);
            System.out.println("Course Added Succefully");
            return ;
        }
        System.out.println("error while Adding Course");
    }




    public void AssignGradeToCourse(String CourseName, double Grade) {
        for (Course course : Courses) {
            if (course.Get_CourseName().equalsIgnoreCase(CourseName)) {
                course.Set_Grades(Grade);
                System.out.println("Grade assigned to course: " + CourseName);
                JOptionPane.showMessageDialog(null, "Course Grade Assigned Successfully\n " + "ID Number: " + Get_ID() + "\nCourse Assigned Grade: " + CourseName + "\nGrade: " + Grade, "Success", JOptionPane.INFORMATION_MESSAGE);
                return;
            }
        }
        JOptionPane.showMessageDialog(null, "Student is not enrolled in this course!", "Error", JOptionPane.ERROR_MESSAGE);
        System.out.println("Course not found.");
    }



    
    public double Calculate_GPA(){

        int Credit_Hours = 0 ;
        double Quality_Points = 0 ; 
        for (int i = 0 ; i < Courses.size() ; i++){
            Credit_Hours += Courses.get(i).Get_Credits() ;
            Quality_Points += Courses.get(i).Get_Quailty_points() ; 
        }
        if(Quality_Points != 0 ){
            double gpa =   Quality_Points / Credit_Hours ;
            gpa = Math.round(gpa * 100.0) / 100.0; 
            GPA = gpa ;
            return gpa ;
            }
        return 0 ; 
    }

    public void RemoveCourse(Course course){

        for (Course c : Courses) {
            if (c.Get_CourseName().equals(course.Get_CourseName())){ 
                Courses.remove(c);
                return;
            }
        }
    }

    public String courseString(){

        String tt = "" ; 

        for( Course course  : Courses){

            tt += "|" + "  " + course.Get_CourseName() + " : " + course.Get_Grade() + "  " + "|" + " \n " ;
        }

        return  tt ;
    }

    @Override
    public String toString(){

        String tt = "" ; 

        for( Course course  : Courses){

            tt += course.Get_CourseName() + " : " + course.Get_Grade() + "\n" ;
        }

        return "Student Name: " + Name +"\n" + 
                "ID: " + ID + "\n" +
                "Faculty: " + Faculty + "\n" +
                "GPA: " + Calculate_GPA() + "\n" + 
                tt ;
    }


}
