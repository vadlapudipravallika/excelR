
import java.util.Scanner;

//largest among 2 numbers
public class Demo035 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter 1st number: ");
        int num1 = scanner.nextInt();
        System.out.println("enter 2nd number: ");
        int num2 = scanner.nextInt();
        if (num1 > num2) {
            System.out.println("num1 is largest");
        } else {
            System.out.println("num2 is largest");
        }
    }
}
