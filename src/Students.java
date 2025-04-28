import java.util.ArrayList;
public class Students {

//students attribute :>
    private String Name = "" ;
    private String Faculty = "" ; 
    private int ID ;
    private static int IDCounter = 0 ;
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

        if(Courses.add(course)){ 
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
                return;
            }
        }
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

    public String toString(){

        String tt = "" ; 

        for( Course course  : Courses){

            tt += course.Get_CourseName() + " : " + course.Get_Grade() + "\n" ;
        }

        return  tt ;
    }

}
