//Bus Ticket:::::::::::::::::::::::::::


// Write a Java program to simulate a seat booking system.
// The system should have the following features:
// There are 20 seats available initially. Users should be presented with four options: 
// 1) Ticket booking
// 2) Cancel booking
// 3) View available seats
// 4) Exit.
// If a user chooses option 1, they should be able to book a seat if any are available. 
// If all seats are booked, the system should display a message “Sorry, all seats are booked!”.
// If a user chooses option 2, they should be able to cancel a booking if they have made one. 
// If no bookings have been made, the system should display a message “No bookings to cancel!”.
// If a user chooses option 3, the system should display all available seats.
// If a user chooses option 4, the system should exit.
// If a user enters an invalid choice, the system should display a message “Invalid choice!”.

// Hints
// Switch case,Conditional Statements Boolean array
// Constraints
// The seat number entered by the user should be between 1 and the total number of available seats.
// Sample Input 1
// 1 1 
// 1 2
// 1 1
// 2 2 
// 2 19
// 3
// 4
// Sample Output 1
// Seat 1 booked successfully!
// Seat 2 booked successfully!
// Sorry, this seat is already booked!
// Booking for seat 2 cancelled successfully!
// This seat is not booked!
// Available seats: 
// 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20 


import java.util.Scanner;

class Program {
	static int totalseats = 20;
    static boolean[] seats = new boolean[totalseats];
    
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	int choice;
    	do{
    	    choice = sc.nextInt();
    		switch(choice)
    		{
    			case 1:
    				bookseats(sc);
    				break;
    			case 2:
    				cancelseats(sc);
    				break;
    			case 3:
    				availableseats(sc);
    				break;
    		    case 4:
    		    	break;
    		    default:
    		        System.out.println("Invalid choice!");
    		        break;
    		}	
    	}while(choice != 4);
    	
    }	
    	public static void bookseats(Scanner sc)
    	{
    		int seatnumber = sc.nextInt();
    		
    		if(seatnumber < 1 && seatnumber >= 20)
    		{
    			System.out.println("Invalid choice!");
    		}
    		else if(seats[seatnumber-1])
    		{
    		System.out.println("Sorry, this seat is already booked!");
    		}
    		else{
    		   seats[seatnumber-1] = true;
    		   System.out.println("Seat "+seatnumber+" booked successfully!");
    		}
    	}
    	
    	
    	public static void cancelseats(Scanner sc)
    	{
    		int seatnumber = sc.nextInt();
    		
    		if(seatnumber < 1 && seatnumber >= totalseats)
    		{
    			System.out.println("Invalid choice!");
    		}
    		else if(seats[seatnumber - 1])
    		{
    			seats[seatnumber-1] = false;
    			System.out.println("Booking for seat "+seatnumber+" cancelled successfully!");
    		}
    		else{
    		   System.out.println("This seat is not booked!");	
    		}
    	}
    	
    	public static void availableseats(Scanner sc)
    	{
    		boolean available = false;
    		System.out.println("Available seats: ");
    		for(int i=0;i<20;i++)
    		{
    		if(!seats[i])
    		{
    			System.out.print((i+1)+" ");
    			available = false;
    		}
    		
    		}
    	

        }
    }



