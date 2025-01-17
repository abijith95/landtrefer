//Multilevel Inheritance in Employee Information Management


// You are tasked with creating a simple Java program to manage employee information for a company. This program will differentiate between general full-time employees and managers, capturing specific details for each.

// You need to implement the program to accept input from the user, create an appropriate object based on the input (either a FullTimeEmployee or a Manager), and then display the details of the created object. 
// Prompt the user to enter below details for an employee in separate lines.
// Employee Name (String)
// Employee ID (Integer)
// Salary (Double)
// Department (String)
// The user should enter a department name for managers or press Enter without typing anything for non-managers.
// Determine whether the entered employee is a general full-time employee or a manager based on the input. 
// Display the details of the employee after creating the appropriate object. 
// Output Format:
// If the employee is a manager, display : 
// Employee Details: Name: [name] 
// Employee ID: [employeeId]
// Salary: $[salary]
// Department: [department] 
// If the employee is a non-manager full-time employee, display: 
// Employee Details:
// Name: [name]
// Employee ID: [employeeId]
// Salary: $[salary].

// Hints
// In Output,each piece of information should be displayed on a separate line.
// Constraints
// None
// Sample Input 1
// John
// 102
// 60000
// IT Skilling
// Sample Output 1
// Employee Details:
// Name: John
// Employee ID: 102
// Salary: $60000.0
// Department: IT Skilling
// Sample Input 2
// Jane
// 103
// 75000
// Human Resources
// Sample Output 2
// Employee Details:
// Name: Jane
// Employee ID: 103
// Salary: $75000.0
// Department: Human Resources
// Sample Input 3
// Mark
// 104
// 55000
// Assessment
// Sample Output 3
// Employee Details:
// Name: Mark
// Employee ID: 104
// Salary: $55000.0
// Department: Assessment

import java.util.Scanner;

 class Program {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	
    	String name = sc.nextLine();
    	int employeeid = sc.nextInt();
    	sc.nextLine();
    	double salary = sc.nextInt();
    	sc.nextLine();
    	String department = sc.nextLine();
    	
    	if(department.isEmpty()){
    		  Employee emp = new FullTimeEmployee(name,employeeid,salary,department);
    		  
    		  emp.display();
    		}
    	else{
    		 FullTimeEmployee fullemp = new Manager(name,employeeid,salary,department);
    		 
    		 fullemp.display();
    		}
         	
  }
}