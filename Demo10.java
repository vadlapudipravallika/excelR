import java.util.Scanner;

class UserInput {
    // Method to accept user details
    public String getUserDetails() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character
        return "Name: " + name + ", Age: " + age;
    }
}

class UserOutput {
    // Method to display user details
    public void displayUserDetails(String details) {
        System.out.println("User Details: " + details);
    }
}

public class Demo10 {
    public static void main(String[] args) {
        UserInput userInput = new UserInput();
        UserOutput userOutput = new UserOutput();
        
        // Calling methods in main
        String userDetails = userInput.getUserDetails();
        userOutput.displayUserDetails(userDetails);
    }
}
