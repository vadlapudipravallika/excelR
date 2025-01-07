import java.util.Scanner;

public class demo12{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the radius of the circle");
        double radius = scanner.nextDouble();
          double area = Math.PI * radius * radius;
          System.out.println("the area of circle is: " + area);
          scanner.close();


    }
}