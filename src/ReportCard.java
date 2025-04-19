
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
        //Display
        System.out.println("Student Name:"+ student.Get_Name());
        System.out.println("Student ID:"+ student.Get_ID());
        System.out.println("Faculty:"+ student.Get_Faculty());
        System.out.println("Courses:"+ student.Get_Courses());
        System.out.println("GPA:"+ student.Get_GPA());
    }	

}