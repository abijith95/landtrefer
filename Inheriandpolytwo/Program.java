//Employee Salary Calculation using Polymorphism


// Write a Java program using polymorphism to calculate the salary of employees based on their designation(Salesperson or Manager) .
// Base salary is Rs.5000 for Manager and Rs.3000. for Salesperson. 
// Salespersons are given commission rate of 0.05 . 
// Salary of Manager is the sum of basesalary and bonus . 
// Salary of Salesperson is the sum of basesalary and commission ,where commision is the product of bonus and commision rate.
// Prompt the user to enter name, designation, and bonus separated by spaces. 
// Print "Invalid input format. Please provide name, designation, and bonus separated by spaces." ,for the invalid input format.
// Name and Designation should be alphabetical values. Else print ,"Invalid name. 
// Name should only contain alphabetical characters."/ "Invalid designation.
// Designation should only contain alphabetical characters." 
// Bonus is a numerical value. Else Print "Bonus should be a numeric value .
// "Give error message for invalid input and invalid input format."
// Print "Invalid designation. Available designations: salesperson, manager",for invalid designation input .

// Hints
// Salary calculation for salesperson: commission = bonus * commissionRate, salary = baseSalary + commission Salary calculation for manager: salary = baseSalary + bonus
// Constraints
// Name / Designation should be alphabetical values and Bonus is a numerical value. Input format: Name, Designation, and bonus separated by spaces.
// Sample Input 1
// edwin manager 2000
// Sample Output 1
// Name: edwin, Bonus: $2000.0, Salary: $7000.0
// Sample Input 2
// @#$% manager 2000
// Sample Output 2
// Invalid name. Name should only contain alphabetical characters.
// Sample Input 3
// Anu 1234 2000
// Sample Output 3
// Invalid designation. Designation should only contain alphabetical characters.
// Sample Input 4
// Anu manager HR
// Sample Output 4
// Bonus should be a numeric value.
// Sample Input 5
// Anu manager HR 1000
// Sample Output 5
// Invalid input format. Please provide name, designation, and bonus separated by spaces.
// Sample Input 6
// Anu salesperson 1000
// Sample Output 6
// Name: Anu, Bonus: $1000.0, Salary: $3050.0
// Sample Input 7
// Anu developer 1000
// Sample Output 7
// Invalid designation. Available designations: salesperson, manager

import java.lang.*;
import java.util.*;

abstract class Employee
{
  	String name;
  	String designation;
  	double bonus;
  	double basesalary;
  	
  	public Employee(String name,String designation,double bonus)
  	{
  	   this.name = name;
  	   this.designation = designation;
  	   this.bonus = bonus;
  	}
  	
  	abstract double calculatesalary();
}

class Manager extends Employee
{
   public Manager(String name,String designation,double bonus)
   {
   	  super(name,designation,bonus);
   	  this.basesalary = 5000;
   }
   
   double calculatesalary()
   {
      return basesalary + bonus;
   }
	
}


class Salesperson extends Employee
{
   public Salesperson(String name,String designation,double bonus)
   { 
   	 super(name,designation,bonus);
   	 this.basesalary = 3000;
   }
   
   double calculatesalary()
   { 
   	  return basesalary + (bonus * 0.05);
   }
 	
}

/* Name of the class has to be "Main" only if the class is public. */
class Program
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine().trim();
		
		String[] str = s.split(" ");
		
		if(str.length != 3)
		{
			System.out.println( "Invalid input format. Please provide name, designation, and bonus separated by spaces.");
			return;
		}
		
		
		String name = str[0];
		String designation = str[1].toLowerCase();
		String bonusstr = str[2];
		
		if(!name.matches("[a-zA-Z]+"))
		{
		  System.out.println("Invalid name. Name should only contain alphabetical characters.");
		  return;
		}
		
		if(!designation.matches("[a-zA-Z]+"))
		{
		   System.out.println("Invalid designation. Designation should only contain alphabetical characters.");
		   return;
		}
		double bonus;
		try{
			 bonus = Double.parseDouble(bonusstr);
			}catch(NumberFormatException e)
			{
			   System.out.println("Bonus should be a numeric value.");	
			   return;
			}
			
		Employee employee = null;
	    switch(designation)
	    {
	       case "manager":
	       	   employee = new Manager(name,designation,bonus);
	       	   break;
	       	
	       case "salesperson":
	           employee = new Salesperson(name,designation,bonus);
	           break;
	        
	        default:
	           System.out.println("Invalid designation. Available designations: salesperson, manager");
	           return;
	    }
	                                                                                                                                                 
	    
	    System.out.println("Name: "+name+", Bonus: $"+bonus+", Salary: $"+employee.calculatesalary());
			                                                                      
			
	}
}