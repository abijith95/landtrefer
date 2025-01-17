// MOVIE AGE CALCULATOR

// Create a Java program to manage movie details. 
// Each movie has a title, director, and release year. 
// Your program should calculate and display the age of each movie based on the provided release year and the current year. 
// Write a Java program with appropriate classes and methods to achieve this.

// Hints
// Consider creating a Movie class with methods to calculate the age of the movie and display its information. Utilize a current year variable for accurate age calculation.
// Constraints
// The release year should be between 1888 and 2024 (inclusive). The input should be taken from the user.
// Sample Input 1
// 2022
// Inception
// Christopher Nolan
// 2010
// The Shawshank Redemption
// Frank Darabont
// 1994
// Avengers: Endgame
// Anthony and Joe Russo
// 2019
// Sample Output 1

// Movies Information:
// Title: Inception
// Director: Christopher Nolan
// Release Year: 2010
// Age of the Movie: 12 years

// Title: The Shawshank Redemption
// Director: Frank Darabont
// Release Year: 1994
// Age of the Movie: 28 years

// Title: Avengers: Endgame
// Director: Anthony and Joe Russo
// Release Year: 2019
// Age of the Movie: 3 years

// Sample Input 2
// 2021
// Tenet
// Christopher Nolan
// 2020
// The Godfather
// Francis Ford Coppola
// 1972
// La La Land
// Damien Chazelle
// 2016
// Sample Output 2

// Movies Information:
// Title: Tenet
// Director: Christopher Nolan
// Release Year: 2020
// Age of the Movie: 1 years

// Title: The Godfather
// Director: Francis Ford Coppola
// Release Year: 1972
// Age of the Movie: 49 years

// Title: La La Land
// Director: Damien Chazelle
// Release Year: 2016
// Age of the Movie: 5 years

// Sample Input 3
// 2023
// Pulp Fiction
// Quentin Tarantino
// 1994
// The Dark Knight
// Christopher Nolan
// 2008
// Jurassic Park
// Steven Spielberg
// 1993
// Sample Output 3

// Movies Information:
// Title: Pulp Fiction
// Director: Quentin Tarantino
// Release Year: 1994
// Age of the Movie: 29 years

// Title: The Dark Knight
// Director: Christopher Nolan
// Release Year: 2008
// Age of the Movie: 15 years

// Title: Jurassic Park
// Director: Steven Spielberg
// Release Year: 1993
// Age of the Movie: 30 years


import java.util.ArrayList;
import java.util.Scanner;

class Movie {
    private String title;
    private String director;
    private String releaseYear;
    // Constructor for initializing movie details
    public Movie(String title, String director, String releaseYear) {
        this.title = title;
        this.director = director;
        this.releaseYear = releaseYear; 
    }
    // Calculate and return the age of the movie
    public int calculateMovieAge(int currentYear) {
    	int ryear = Integer.parseInt(releaseYear);
        return currentYear - ryear;
        
    }

    // Display movie information along with age
    public void displayMovieInfo(int currentYear) {
        System.out.println("Title: " + title);
       
        System.out.println("Director: " + director);
        System.out.println("Release Year: " + releaseYear);
        System.out.println("Age of the Movie: " + calculateMovieAge(currentYear) + " years");
    }
}

public class Program {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the current year
       // System.out.print("Enter the current year: ");
        int currentYear = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        // Create an ArrayList to store Movie objects
        ArrayList<Movie> movies = new ArrayList<>();

        // Prompt users to enter details for three movies
        for (int i = 1; i <= 3; i++) {
           // System.out.print("Enter Movie " + i + "'s Title: ");
            String title = scanner.nextLine();

           // System.out.print("Enter Movie " + i + "'s Director: ");
            String director = scanner.nextLine();

           // System.out.print("Enter Movie " + i + "'s Release Year: ");
            String releaseYear = scanner.nextLine();
            // scanner.nextLine(); // Consume the newline character

            // Create Movie object using constructor
            Movie movie = new Movie(title, director, releaseYear);

            // Add Movie object to the ArrayList
            movies.add(movie);
        }
        // Display information about each movie along with age
        System.out.println("\nMovies Information:");

        for (Movie movie : movies) {
            movie.displayMovieInfo(currentYear);
            System.out.println(); // Add a newline for better readability
        }

        // Close the scanner
        scanner.close();    
        }
}
