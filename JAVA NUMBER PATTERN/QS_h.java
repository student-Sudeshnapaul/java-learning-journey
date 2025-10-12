import java.util.Scanner;
public class QS_h {
    public static void main( String [] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the range: ");
        int n= sc.nextInt();
        for(int i=n; i>=1; i--) {
            for(int j=n; j>=i; j--) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}