import java.util.Scanner;
public class SumOfFourNumbers {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter first Number: ");
        int num1= sc.nextInt();
        System.out.println("Enter second Number: ");
        int num2= sc.nextInt();
        System.out.println("Enter third Number: ");
        int num3= sc.nextInt();
        System.out.println("Enter fourth Number: ");
        int num4= sc.nextInt();
        int sum= num1 + num2 + num3 + num4;
        System.out.println("The Sum is: "+sum);
        sc.close();
    }
}