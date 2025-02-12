import java.util.Scanner;
class Prime{
    boolean isPrime(int x){
        if (x <= 1)
            return false;   
        for (int i = 2 ; i < x ; i++){
            if (x % i == 0)
            return false;
        }          
        return true;  
    }
}
public class Demo027 {
    public static void main(String[] args) {
        Prime obj = new Prime();
        System.out.println("print a number");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        boolean ans = obj.isPrime(num);
        if (ans == true) 
        System.out.println("its a prime");
        else
        System.out.println("not a prime");
}
}