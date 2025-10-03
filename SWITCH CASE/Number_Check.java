import java.util.Scanner;
public class Number_Check {
    public static void main( String [] args) {
        Scanner sc = new Scanner(System.in);
        while(true){
        System.out.println("Press Button...\n1. For Odd-Even Check.\n2. For Prime-composite.\n3. For exit...");
        System.out.println("Enter your choice:\n");
        int choice= sc.nextInt();
        switch(choice) {
            case 1:
                      System.out.println("Enter any number to check Even-Odd: ");
                      int x= sc.nextInt();
                      if( x%2 == 0){
                          System.out.println(x+" is an Even number.");
                      }
                      else {
                          System.out.println(x+" is an Odd number.");
                      }
                      break;
            case 2:
                      System.out.println("Enter any number to check Prime-Composite: ");
                      int y= sc.nextInt();
                      if(y<=1){
                          System.out.println("The number is neither a Prime nor a Composite..."); 
                      }
                      else {
                          int i= 2;
                          int c=0;
                          while(i<=Math.sqrt(y)){
                                if(y%i == 0){
                                    c++;
                                }
                                i++;
                            }
                          if(c>=2)
                          {
                              System.out.println(y+" is a Composite Number.");
                          }
                          else {
                              System.out.println(y+" is a Prime Number.");
                          }
                      }
                      break;
            case 3:
                System.out.println("Exiting program...");
                    sc.close();
                return;
            default:
                System.out.println("Invalid choice! Please choose 1, 2, or 3.");
        }
    }
    
    }
}