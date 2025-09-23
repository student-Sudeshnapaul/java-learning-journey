import java.util.Scanner;
public class RectangleProperties {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the length of rectangle: ");
    double length = sc.nextDouble();
    System.out.println("Enter the width of rectangle: ");
    double width = sc.nextDouble();
    double area = length*width;
    System.out.println("The Area = "+area);
    double perimeter = 2*(length+width);
    System.out.println("The Perimeter = "+perimeter);
    double diagonal = Math.sqrt((length*length)+(width*width));
    System.out.println("The Diagonal = "+diagonal);
    sc.close();
}
}