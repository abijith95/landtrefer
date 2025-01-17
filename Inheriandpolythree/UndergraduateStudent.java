class UndergraduateStudent extends Student {
    public UndergraduateStudent(String name,int rollno,String course,int year)
   {
       super(name,rollno,course,year);
       
   }
    public void display()
   {
        System.out.println("Student Details:");
        System.out.println("Name: "+name);
        System.out.println("Roll Number: "+rollno);
        System.out.println("Course: "+course);
        System.out.println("Year: "+year);
   
   }
}


