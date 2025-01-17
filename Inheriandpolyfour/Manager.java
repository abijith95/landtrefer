// Derived class for Manager

class Manager extends FullTimeEmployee {
    public Manager(String name,int employeeid,double salary,String department)
    {
    	super(name,employeeid,salary,department);
    }
    
    public void display()
    {
      	System.out.println("Employee Details:");	
	  System.out.println("Name: "+name);
	  System.out.println("Employee ID: "+employeeid);
	  System.out.println("Salary: $"+salary);
	  System.out.println("Department: "+department);
    }
}

