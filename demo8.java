import java.util.Scanner;
public class demo8{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String loginid;
        String pwd;
        String reply;
        do { 
            System.out.println("welcome to malla reddy university");
            System.out.println("have you visited our website earlier");
            reply  = scanner.nextLine();
            if(reply == "no") {
                System.out.println("login here");
                System.out.println("enter your id and password");
                loginid = scanner.nextLine();
                pwd = scanner.nextLine();
            }else
            System.out.println("you are our valued user");
        } while ((loginid == "Pravallika") && (pwd == "pravallika@123"));
    }
}