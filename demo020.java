import java.util.Scanner;

public class demo020{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter a number: ");
        int number = scanner.nextInt();
        if(number%3 == 0 && number%5 == 0) {
            System.out.println("fizzbizz");
        }else if(number%5 == 0){
            System.out.println("bizz");
        }else if(number%3 == 0){
            System.out.println("fizz");
        }else{
            return;
        }
    }
}