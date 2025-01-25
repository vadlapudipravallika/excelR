//largest num among 3
import java.util.Scanner;
public class Demo036 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter 1st numbers: ");
        int num1 = scanner.nextInt();
        System.out.println("enter 2nd number: ");
        int num2 = scanner.nextInt();
        System.out.println("enter 3rd number: ");
        int num3 = scanner.nextInt();
        if (num1 > num2) {
            System.out.println(num1 +" is largest");
        } else if (num3 > num1) {
            System.out.println(num3 + " is largest");
        } else if (num2 > num3) {
            System.out.println(num2 + " is largest");
        } else {
            System.out.println("error");
        }
    }
}
