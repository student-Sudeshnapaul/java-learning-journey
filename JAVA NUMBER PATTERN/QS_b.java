import java.util.Scanner;
public class QS_b{
    public static void main(String [] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the range: ");
        int n= sc.nextInt();
        int i=n;
        while(i>=1) {
            int j=i;
            while(j>=1) {
                System.out.print(j);
                j--;
            }
            System.out.println("\n");
            i--;
        }
    }
}