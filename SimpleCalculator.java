import java.util.Scanner;
public class SimpleCalculator {
    public static void main(String [] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter first number: ");
        float a= sc.nextInt();
        float b= sc.nextInt();
        float sum=a+b;
        float sub=a-b;
        float mul=a*b;
        float div=a/b;
        float rem=a%b;
        System.out.println("The Sum is= "+sum);
        System.out.println("The Subtraction is= "+sub);
        System.out.println("The Multiplication is= "+mul);
        System.out.println("The Division is= "+div);
        System.out.println("The Remainder is= "+rem);
    }
}