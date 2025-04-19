public class App {
    public static void main(String[] args) throws Exception {
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
    }   
}
