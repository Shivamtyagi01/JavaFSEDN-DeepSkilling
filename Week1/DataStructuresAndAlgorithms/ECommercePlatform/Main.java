package Week1.DataStructuresAndAlgorithms.ECommercePlatform;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Product[] products = {
            new Product(1, "Laptop", "Electronics"),
            new Product(2, "Shirt", "Clothing"),
            new Product(3, "Shoes", "Footwear"),
            new Product(4, "Mobile", "Electronics"),
            new Product(5, "Watch", "Accessories")
        };

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter product name to search: ");
        String target = sc.nextLine();

       
        Product linearResult = LinearSearch.search(products, target);
        if(linearResult != null)
        {
            System.out.println("Linear Search Result: " + linearResult);
        }else{
            System.out.println("Not found");
        }
        

        BinarySearch.sortProducts(products);
        Product binaryResult = BinarySearch.search(products, target);
        if(linearResult != null)
        {
            System.out.println("Binary Search Result: " + binaryResult);
        }else{
            System.out.println("Not found");
        }
        
    }
}
