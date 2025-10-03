import java.util.Scanner;
public class DivisibilityCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        if(num % 2 == 0 && num % 5 == 0) {
            System.out.println("The number is divisible by both 2 and 5.");
        }
        else if(num% 2 == 0 && num%5 != 0) {
           System.out.println("The number is divisible by 2 but not by 5."); 
        }
        else if(num%5 == 0 && num%2 != 0) {
            System.out.println("The number is divisible by 5 but not by 2.");
        }
        else {
           System.out.println("The number is not divisible by both 2 and 5."); 
        }
        sc.close();
    }
}