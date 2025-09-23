import java.util.Scanner;
public class Tan {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter angle A in degrees: ");
        double Adeg = sc.nextDouble();
        System.out.print("Enter angle B in degrees: ");
        double Bdeg = sc.nextDouble();
        double Arad = (Math.PI/180) * Adeg;
        double Brad = (Math.PI/180) * Bdeg;
        double tanA = Math.tan(Arad);
        double tanB = Math.tan(Brad);
        double result = (tanA - tanB) / (1 + tanA * tanB);
        System.out.println("Tan(A - B) = " + result);
        sc.close();
    }
}