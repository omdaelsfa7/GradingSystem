class Course {
   private String CourseName;
   private int CreditHours;
   private Double Grade = 0.0;

   public Course(String var1, int var2) {
      this.CourseName = var1;
      this.CreditHours = var2;
   }

   public void Set_Name(String var1) {
      this.CourseName = var1;
   }

   public void Set_Credits(int var1) {
      this.CreditHours = var1;
   }

   public void Set_Grades(Double var1) {
      this.Grade = var1;
   }

   public Double Get_Grade() {
      return this.Grade;
   }

   public int Get_Credits() {
      return this.CreditHours;
   }

   public double Get_Quailty_points() {
      return (double)this.CreditHours * this.Grade;
   }

   public String Get_CourseName() {
      return this.CourseName;
   }
}