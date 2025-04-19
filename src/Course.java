class Course{

    public String CourseName;
    public int CreditHours;
    public Double Grade = 0.0;
    
    Course(String CourseName, int CreditHours){
        this.CourseName = CourseName;
        this.CreditHours = CreditHours;
    }
    
    public void Set_Name(String CourseName){
        this.CourseName = CourseName;
    }
    
    public void Set_Credits(int CreditHours){
        this.CreditHours = CreditHours;
    }
    
    public void Set_Grades(Double Grade){
        this.Grade = Grade;
    }
    
    public Double Get_Grades(){
        return Grade;
    }
    
}