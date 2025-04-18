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
        this.ID = IDCounter++ ;
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

    public double Calculate_GPA(){

        int Credit_Hours = 0 ;
        int Quality_Points = 0 ; 
        for (int i = 0 ; i < Courses.size() ; i++){
            // Credit_Hours += Courses.get(i).Get_Credits() ;
            // Quality_Points = Courses.get(i).Get_Quailty_points() ; hanzwdha fel Courses Credit Hour * grade 
        }
        try{
            double gpa = Credit_Hours / Quality_Points ;
            this.GPA = gpa ;
            return gpa ;
        }
        catch( ArithmeticException e){
            System.out.println(e);
        }
        return 0.0 ; 

    }

}
