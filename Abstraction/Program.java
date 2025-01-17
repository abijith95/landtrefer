import java.util.Scanner;


abstract class Employee {
   String name;
   int employeeid;
   double salary;
   String job;
   
 public Employee(String name,int employeeid,double salary,String job)
   {
   	 this.name = name;
   	 this.employeeid = employeeid;
   	 this.salary = salary;
   	 this.job = job;
   	 
    }
    
    abstract void display();
}

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        int employeeid = sc.nextInt();
        sc.nextLine();
        double salary = sc.nextDouble();
        sc.nextLine();
        String job = sc.nextLine();
        
        
        Employee emp = new FullTimeEmployee(name,employeeid,salary,job);
        
        emp.display();
  } 
}