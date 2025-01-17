// // Online Shopping Cart Simulation


// Implement a dynamic shopping cart program. The program should allow users to input items with their respective quantities and prices dynamically. 
// The shopping cart should display the contents of the items added and calculate the total cost. The program continues to prompt the user for item details until the user decides to exit by typing "exit."

// Hints
// Use a linked list structure to store shopping cart items. Dynamically prompt the user for input using a loop. Implement methods to add items to the cart, display the cart contents, and calculate the total cost.
// Constraints
// Item names can contain alphabets and spaces. Quantities and prices are positive integers and positive floating-point numbers, respectively.
// Sample Input 1
// Laptop
// 2
// 1200.00
// Headphones
// 1
// 80.00
// Notebook
// 3
// 5.50
// exit
// Sample Output 1
// Shopping Cart Contents:
// Item: Laptop, Quantity: 2, Price: $1200.0
// Item: Headphones, Quantity: 1, Price: $80.0
// Item: Notebook, Quantity: 3, Price: $5.5
// Total Cost: $2496.5
// Sample Input 2
// T-shirt
// 5
// 15.50
// Sunglasses
// 2
// 40.00
// Shoes
// 1
// 80.00
// exit
// Sample Output 2
// Shopping Cart Contents:
// Item: T-shirt, Quantity: 5, Price: $15.5
// Item: Sunglasses, Quantity: 2, Price: $40.0
// Item: Shoes, Quantity: 1, Price: $80.0
// Total Cost: $237.5
// Sample Input 3
// Coffee Mug
// 4
// 8.75
// Mouse
// 3
// 25.50
// Keyboard
// 2
// 50.00
// exit
// Sample Output 3
// Shopping Cart Contents:
// Item: Coffee Mug, Quantity: 4, Price: $8.75
// Item: Mouse, Quantity: 3, Price: $25.5
// Item: Keyboard, Quantity: 2, Price: $50.0
// Total Cost: $211.5

import java.util.Scanner;
import java.util.*;

class ShoppingCartItem {
       String name;
       int quantity;
       double price;

       ShoppingCartItem(String name,int quantity,double price)
       {
           this.name = name;
           this.quantity = quantity;
           this.price = price;
       }
}
class ShoppingCart {
     double total = 0.0;
     ArrayList<ShoppingCartItem> list = new ArrayList<>();
    // Method to add a new item to the shopping cart
    public void addItem(ShoppingCartItem item) {
    	   total += (item.quantity * item.price);
           list.add(item);
    }

    public void displayItem()
    {
        for(ShoppingCartItem ite : list)
        {
            System.out.println("Item: "+ite.name+", Quantity: "+ite.quantity+", Price: $"+ite.price);
        }
        System.out.println("Total Cost: $"+total);
    }
}

public class Program {
    public static void main(String[] args) {
        ShoppingCart shoppingCart = new ShoppingCart();
        Scanner scanner = new Scanner(System.in);

        while (true)
        {
            String name = scanner.nextLine();

            if(name.equals("exit"))
            {
                System.out.println("Shopping Cart Contents:");
                shoppingCart.displayItem();
                break;
            }
            else {
                int quantity = scanner.nextInt();
                scanner.nextLine();

                double price = scanner.nextDouble();
                scanner.nextLine();

                shoppingCart.addItem(new ShoppingCartItem(name, quantity, price));
            }
        }
        scanner.close();
    }
}