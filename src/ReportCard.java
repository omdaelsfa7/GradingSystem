
public class ReportCard {
    //attributs
    Students student;
    
    //constructor
    ReportCard(Students student){
        
        this.student = student;
    }
    //methods
    public void generateReportCard(){

        System.out.println(student);
    }	

}
