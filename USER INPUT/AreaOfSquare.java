import java.util.Scanner;
public class AreaOfSquare {
    public static void main(String [] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the Side of the Square: ");
        float s= sc.nextFloat();
        float area=s*s;
        System.out.println("Area= "+ area);
    }
}