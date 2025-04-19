
public class ReportCard {
    //attributs
    Students student;
    
    //constructor
    ReportCard(Students student){
        
        this.student = student;
    }
    //methods
    public void generateReportCard(){

        student.Get_Name();
        student.Get_Courses();
        student.Get_Faculty();
        student.Get_ID();
        student.Calculate_GPA();
        
    }	

}
