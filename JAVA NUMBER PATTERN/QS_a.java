import java.util.Scanner;
public class QS_a {
    public static void main(String [] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the range: ");
        int n= sc.nextInt();
        int i=1;
        while(i<=n) {
            int j=1;
            while(j<=i) {
                System.out.print(j);
                j++;
            }
            System.out.print("\n");
            i++;
        }
    }
}