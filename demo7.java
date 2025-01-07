import java.util.Scanner;
public class demo7{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter name: ");
        String name = scanner.nextLine();
        System.out.print("Enter phone number: ");
        long phno = scanner.nextLong();
        System.out.print("Enter age: ");
        int age = scanner.nextInt();
        scanner.close();
    }
}