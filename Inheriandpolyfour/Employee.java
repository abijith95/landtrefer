// Base class Employee
abstract class Employee {
	String name;
	int employeeid;
	double salary;
	String department;
	
	public Employee(String name,int employeeid,double salary,String department)
	{
	   this.name = name;
	   this.employeeid = employeeid;
	   this.salary = salary;
	   this.department = department;
	}	
	abstract void display();
   
}
