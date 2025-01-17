// Hierarchical Inheritance - Student Information System

// Develop a Java program for managing student information. 
// The program should prompt the user to input details such as name, roll number, course, and either the year (for undergraduate students) or the specialization (for postgraduate students). 
// Based on the input, the program should create objects of respective student types (Undergraduate or Postgraduate) and display their details. 
// Student Information Input: 
// Prompt the user to input the following details: 
// Student Name ,Roll Number, Course Year (for undergraduates) or Specialization (for postgraduates). 
// Ensure proper handling of input for both integer and string values. 
// Student Object Creation : 
// Based on the provided information, create objects for either Undergraduate or Postgraduate students. 
// Display Student Details :
// Display the details of the student created (either an Undergraduate or Postgraduate), including their name, roll number, course, and specific details based on their category. 
// Error Handling : 
// Validate inputs to ensure they meet the expected data types (e.g., roll number as an integer, year as an integer for undergraduates, specialization as a string for postgraduates).

// Hints
// Utilize a scanner to receive user inputs.Implement separate classes for UndergraduateStudent and PostgraduateStudent, and display their details using a method (e.g., displayDetails()).
// Constraints
// Differentiate between the input being a number (for undergraduates) or a string (for postgraduates) to create the appropriate student object.
// Sample Input 1
// John
// 102
// Computer Science
// 2
// Sample Output 1
// Student Details:
// Name: John
// Roll Number: 102
// Course: Computer Science
// Year: 2
// Sample Input 2
// Smith
// 103
// Mathematics
// Data Science
// Sample Output 2
// Student Details:
// Name: Smith
// Roll Number: 103
// Course: Mathematics
// Specialization: Data Science
// Sample Input 3
// Alex
// 104
// Physics
// 3
// Sample Output 3
// Student Details:
// Name: Alex
// Roll Number: 104
// Course: Physics
// Year: 3


import java.util.Scanner;

// Base class Student

class Program {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	
    	String name = sc.nextLine();
    	int rollno = sc.nextInt();
    	sc.nextLine();
    	String course = sc.nextLine();
    	String yearOrspecialization = sc.nextLine();
    	
    	
    	Student student = null;
    	try
    	{
    		int year = Integer.parseInt(yearOrspecialization);
    		student = new UndergraduateStudent(name,rollno,course,year);
    	}
    	catch(NumberFormatException e){
    	      	String specialization = yearOrspecialization;
    		student = new PostgraduateStudent(name,rollno,course,specialization);
    	
    		}
    		
    	  student.display();
    	  sc.close();

 }
}