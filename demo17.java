import java.util.Scanner;
public class demo17{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int ones, tens;
        System.out.println("enter 2 digit number: " );
        int number = scanner.nextInt();
        ones = number%10;
        tens = number/10;
        int sum = tens+ones;
        System.out.println("sum of numbers at ones n tens place is: " + sum);
        scanner.close();
    }
}