import java.util.Scanner;
public class demo13{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the length of triangle");
        double height = scanner.nextDouble();
        System.out.println("enter the base of triangle");
        double base = scanner.nextDouble();
        double area = 0.5*height*base;
        System.out.println("area of the triangle is: " +  area);
        scanner.close();
    }
}