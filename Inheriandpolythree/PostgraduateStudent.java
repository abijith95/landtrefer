class PostgraduateStudent extends Student {
    
    public PostgraduateStudent(String name,int rollno,String course,String specialization)
    {
    	super(name,rollno,course,specialization);
    }
    
    public void display()
    {
    	 System.out.println("Student Details:");
    	 System.out.println("Name: "+name);
    	 System.out.println("Roll Number: "+rollno);
    	 System.out.println("Course: "+course);
    	 System.out.println("Specialization: "+specialization);;
    
    }
}