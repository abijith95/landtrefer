//Display the Product list using Linked List in Java


// For this problem you have to perform the following tasks: 
// 1: Create a model class as Product with product_id, name, price and rating as its properties. 
// 2: Create a List, L of type Product . 
// 3: Populate your collection L with N number of products i.e. (an array of Product objects) 
// 4: Define separate methods to sort the user defined collection L based on the product’s rating value, product_id and product name. (Hint: Using Comparable / Comparator) 
// 5: Display the sorted collection using an iterator.  
// Input Format :
// The first line of input contains a single integer N denoting the number of objects. 
// The subsequent line contain an integer denoting product_id.
// The subsequent line contain a string denoting name. 
// The subsequent line contain a double denoting price. 
// The subsequent line contain a integer denoting rating in scale of 1-5.
//  Repeat the above step for N number of Objects.
// The last line contains a number x denoting the choice of sorting as below.
// 1.SortById 
// 2.SortByName 
// 3.SortByRating .
// Print "Invalid choice" for the invalid input for choice option.

// Hints
// None
// Constraints
// Solve the problem using Linked List only. Output Format :Displays the product list as per sorting order selected.
// Sample Input 1
// 3
// 101
// Laptop
// 800.50
// 5
// 102
// Phone
// 400.75
// 4
// 103
// Tablet
// 300.20
// 3
// 1
// Sample Output 1
// Sort by Product_id :
// 101 Laptop 800.5 5
// 102 Phone 400.75 4
// 103 Tablet 300.2 3
// Sample Input 2
// 3
// 101
// Laptop
// 800.50
// 5
// 102
// Phone
// 400.75
// 4
// 103
// Tablet
// 300.20
// 3
// 2
// Sample Output 2
// Sort by rating in descending order:
// 101 Laptop 800.5 5
// 102 Phone 400.75 4
// 103 Tablet 300.2 3
// Sample Input 3
// 3
// 101
// Laptop
// 800.50
// 5
// 102
// Phone
// 400.75
// 4
// 103
// Tablet
// 300.20
// 3
// 3
// Sample Output 3
// Sort by Name:
// 101 Laptop 800.5 5
// 102 Phone 400.75 4
// 103 Tablet 300.2 3
// Sample Input 4
// 3
// 101
// Laptop
// 800.50
// 5
// 102
// Phone
// 400.75
// 4
// 103
// Tablet
// 300.20
// 3
// 4
// Sample Output 4
// Invalid choice

import java.util.*;

class Product implements Comparable<Product> {
    int product_id;
    String name;
    double price;
    int rating;

    
    public Product(int product_id, String name, double price, int rating) {
        this.product_id = product_id;
        this.name = name;
        this.price = price;
        this.rating = rating;
    }

    @Override
    public int compareTo(Product other) {
        return Integer.compare(this.product_id, other.product_id);
    }

    @Override
    public String toString() {
        return product_id + " " + name + " " + price + " " + rating;
    }
}

class SortByName implements Comparator<Product> {
    public int compare(Product p1, Product p2) {
        return p1.name.compareTo(p2.name);
    }
}

class SortByRating implements Comparator<Product> {
    public int compare(Product p1, Product p2) {
        return Integer.compare(p2.rating, p1.rating); // Descending order
    }
}

public class Program {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        LinkedList<Product> productList = new LinkedList<>();

        int N = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < N; i++) {
            int product_id = scanner.nextInt();
            scanner.nextLine(); 
            String name = scanner.nextLine();
            double price = scanner.nextDouble();
            int rating = scanner.nextInt();
            scanner.nextLine(); 

            
            productList.add(new Product(product_id, name, price, rating));
        }

        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                Collections.sort(productList);
                System.out.println("Sort by Product_id :");
                break;
            case 2:
            	Collections.sort(productList, new SortByRating());
                System.out.println("Sort by rating in descending order:");
                break;
               
            case 3:
            	 Collections.sort(productList, new SortByName());
                System.out.println("Sort by Name:");
                break;
                
            default:
                System.out.println("Invalid choice");
                return;
        }

        Iterator<Product> iterator = productList.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}