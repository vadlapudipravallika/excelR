//wjp to check 1st character is a vowel or string
import java.util.Scanner;
public class Demo083 {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       System.out.println("enter a word: ");
       String word = scanner.nextLine();
       char ch = word.charAt(0);
       if( ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
           System.out.println("it is vowel");
       } else {
        System.out.println("it is a consonant");
       }
    }
}
