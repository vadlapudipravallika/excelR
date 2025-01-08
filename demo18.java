import java.util.Scanner;
public class demo18{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter a number: ");
        int number = scanner.nextInt();
        int near = ((number+50)/100)*100;
        System.out.println("round off to nearest multiple of 100: " + near );
        scanner.close();
    }
}