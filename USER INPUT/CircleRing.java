import java.util.Scanner;
public class CircleRing{
public static void main(String [] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter R1 : ");
    double r1 = sc.nextDouble();
    System.out.println("Enter R2 : ");
    double r2 = sc.nextDouble();
    double Circumference = 2*Math.PI*(r1+r2);
    double area = Math.PI * (r1 * r1 - r2 * r2);
     System.out.println("Outer Radius: " + r1 + " cm");
        System.out.println("Inner Radius: " + r2 + " cm");
        System.out.println("Circumference of Ring: " + Circumference + " cm");
        System.out.println("Area of Ring: " + area + " sq.cm");
        sc.close();
}
}