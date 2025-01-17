// Concrete subclass for Undergraduate Students
class UndergraduateStudent extends Student {
    public UndergraduateStudent(String name,int rollno,String course)
     {
         super(name,rollno,course);
     }
     
     public void display()
     {
       System.out.println("Undergraduate Student Details:");
       System.out.println("Name: "+name);
       System.out.println("Roll Number: "+rollno);
       System.out.println("Major: "+course);
       
         
     }
}
