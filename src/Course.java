class Course{

    private String CourseName;
    private int CreditHours;
    private Double Grade = 0.0; // to be modified
    
    public Course(String CourseName, int CreditHours){
        this.CourseName = CourseName;
        this.CreditHours = CreditHours;
    }
    
    public void Set_Name(String CourseName){
        try{
            this.CourseName = CourseName;    
        }
        catch(Exception e){
            System.out.println("Use Valid Name ");
        }
        
    }
    
    public void Set_Credits(int CreditHours){
        try{
            this.CreditHours = CreditHours; 
        }
       catch(Exception e){
        System.out.println("Use Invalid Number");
       }
    }
    
    public void Set_Grades(Double Grade){
        this.Grade = Grade;
    }
    
    public Double Get_Grade(){
        return Grade;
    }

    public int Get_Credits(){
        return CreditHours ;    
    }

    public double Get_Quailty_points(){
        return CreditHours * Grade ; 
    }
    
    public String Get_CourseName(){
        return CourseName ; 
    }
    
}