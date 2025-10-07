import java.util.Scanner;
public class QS_c {
    public static void main(String [] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the range: ");
        int n=sc.nextInt();
        int i=n;
        while(i>=1) {
            int j=1;
            while(j<=i) {
                System.out.print(j);
                j++;
            }
            System.out.println("\n");
            i--;
        }
    }
}