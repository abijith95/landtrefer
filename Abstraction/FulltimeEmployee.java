class FullTimeEmployee extends Employee {
	
	public FullTimeEmployee(String name,int employeeid,double salary,String job)
	{
		super(name,employeeid,salary,job);
	}
	
	public void display()
	{
	 System.out.println("Full-Time Employee Details:");
	 System.out.println("Name: "+name);
	 System.out.println("Employee ID: "+employeeid);
	 System.out.println("Salary: $"+salary);
	 System.out.println("Job Title: "+job);
		
    }
}