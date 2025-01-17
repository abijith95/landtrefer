
//  STUDENT INFORMATION INPUT DETAILS


// Write a Java program that allows the user to input details for a group of students. The program should prompt the user for the number of students and then collect the name and score for each student. After inputting the data, display the details of each student.

// Hints
// Consider using the Scanner class for user input and a custom class to represent a student with name and score.
// Constraints
// The number of students (N) is a positive integer (1 <= N <= 100). The length of the student name is at most 50 characters. The student score is an integer between 0 and 100.
// Sample Input 1
// 3
// Alice
// 85
// Bob
// 92
// Charlie
// 78
// Sample Output 1

// Student details:
// Name: Alice, Score: 85
// Name: Bob, Score: 92
// Name: Charlie, Score: 78
// Sample Input 2
// 4
// Alex Johnson
// 90
// Emily Davis
// 82
// Michael White
// 95
// Olivia Brown
// 78
// Sample Output 2

// Student details:
// Name: Alex Johnson, Score: 90
// Name: Emily Davis, Score: 82
// Name: Michael White, Score: 95
// Name: Olivia Brown, Score: 78
// Sample Input 3
// 1
// Samantha Miller
// 97
// Sample Output 3

// Student details:
// Name: Samantha Miller, Score: 97

import java.util.ArrayList;
import java.util.Scanner;

class Student
{
	String name;
	int marks;
	
	Student(String name,int marks){
		 this.name = name;
		 this.marks = marks;
		 
		}
	
}
public class Program {

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       
       int numberOfStudents = sc.nextInt();
       sc.nextLine();
        
        
       ArrayList<Student> list = new ArrayList<>();
       for(int i=0;i<numberOfStudents;i++){
       	  String name = sc.nextLine();
       	  
       	  
       	  int marks = sc.nextInt();
       	  sc.nextLine();
       	  
       	  list.add(new Student(name,marks));
       	
       	}
       	
        System.out.println("Student details:");
       	for(Student stu : list){
       		   System.out.println("Name: "+stu.name+", Score: "+stu.marks);
       		
       		} 
    
}

}