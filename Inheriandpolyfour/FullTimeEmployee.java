// Derived class for Full-Time Employee
class FullTimeEmployee extends Employee {
    String department;
    
   public FullTimeEmployee(String name,int employeeid,double salary,String department)
   {
       super(name,employeeid,salary,department);
       this.department = department;
   }
   
   public void display()
   {
     System.out.println("Employee Details:");	
     System.out.println("Name: "+name);
     System.out.println("Employee ID: "+employeeid);
     System.out.println("Salary: $"+salary);
   }
   
}

