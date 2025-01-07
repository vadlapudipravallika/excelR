public class demo15{
    public static void main(String[] args) {
        int a = 10;
        int b = 9;
        System.out.println("number1 before swapping: " + a);
        System.out.println("number2 before swapping: " + b);
        int temp = a;
        a = b;
        b = temp;
        System.out.println("number1 after swapping: " + a);
        System.out.println("number2 after swapping: " + b);


    }
}