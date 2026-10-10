import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        // Create a Scanner object to take input from the user
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();
        
        // Step 1: Use StringBuilder to create a new string that is a reverse of the input string
        String reversedString = new StringBuilder(inputString).reverse().toString();
        
        // Step 2 & 3: Use the equals() method to check if they are the same and print the result
        if (inputString.equals(reversedString)) {
            System.out.println("The input string is a palindrome.");
        } else {
            System.out.println("The input string is not a palindrome.");
        }
        
        // Close the scanner
        scanner.close();
    }
}
