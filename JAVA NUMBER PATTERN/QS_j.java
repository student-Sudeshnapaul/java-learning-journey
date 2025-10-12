import java.util.Scanner;
public class QS_j {
    public static void main( String [] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the range: ");
        int n= sc.nextInt();
        int k=n;
        for(int i=1;i<=n;i++) {
            for(int j=1;j<=i;j++) {
                System.out.print(k);
            }
            System.out.println();
            k--;
        }
    }
}