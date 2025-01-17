// Animal Registration System using Single Inheritance

// Develop an animal registration system using Single Inheritance. The system should allow users to register dogs by entering their name and breed. 
// To achieve this, you need to implement a Java code that takes input from the user as the name of the dog and its breed, separated by a space. 
// The code should then create a Dog object, set the name and breed using setter methods, and display the dog details on a single line using the getter methods.
//  Please provide only the name and breed of the dog.
//  Display the alert message as "Invalid input. Only two inputs (name and breed) are allowed." for the invalid number of inputs.
//  Print the alert message " Invalid input. Please provide both the name and breed of the dog. " for the insufficient input.

// Hints
// Remember to split the input and validate the number of inputs. Use single inheritance
// Constraints
// The name and breed of the dog should be non-empty strings
// Sample Input 1
// Jimmy Bulldog
// Sample Output 1
// Dog details: Name = Jimmy, Breed = Bulldog
// Sample Input 2
// Jimmy Bulldog 001
// Sample Output 2
// Invalid input. Only two inputs (name and breed) are allowed.
// Sample Input 3
// jimmy
// Sample Output 3
// Invalid input. Please provide both the name and breed of the dog.

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */

class Dog
{
   private	String name;
   private String breed;
   
   Dog(String name,String breed)
   {
   	this.name = name;
   	this.breed = breed;
   }
   
   public void setname(String name)
   {
   	  this.name = name;
   }
   
   public void setbreed(String breed)
   {
   	  this.breed = breed;
   }
   
   public String getname()
   {
   	 return name;
   }
   
   public String getbreed()
   {
   	 return breed;
   }
	
}
class Program
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine().trim();
		String[] str = input.split(" ");
		
		if(str.length > 2)
		{
			System.out.println("Invalid input. Only two inputs (name and breed) are allowed.");
		}
		else if(str.length == 1)
		{
				System.out.println("Invalid input. Please provide both the name and breed of the dog.");
		}
		else
		{
			String name = str[0];
			String breed = str[1];
				Dog d = new Dog(name,breed);
				d.setname(name);
				d.setbreed(breed);
			  System.out.println("Dog details: Name = "+d.getname()+", Breed = "+d.getbreed());	
			
		}
		
		sc.close();
	}
}