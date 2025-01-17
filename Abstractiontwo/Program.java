import java.util.Scanner;

// Question :::

// STUDENT INFORMATION MANAGEMENT SYSTEM WITH INHERITANCE AND POLYMORPHISM

// Design a Java program for managing student information, specifically focusing on two types of students: undergraduate and graduate. 
// The program should allow users to input details such as the student's name, roll number, and student type. 
// Based on the provided student type (U for Undergraduate or G for Graduate), the program should prompt for additional information. 
// For undergraduate students, the major should be collected, while for graduate students, the research area should be recorded. 
// Print "Invalid student type." for the invalid student type input.
// Finally, the program should display the student's details, including their name, roll number, and relevant field of study. 
// Input format: 
// [Student Name]  [ Student Roll Number]  [ Student Type (U/G for Undergraduate/Graduate)] 
// For an Undergraduate Student: 
// [Student Name] [ Student Roll Number] U [Major] , 
// For a Graduate Student: 
// [Student Name] [ Student Roll Number] G [Major]

// Hints
// Output format: Undergraduate Student Details: Name: [Student Name] Roll Number: [Roll Number] Major: [Major] Graduate Student Details: Name: [Student Name] Roll Number: [Roll Number] Research Area: [Research Area]
// Constraints
// None
// Sample Input 1
// John
// 12345
// U
// Computer Science
// Sample Output 1
// Undergraduate Student Details:
// Name: John
// Roll Number: 12345
// Major: Computer Science
// Sample Input 2
// Alice
// 67890
// G
// Artifical Intelligence
// Sample Output 2
// Graduate Student Details:
// Name: Alice
// Roll Number: 67890
// Research Area: Artifical Intelligence
// Sample Input 3
// Bob
// 55555
// X
// Sample Output 3
// Invalid student type.


// Abstract class for Student
abstract class Student {
     String name;
     int rollno;
     String course;
     
     public Student(String name,int rollno,String course)
     {
     	this.name = name;
     	this.rollno = rollno;
     	this.course = course;
     }
     
     abstract void display();
}
 class Program {
    public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          
           try {
           		String name = sc.nextLine();
           int rollno = sc.nextInt();
           sc.nextLine();
           char graduate = sc.next().toUpperCase().charAt(0);
           sc.nextLine();
           String course = sc.nextLine();
           Student stu = null;
           if(graduate == 'G')
           {
             	stu = new GraduateStudent(name,rollno,course);
           }
           else if(graduate == 'U')
           {
              stu = new UndergraduateStudent(name,rollno,course);	
           }
           else
           {
              System.out.println("Invalid student type.");	
              return;
           }
           
           stu.display();
           } catch(Exception e) {
           	System.out.println("Invalid student type.");
           }
           finally{
           	  sc.close();
           	}   
  }
}