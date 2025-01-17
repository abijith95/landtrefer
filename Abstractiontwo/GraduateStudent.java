// Concrete subclass for Graduate Students
class GraduateStudent extends Student {
    public GraduateStudent(String name,int rollno,String course)
    {
        super(name,rollno,course);
    }
    
    public void display()
    {
      System.out.println("Graduate Student Details:");
      System.out.println("Name: "+name);
      System.out.println("Roll Number: "+rollno);
      System.out.println("Research Area: "+course);
        
    }
  
  }
